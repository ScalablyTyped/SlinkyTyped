package typingsSlinky.antd.affixMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AffixState extends js.Object {
  var affixStyle: js.UndefOr[CSSProperties] = js.native
  var lastAffix: Boolean = js.native
  var placeholderStyle: js.UndefOr[CSSProperties] = js.native
  var prevTarget: Window_ | HTMLElement | Null = js.native
  var status: AffixStatus = js.native
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
    def withLastAffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AffixStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffixStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffixStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevTarget(value: Window_ | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevTarget")(null)
        ret
    }
  }
  
}

