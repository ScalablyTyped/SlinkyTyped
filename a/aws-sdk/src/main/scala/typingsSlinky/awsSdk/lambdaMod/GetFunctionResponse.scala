package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionResponse extends js.Object {
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.native
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Concurrency] = js.native
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.native
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Tags] = js.native
}

object GetFunctionResponse {
  @scala.inline
  def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  @scala.inline
  implicit class GetFunctionResponseOps[Self <: GetFunctionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: FunctionCodeLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: Concurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: FunctionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

