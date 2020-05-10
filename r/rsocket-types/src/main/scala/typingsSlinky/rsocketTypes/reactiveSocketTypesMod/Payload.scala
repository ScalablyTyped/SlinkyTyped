package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload[D, M] extends js.Object {
  var data: js.UndefOr[D] = js.native
  var metadata: js.UndefOr[M] = js.native
}

object Payload {
  @scala.inline
  def apply[D, M](): Payload[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload[D, M]]
  }
  @scala.inline
  implicit class PayloadOps[Self[d, m] <: Payload[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withData(value: D): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: M): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

