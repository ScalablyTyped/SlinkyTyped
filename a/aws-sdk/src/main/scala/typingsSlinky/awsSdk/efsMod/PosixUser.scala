package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosixUser extends js.Object {
  /**
    * The POSIX group ID used for all file system operations using this access point.
    */
  var Gid: typingsSlinky.awsSdk.efsMod.Gid = js.native
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point.
    */
  var SecondaryGids: js.UndefOr[typingsSlinky.awsSdk.efsMod.SecondaryGids] = js.native
  /**
    * The POSIX user ID used for all file system operations using this access point.
    */
  var Uid: typingsSlinky.awsSdk.efsMod.Uid = js.native
}

object PosixUser {
  @scala.inline
  def apply(Gid: Gid, Uid: Uid): PosixUser = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixUser]
  }
  @scala.inline
  implicit class PosixUserOps[Self <: PosixUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGid(value: Gid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Uid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryGids(value: SecondaryGids): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryGids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryGids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryGids")(js.undefined)
        ret
    }
  }
  
}

