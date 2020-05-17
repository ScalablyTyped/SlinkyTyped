package typingsSlinky.reactPlyr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controls extends js.Object {
  var controls: js.UndefOr[Boolean] = js.native
  var seek: js.UndefOr[Boolean] = js.native
}

object Controls {
  @scala.inline
  def apply(): Controls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Controls]
  }
  @scala.inline
  implicit class ControlsOps[Self <: Controls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withSeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.undefined)
        ret
    }
  }
  
}

