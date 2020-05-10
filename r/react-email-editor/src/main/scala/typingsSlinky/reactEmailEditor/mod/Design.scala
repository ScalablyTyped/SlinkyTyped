package typingsSlinky.reactEmailEditor.mod

import typingsSlinky.reactEmailEditor.AnonRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Design extends js.Object {
  val body: AnonRows = js.native
  val counters: js.UndefOr[js.Object] = js.native
}

object Design {
  @scala.inline
  def apply(body: AnonRows): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  @scala.inline
  implicit class DesignOps[Self <: Design] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: AnonRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(js.undefined)
        ret
    }
  }
  
}

