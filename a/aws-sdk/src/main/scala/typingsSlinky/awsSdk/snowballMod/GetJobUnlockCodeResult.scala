package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobUnlockCodeResult extends js.Object {
  /**
    * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 90 days after the job has been created.
    */
  var UnlockCode: js.UndefOr[String] = js.native
}

object GetJobUnlockCodeResult {
  @scala.inline
  def apply(): GetJobUnlockCodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobUnlockCodeResult]
  }
  @scala.inline
  implicit class GetJobUnlockCodeResultOps[Self <: GetJobUnlockCodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnlockCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnlockCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnlockCode")(js.undefined)
        ret
    }
  }
  
}

