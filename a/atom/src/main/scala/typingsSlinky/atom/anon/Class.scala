package typingsSlinky.atom.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atom.atomStrings.click
import typingsSlinky.atom.atomStrings.focus
import typingsSlinky.atom.atomStrings.hover
import typingsSlinky.atom.atomStrings.manual
import typingsSlinky.atom.mod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Hide] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var keyBindingCommand: js.UndefOr[String] = js.native
  var keyBindingTarget: js.UndefOr[HTMLElement] = js.native
  var placement: js.UndefOr[TooltipPlacement | js.Function0[TooltipPlacement]] = js.native
  var title: js.UndefOr[String | js.Function0[String]] = js.native
  var trigger: js.UndefOr[click | hover | focus | manual] = js.native
}

object Class {
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindingCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBindingCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindingTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBindingTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementFunction0(value: () => TooltipPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlacement(value: TooltipPlacement | js.Function0[TooltipPlacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: click | hover | focus | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

