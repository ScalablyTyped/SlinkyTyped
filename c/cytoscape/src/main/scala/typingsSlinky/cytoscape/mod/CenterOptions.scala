package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CenterOptions extends StObject {
  
  var eles: CollectionArgument | Selector = js.native
}
object CenterOptions {
  
  @scala.inline
  def apply(eles: CollectionArgument | Selector): CenterOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterOptions]
  }
  
  @scala.inline
  implicit class CenterOptionsMutableBuilder[Self <: CenterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEles(value: CollectionArgument | Selector): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
  }
}
