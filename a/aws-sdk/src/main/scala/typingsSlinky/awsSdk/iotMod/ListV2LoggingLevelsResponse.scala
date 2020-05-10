package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListV2LoggingLevelsResponse extends js.Object {
  /**
    * The logging configuration for a target.
    */
  var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListV2LoggingLevelsResponse {
  @scala.inline
  def apply(): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
  @scala.inline
  implicit class ListV2LoggingLevelsResponseOps[Self <: ListV2LoggingLevelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogTargetConfigurations(value: LogTargetConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTargetConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTargetConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTargetConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

