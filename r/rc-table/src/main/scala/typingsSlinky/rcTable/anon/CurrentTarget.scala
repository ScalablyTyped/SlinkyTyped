package typingsSlinky.rcTable.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTarget extends js.Object {
  var currentTarget: js.UndefOr[HTMLElement] = js.native
  var scrollLeft: js.UndefOr[Double] = js.native
}

object CurrentTarget {
  @scala.inline
  def apply(): CurrentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTarget]
  }
  @scala.inline
  implicit class CurrentTargetOps[Self <: CurrentTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
  }
  
}

