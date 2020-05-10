package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectRetentionOutput extends js.Object {
  /**
    * The container element for an object's retention settings.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.native
}

object GetObjectRetentionOutput {
  @scala.inline
  def apply(): GetObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectRetentionOutput]
  }
  @scala.inline
  implicit class GetObjectRetentionOutputOps[Self <: GetObjectRetentionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetention(value: ObjectLockRetention): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(js.undefined)
        ret
    }
  }
  
}

