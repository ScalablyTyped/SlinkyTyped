package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConformancePackResponse extends js.Object {
  /**
    * ARN of the conformance pack.
    */
  var ConformancePackArn: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackArn] = js.native
}

object PutConformancePackResponse {
  @scala.inline
  def apply(): PutConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConformancePackResponse]
  }
  @scala.inline
  implicit class PutConformancePackResponseOps[Self <: PutConformancePackResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackArn(value: ConformancePackArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConformancePackArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackArn")(js.undefined)
        ret
    }
  }
  
}

