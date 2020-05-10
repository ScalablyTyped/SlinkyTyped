package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDirectoryBackupAttributes extends js.Object {
  /**
    * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
}

object ActiveDirectoryBackupAttributes {
  @scala.inline
  def apply(): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
  @scala.inline
  implicit class ActiveDirectoryBackupAttributesOps[Self <: ActiveDirectoryBackupAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: ActiveDirectoryFullyQualifiedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
  }
  
}

