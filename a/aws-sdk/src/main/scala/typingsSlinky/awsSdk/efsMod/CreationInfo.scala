package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreationInfo extends js.Object {
  /**
    * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerGid: typingsSlinky.awsSdk.efsMod.OwnerGid = js.native
  /**
    * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerUid: typingsSlinky.awsSdk.efsMod.OwnerUid = js.native
  /**
    * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
    */
  var Permissions: typingsSlinky.awsSdk.efsMod.Permissions = js.native
}

object CreationInfo {
  @scala.inline
  def apply(OwnerGid: OwnerGid, OwnerUid: OwnerUid, Permissions: Permissions): CreationInfo = {
    val __obj = js.Dynamic.literal(OwnerGid = OwnerGid.asInstanceOf[js.Any], OwnerUid = OwnerUid.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationInfo]
  }
  @scala.inline
  implicit class CreationInfoOps[Self <: CreationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerGid(value: OwnerGid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerGid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUid(value: OwnerUid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerUid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: Permissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

