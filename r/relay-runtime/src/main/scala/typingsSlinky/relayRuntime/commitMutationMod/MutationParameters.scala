package typingsSlinky.relayRuntime.commitMutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationParameters extends js.Object {
  val rawResponse: js.UndefOr[js.Object] = js.native
}

object MutationParameters {
  @scala.inline
  def apply(): MutationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationParameters]
  }
  @scala.inline
  implicit class MutationParametersOps[Self <: MutationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawResponse(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(js.undefined)
        ret
    }
  }
  
}

