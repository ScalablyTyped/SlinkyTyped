package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryServiceAuthentication extends js.Object {
  /**
    * The ID of the Active Directory used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.native
}

object DirectoryServiceAuthentication {
  @scala.inline
  def apply(): DirectoryServiceAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryServiceAuthentication]
  }
  @scala.inline
  implicit class DirectoryServiceAuthenticationOps[Self <: DirectoryServiceAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
  }
  
}

