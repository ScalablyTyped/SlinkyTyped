package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockLegalHold extends js.Object {
  /**
    * Indicates whether the specified object has a Legal Hold in place.
    */
  var Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.native
}

object ObjectLockLegalHold {
  @scala.inline
  def apply(): ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockLegalHold]
  }
  @scala.inline
  implicit class ObjectLockLegalHoldOps[Self <: ObjectLockLegalHold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ObjectLockLegalHoldStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

