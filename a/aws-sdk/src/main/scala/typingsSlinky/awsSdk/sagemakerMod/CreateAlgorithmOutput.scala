package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new algorithm.
    */
  var AlgorithmArn: typingsSlinky.awsSdk.sagemakerMod.AlgorithmArn = js.native
}

object CreateAlgorithmOutput {
  @scala.inline
  def apply(AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmOutput]
  }
  @scala.inline
  implicit class CreateAlgorithmOutputOps[Self <: CreateAlgorithmOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: AlgorithmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

