package typingsSlinky.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Isauto extends StObject {
  
  var is_auto: Boolean = js.native
}
object Isauto {
  
  @scala.inline
  def apply(is_auto: Boolean): Isauto = {
    val __obj = js.Dynamic.literal(is_auto = is_auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isauto]
  }
  
  @scala.inline
  implicit class IsautoMutableBuilder[Self <: Isauto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs_auto(value: Boolean): Self = StObject.set(x, "is_auto", value.asInstanceOf[js.Any])
  }
}
