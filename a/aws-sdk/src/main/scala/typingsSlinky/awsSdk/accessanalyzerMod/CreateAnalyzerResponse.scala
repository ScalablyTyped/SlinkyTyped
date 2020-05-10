package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnalyzerResponse extends js.Object {
  /**
    * The ARN of the analyzer that was created by the request.
    */
  var arn: js.UndefOr[AnalyzerArn] = js.native
}

object CreateAnalyzerResponse {
  @scala.inline
  def apply(): CreateAnalyzerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnalyzerResponse]
  }
  @scala.inline
  implicit class CreateAnalyzerResponseOps[Self <: CreateAnalyzerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AnalyzerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
  }
  
}

