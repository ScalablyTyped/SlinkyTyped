package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atom.anon.Hide
import typingsSlinky.atom.atomBooleans.`false`
import typingsSlinky.atom.atomStrings.auto
import typingsSlinky.atom.atomStrings.bottom_
import typingsSlinky.atom.atomStrings.left_
import typingsSlinky.atom.atomStrings.right_
import typingsSlinky.atom.atomStrings.top_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  /** Apply a CSS fade transition to the tooltip. */
  var animation: js.UndefOr[Boolean] = js.native
  /** Appends the tooltip to a specific element. */
  var container: js.UndefOr[String | HTMLElement | `false`] = js.native
  /**
    *  Delay showing and hiding the tooltip (ms) - does not apply to manual
    *  trigger type.
    */
  var delay: js.UndefOr[Double | Hide] = js.native
  /** Allow HTML in the tooltip. */
  var html: js.UndefOr[Boolean] = js.native
  /** How to position the tooltip. */
  var placement: js.UndefOr[top_ | bottom_ | left_ | right_ | auto] = js.native
  /**
    *  If a selector is provided, tooltip objects will be delegated to the
    *  specified targets.
    */
  var selector: js.UndefOr[String] = js.native
  /** Base HTML to use when creating the tooltip. */
  var template: js.UndefOr[String] = js.native
  /**
    *  Default title value if title attribute isn't present.
    *  If a function is given, it will be called with its this reference set to
    *  the element that the tooltip is attached to.
    */
  var title: js.UndefOr[String | HTMLElement | js.Function0[String]] = js.native
  /**
    *  How tooltip is triggered - click | hover | focus | manual.
    *  You may pass multiple triggers; separate them with a space.
    */
  var trigger: js.UndefOr[String] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | HTMLElement | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double | Hide): Self = {
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
    def withPlacement(value: top_ | bottom_ | left_ | right_ | auto): Self = {
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
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String | HTMLElement | js.Function0[String]): Self = {
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
    def withTrigger(value: String): Self = {
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

