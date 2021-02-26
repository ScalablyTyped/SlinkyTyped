package typingsSlinky.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KikUser extends StObject {
  
  var firstName: String = js.native
  
  var fullName: String = js.native
  
  var lastName: String = js.native
  
  var pic: String = js.native
  
  var thumbnail: String = js.native
  
  var username: String = js.native
}
object KikUser {
  
  @scala.inline
  def apply(
    firstName: String,
    fullName: String,
    lastName: String,
    pic: String,
    thumbnail: String,
    username: String
  ): KikUser = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikUser]
  }
  
  @scala.inline
  implicit class KikUserMutableBuilder[Self <: KikUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
