package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanTaskUiSummary extends js.Object {
  /**
    * A timestamp when SageMaker created the human task user interface.
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
}

object HumanTaskUiSummary {
  @scala.inline
  def apply(CreationTime: js.Date, HumanTaskUiArn: HumanTaskUiArn, HumanTaskUiName: HumanTaskUiName): HumanTaskUiSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanTaskUiSummary]
  }
}

