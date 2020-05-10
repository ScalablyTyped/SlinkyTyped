package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * Describes the application input configuration. 
    */
  var InputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
}

object AddApplicationInputResponse {
  @scala.inline
  def apply(): AddApplicationInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationInputResponse]
  }
  @scala.inline
  implicit class AddApplicationInputResponseOps[Self <: AddApplicationInputResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDescriptions(value: InputDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(js.undefined)
        ret
    }
  }
  
}

