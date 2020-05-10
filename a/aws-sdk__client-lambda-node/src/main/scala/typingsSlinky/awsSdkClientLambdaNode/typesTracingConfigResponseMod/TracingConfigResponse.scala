package typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigResponseMod

import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfigResponse extends js.Object {
  /**
    * <p>The tracing mode.</p>
    */
  var Mode: js.UndefOr[Active | PassThrough | String] = js.native
}

object TracingConfigResponse {
  @scala.inline
  def apply(): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfigResponse]
  }
  @scala.inline
  implicit class TracingConfigResponseOps[Self <: TracingConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Active | PassThrough | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
  }
  
}

