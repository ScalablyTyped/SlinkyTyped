package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageRequest extends StObject {
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Sets the direction the page image is rotated. The possible settings are: left or right
    */
  var rotate: js.UndefOr[String] = js.native
}
object PageRequest {
  
  @scala.inline
  def apply(): PageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRequest]
  }
  
  @scala.inline
  implicit class PageRequestMutableBuilder[Self <: PageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
  }
}
