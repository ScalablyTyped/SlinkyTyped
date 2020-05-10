package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphResponse extends js.Object {
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.GraphArn] = js.native
}

object CreateGraphResponse {
  @scala.inline
  def apply(): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphResponse]
  }
  @scala.inline
  implicit class CreateGraphResponseOps[Self <: CreateGraphResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutGraphArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(js.undefined)
        ret
    }
  }
  
}

