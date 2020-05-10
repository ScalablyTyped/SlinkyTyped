package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHumanTaskUiRequest extends js.Object {
  /**
    * The name of the user interface you are creating.
    */
  var HumanTaskUiName: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiName = js.native
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow user interface. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
  var UiTemplate: typingsSlinky.awsSdk.sagemakerMod.UiTemplate = js.native
}

object CreateHumanTaskUiRequest {
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName, UiTemplate: UiTemplate): CreateHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiRequest]
  }
  @scala.inline
  implicit class CreateHumanTaskUiRequestOps[Self <: CreateHumanTaskUiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanTaskUiName(value: HumanTaskUiName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiTemplate(value: UiTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UiTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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

