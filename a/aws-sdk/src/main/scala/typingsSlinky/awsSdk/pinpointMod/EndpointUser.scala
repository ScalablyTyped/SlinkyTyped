package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointUser extends js.Object {
  
  /**
    * One or more custom attributes that describe the user by associating a name with an array of values. For example, the value of an attribute named Interests might be: ["Science", "Music", "Travel"]. You can use these attributes as filter criteria when you create segments. Attribute names are case sensitive. An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain these characters. This restriction doesn't apply to attribute values.
    */
  var UserAttributes: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The unique identifier for the user.
    */
  var UserId: js.UndefOr[string] = js.native
}
object EndpointUser {
  
  @scala.inline
  def apply(): EndpointUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointUser]
  }
  
  @scala.inline
  implicit class EndpointUserOps[Self <: EndpointUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserAttributes(value: MapOfListOfString): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("UserAttributes", js.undefined)
    
    @scala.inline
    def setUserId(value: string): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
