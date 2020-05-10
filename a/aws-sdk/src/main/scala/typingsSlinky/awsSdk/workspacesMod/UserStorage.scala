package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.native
}

object UserStorage {
  @scala.inline
  def apply(): UserStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStorage]
  }
  @scala.inline
  implicit class UserStorageOps[Self <: UserStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
        ret
    }
  }
  
}

