package typingsSlinky.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsPhantom extends StObject {
  
  var isPhantom: Boolean = js.native
}
object IsPhantom {
  
  @scala.inline
  def apply(isPhantom: Boolean): IsPhantom = {
    val __obj = js.Dynamic.literal(isPhantom = isPhantom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPhantom]
  }
  
  @scala.inline
  implicit class IsPhantomMutableBuilder[Self <: IsPhantom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPhantom(value: Boolean): Self = StObject.set(x, "isPhantom", value.asInstanceOf[js.Any])
  }
}
