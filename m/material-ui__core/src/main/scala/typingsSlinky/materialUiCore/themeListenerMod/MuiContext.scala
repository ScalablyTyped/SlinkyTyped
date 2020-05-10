package typingsSlinky.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiContext[S] extends js.Object {
  var __THEMING__ : js.UndefOr[Broadcast[S]] = js.native
}

object MuiContext {
  @scala.inline
  def apply[S](): MuiContext[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiContext[S]]
  }
  @scala.inline
  implicit class MuiContextOps[Self[s] <: MuiContext[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def with__THEMING__(value: Broadcast[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__THEMING__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__THEMING__ : Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__THEMING__")(js.undefined)
        ret
    }
  }
  
}

