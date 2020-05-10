package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopOutput extends js.Object {
  /**
    * The location of the Amazon S3 object where Amazon Augmented AI stores your human loop output.
    */
  var OutputS3Uri: String = js.native
}

object HumanLoopOutput {
  @scala.inline
  def apply(OutputS3Uri: String): HumanLoopOutput = {
    val __obj = js.Dynamic.literal(OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopOutput]
  }
  @scala.inline
  implicit class HumanLoopOutputOps[Self <: HumanLoopOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputS3Uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

