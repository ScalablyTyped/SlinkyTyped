package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlRecord extends StObject {
  
  var Url: String = js.native
  
  var UserList: SafeArray[UserRecord] = js.native
}
object UrlRecord {
  
  @scala.inline
  def apply(Url: String, UserList: SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any], UserList = UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRecord]
  }
  
  @scala.inline
  implicit class UrlRecordMutableBuilder[Self <: UrlRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserList(value: SafeArray[UserRecord]): Self = StObject.set(x, "UserList", value.asInstanceOf[js.Any])
  }
}
