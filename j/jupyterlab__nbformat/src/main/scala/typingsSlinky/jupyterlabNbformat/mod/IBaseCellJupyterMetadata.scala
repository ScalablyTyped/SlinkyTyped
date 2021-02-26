package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseCellJupyterMetadata extends PartialJSONObject {
  
  /**
    * Whether the source is hidden.
    */
  var source_hidden: Boolean = js.native
}
object IBaseCellJupyterMetadata {
  
  @scala.inline
  def apply(source_hidden: Boolean): IBaseCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellJupyterMetadata]
  }
  
  @scala.inline
  implicit class IBaseCellJupyterMetadataMutableBuilder[Self <: IBaseCellJupyterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource_hidden(value: Boolean): Self = StObject.set(x, "source_hidden", value.asInstanceOf[js.Any])
  }
}
