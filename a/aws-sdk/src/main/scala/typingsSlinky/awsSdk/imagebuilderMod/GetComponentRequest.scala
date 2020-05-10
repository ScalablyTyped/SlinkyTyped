package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component that you want to retrieve. Regex requires "/\d+$" suffix.
    */
  var componentBuildVersionArn: ComponentBuildVersionArn = js.native
}

object GetComponentRequest {
  @scala.inline
  def apply(componentBuildVersionArn: ComponentBuildVersionArn): GetComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
  @scala.inline
  implicit class GetComponentRequestOps[Self <: GetComponentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBuildVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

