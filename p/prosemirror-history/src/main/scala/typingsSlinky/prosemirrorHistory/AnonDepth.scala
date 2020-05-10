package typingsSlinky.prosemirrorHistory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDepth extends js.Object {
  var depth: js.UndefOr[Double | Null] = js.native
  var newGroupDelay: js.UndefOr[Double | Null] = js.native
}

object AnonDepth {
  @scala.inline
  def apply(): AnonDepth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDepth]
  }
  @scala.inline
  implicit class AnonDepthOps[Self <: AnonDepth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(null)
        ret
    }
    @scala.inline
    def withNewGroupDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGroupDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withNewGroupDelayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupDelay")(null)
        ret
    }
  }
  
}

