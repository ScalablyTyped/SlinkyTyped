package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectLegalHoldOutput extends js.Object {
  /**
    * The current Legal Hold status for the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.native
}

object GetObjectLegalHoldOutput {
  @scala.inline
  def apply(): GetObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLegalHoldOutput]
  }
  @scala.inline
  implicit class GetObjectLegalHoldOutputOps[Self <: GetObjectLegalHoldOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegalHold(value: ObjectLockLegalHold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalHold")(js.undefined)
        ret
    }
  }
  
}

