package typingsSlinky.rbx.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsElementType extends StObject {
  
  var as: ReactElement = js.native
}
object AsElementType {
  
  @scala.inline
  def apply(as: ReactElement): AsElementType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsElementType]
  }
  
  @scala.inline
  implicit class AsElementTypeMutableBuilder[Self <: AsElementType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
