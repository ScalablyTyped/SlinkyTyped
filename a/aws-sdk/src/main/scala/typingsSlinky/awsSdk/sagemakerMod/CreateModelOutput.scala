package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelOutput extends js.Object {
  /**
    * The ARN of the model created in Amazon SageMaker.
    */
  var ModelArn: typingsSlinky.awsSdk.sagemakerMod.ModelArn = js.native
}

object CreateModelOutput {
  @scala.inline
  def apply(ModelArn: ModelArn): CreateModelOutput = {
    val __obj = js.Dynamic.literal(ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelOutput]
  }
  @scala.inline
  implicit class CreateModelOutputOps[Self <: CreateModelOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelArn(value: ModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

