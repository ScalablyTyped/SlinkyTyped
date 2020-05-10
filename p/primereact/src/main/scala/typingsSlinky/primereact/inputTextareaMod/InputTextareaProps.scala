package typingsSlinky.primereact.inputTextareaMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTextareaProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement]
     with /* key */ StringDictionary[js.Any] {
  var autoResize: js.UndefOr[Boolean] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
}

object InputTextareaProps {
  @scala.inline
  def apply(): InputTextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputTextareaProps]
  }
  @scala.inline
  implicit class InputTextareaPropsOps[Self <: InputTextareaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOptions(value: TooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(js.undefined)
        ret
    }
  }
  
}

