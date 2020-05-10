package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGraphRequest extends js.Object {
  /**
    * The ARN of the behavior graph to disable.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
}

object DeleteGraphRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): DeleteGraphRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphRequest]
  }
  @scala.inline
  implicit class DeleteGraphRequestOps[Self <: DeleteGraphRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphArn(value: GraphArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

