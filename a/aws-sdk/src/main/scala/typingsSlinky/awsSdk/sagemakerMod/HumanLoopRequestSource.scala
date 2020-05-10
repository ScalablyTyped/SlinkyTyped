package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopRequestSource extends js.Object {
  /**
    * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field settings and JSON parsing rules are different based on the integration source. Valid values:
    */
  var AwsManagedHumanLoopRequestSource: typingsSlinky.awsSdk.sagemakerMod.AwsManagedHumanLoopRequestSource = js.native
}

object HumanLoopRequestSource {
  @scala.inline
  def apply(AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource): HumanLoopRequestSource = {
    val __obj = js.Dynamic.literal(AwsManagedHumanLoopRequestSource = AwsManagedHumanLoopRequestSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopRequestSource]
  }
  @scala.inline
  implicit class HumanLoopRequestSourceOps[Self <: HumanLoopRequestSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsManagedHumanLoopRequestSource(value: AwsManagedHumanLoopRequestSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsManagedHumanLoopRequestSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

