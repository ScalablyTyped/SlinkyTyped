package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanTaskUiResponse extends js.Object {
  /**
    * The timestamp when the human task user interface was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  /**
    * The name of the human task user interface.
    */
  var HumanTaskUiName: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiName = js.native
  var UiTemplate: UiTemplateInfo = js.native
}

object DescribeHumanTaskUiResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HumanTaskUiArn: HumanTaskUiArn,
    HumanTaskUiName: HumanTaskUiName,
    UiTemplate: UiTemplateInfo
  ): DescribeHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiResponse]
  }
}

