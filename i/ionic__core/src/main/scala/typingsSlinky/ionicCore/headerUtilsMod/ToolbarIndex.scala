package typingsSlinky.ionicCore.headerUtilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonTitleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarIndex extends js.Object {
  var background: HTMLElement = js.native
  var el: HTMLElement = js.native
  var innerTitleEl: HTMLElement = js.native
  var ionButtonsEl: js.Array[js.Any | HTMLElement] = js.native
  var ionTitleEl: js.UndefOr[HTMLIonTitleElement] = js.native
}

object ToolbarIndex {
  @scala.inline
  def apply(
    background: HTMLElement,
    el: HTMLElement,
    innerTitleEl: HTMLElement,
    ionButtonsEl: js.Array[js.Any | HTMLElement]
  ): ToolbarIndex = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], innerTitleEl = innerTitleEl.asInstanceOf[js.Any], ionButtonsEl = ionButtonsEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIndex]
  }
  @scala.inline
  implicit class ToolbarIndexOps[Self <: ToolbarIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerTitleEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerTitleEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonButtonsEl(value: js.Array[js.Any | HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionButtonsEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonTitleEl(value: HTMLIonTitleElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionTitleEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIonTitleEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionTitleEl")(js.undefined)
        ret
    }
  }
  
}

