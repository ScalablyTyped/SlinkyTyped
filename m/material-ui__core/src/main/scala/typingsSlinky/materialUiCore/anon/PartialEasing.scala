package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Easing> */
@js.native
trait PartialEasing extends js.Object {
  var easeIn: js.UndefOr[String] = js.native
  var easeInOut: js.UndefOr[String] = js.native
  var easeOut: js.UndefOr[String] = js.native
  var sharp: js.UndefOr[String] = js.native
}

object PartialEasing {
  @scala.inline
  def apply(): PartialEasing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEasing]
  }
  @scala.inline
  implicit class PartialEasingOps[Self <: PartialEasing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseInOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseInOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withSharp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharp")(js.undefined)
        ret
    }
  }
  
}

