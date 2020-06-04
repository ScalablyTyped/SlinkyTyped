package typingsSlinky.antd.affixMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixState extends js.Object {
  var affixStyle: js.UndefOr[CSSProperties] = js.undefined
  var lastAffix: Boolean
  var placeholderStyle: js.UndefOr[CSSProperties] = js.undefined
  var prevTarget: Window | HTMLElement | Null
  var status: AffixStatus
}

object AffixState {
  @scala.inline
  def apply(lastAffix: Boolean, status: AffixStatus): AffixState = {
    val __obj = js.Dynamic.literal(lastAffix = lastAffix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixState]
  }
  @scala.inline
  implicit class AffixStateOps[Self <: AffixState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastAffix(value: Boolean): Self = this.set("lastAffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AffixStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAffixStyle(value: CSSProperties): Self = this.set("affixStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffixStyle: Self = this.set("affixStyle", js.undefined)
    @scala.inline
    def setPlaceholderStyle(value: CSSProperties): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    @scala.inline
    def setPrevTargetHTMLElement(value: HTMLElement): Self = this.set("prevTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevTargetWindow(value: Window): Self = this.set("prevTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevTarget(value: Window | HTMLElement): Self = this.set("prevTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevTargetNull: Self = this.set("prevTarget", null)
  }
  
}

