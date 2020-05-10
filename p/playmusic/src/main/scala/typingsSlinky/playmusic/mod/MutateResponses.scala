package typingsSlinky.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateResponses extends js.Object {
  var mutate_response: js.UndefOr[js.Array[MutateResponse]] = js.native
}

object MutateResponses {
  @scala.inline
  def apply(): MutateResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponses]
  }
  @scala.inline
  implicit class MutateResponsesOps[Self <: MutateResponses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutate_response(value: js.Array[MutateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutate_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate_response")(js.undefined)
        ret
    }
  }
  
}

