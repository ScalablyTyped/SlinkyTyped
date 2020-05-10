package typingsSlinky.primereact.passwordMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var feedback: js.UndefOr[Boolean] = js.native
  var mediumLabel: js.UndefOr[String] = js.native
  var promptLabel: js.UndefOr[String] = js.native
  var strongLabel: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var weakLabel: js.UndefOr[String] = js.native
}

object PasswordProps {
  @scala.inline
  def apply(): PasswordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProps]
  }
  @scala.inline
  implicit class PasswordPropsOps[Self <: PasswordProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStrongLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrongLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongLabel")(js.undefined)
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
    @scala.inline
    def withWeakLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeakLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakLabel")(js.undefined)
        ret
    }
  }
  
}

