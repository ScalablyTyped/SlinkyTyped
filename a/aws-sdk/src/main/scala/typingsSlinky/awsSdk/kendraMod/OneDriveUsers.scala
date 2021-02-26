package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneDriveUsers extends StObject {
  
  /**
    * A list of users whose documents should be indexed. Specify the user names in email format, for example, username@tenantdomain. If you need to index the documents of more than 100 users, use the OneDriveUserS3Path field to specify the location of a file containing a list of users.
    */
  var OneDriveUserList: js.UndefOr[typingsSlinky.awsSdk.kendraMod.OneDriveUserList] = js.native
  
  /**
    * The S3 bucket location of a file containing a list of users whose documents should be indexed.
    */
  var OneDriveUserS3Path: js.UndefOr[S3Path] = js.native
}
object OneDriveUsers {
  
  @scala.inline
  def apply(): OneDriveUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneDriveUsers]
  }
  
  @scala.inline
  implicit class OneDriveUsersMutableBuilder[Self <: OneDriveUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneDriveUserList(value: OneDriveUserList): Self = StObject.set(x, "OneDriveUserList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneDriveUserListUndefined: Self = StObject.set(x, "OneDriveUserList", js.undefined)
    
    @scala.inline
    def setOneDriveUserListVarargs(value: OneDriveUser*): Self = StObject.set(x, "OneDriveUserList", js.Array(value :_*))
    
    @scala.inline
    def setOneDriveUserS3Path(value: S3Path): Self = StObject.set(x, "OneDriveUserS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneDriveUserS3PathUndefined: Self = StObject.set(x, "OneDriveUserS3Path", js.undefined)
  }
}
