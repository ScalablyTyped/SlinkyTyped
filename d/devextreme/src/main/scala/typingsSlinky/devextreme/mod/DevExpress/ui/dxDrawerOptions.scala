package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.after
import typingsSlinky.devextreme.devextremeStrings.before
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.expand
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.overlap
import typingsSlinky.devextreme.devextremeStrings.push
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.shrink
import typingsSlinky.devextreme.devextremeStrings.slide
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDrawerOptions extends WidgetOptions[dxDrawer] {
  /** Specifies the duration of the drawer's opening and closing animation (in milliseconds). Applies only if animationEnabled is true. */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Specifies whether to use an opening and closing animation. */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether to close the drawer if a user clicks or taps the view area. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  /** Specifies the drawer's width or height (depending on the drawer's position) in the opened state. */
  var maxSize: js.UndefOr[Double] = js.native
  /** Specifies the drawer's width or height (depending on the drawer's position) in the closed state. */
  var minSize: js.UndefOr[Double] = js.native
  /** Specifies whether the drawer is opened. */
  var opened: js.UndefOr[Boolean] = js.native
  /** Specifies how the drawer interacts with the view in the opened state. */
  var openedStateMode: js.UndefOr[overlap | shrink | push] = js.native
  /** Specifies the drawer's position in relation to the view. */
  var position: js.UndefOr[left | right | top | bottom | before | after] = js.native
  /** Specifies the drawer's reveal mode. */
  var revealMode: js.UndefOr[slide | expand] = js.native
  /** Specifies whether to shade the view when the drawer is opened. */
  var shading: js.UndefOr[Boolean] = js.native
  /** Specifies a CSS selector for the element in which the drawer should be rendered. Applies only when the openedStateMode is "overlap". */
  var target: js.UndefOr[String | Element | JQuery] = js.native
  /** Specifies the drawer's content. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
  ] = js.native
}

object dxDrawerOptions {
  @scala.inline
  def apply(): dxDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDrawerOptions]
  }
  @scala.inline
  implicit class dxDrawerOptionsOps[Self <: dxDrawerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutsideClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenedStateMode(value: overlap | shrink | push): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedStateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenedStateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedStateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: left | right | top | bottom | before | after): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRevealMode(value: slide | expand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevealMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction1(value: /* Element */ dxElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
    ): Self = {
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
  }
  
}

