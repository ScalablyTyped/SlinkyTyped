package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscrollPreserveFolds extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.native
  var preserveFolds: js.UndefOr[Boolean] = js.native
}

object AutoscrollPreserveFolds {
  @scala.inline
  def apply(): AutoscrollPreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscrollPreserveFolds]
  }
  @scala.inline
  implicit class AutoscrollPreserveFoldsOps[Self <: AutoscrollPreserveFolds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFolds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFolds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFolds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFolds")(js.undefined)
        ret
    }
  }
  
}

