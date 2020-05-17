package typingsSlinky.reactBurgerMenu.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactBurgerMenu.anon.PartialStyles
import typingsSlinky.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var bodyClassName: js.UndefOr[String] = js.native
  var burgerBarClassName: js.UndefOr[String] = js.native
  var burgerButtonClassName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var crossButtonClassName: js.UndefOr[String] = js.native
  var crossClassName: js.UndefOr[String] = js.native
  var customBurgerIcon: js.UndefOr[ReactElement | `false`] = js.native
  var customCrossIcon: js.UndefOr[ReactElement | `false`] = js.native
  var customOnKeyDown: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[Element], Unit]] = js.native
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.native
  var disableOverlayClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  var htmlClassName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var itemClassName: js.UndefOr[String] = js.native
  var itemListClassName: js.UndefOr[String] = js.native
  var menuClassName: js.UndefOr[String] = js.native
  var morphShapeClassName: js.UndefOr[String] = js.native
  var noOverlay: js.UndefOr[Boolean] = js.native
  var noTransition: js.UndefOr[Boolean] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[String] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[String] = js.native
  var right: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[PartialStyles] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBurgerBarClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burgerBarClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurgerBarClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burgerBarClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBurgerButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burgerButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurgerButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burgerButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBurgerIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBurgerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomBurgerIcon(value: ReactElement | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBurgerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBurgerIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBurgerIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCrossIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomCrossIcon(value: ReactElement | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCrossIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCrossIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOnKeyDown(value: /* event */ SyntheticKeyboardEvent[Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOnKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOnKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCloseOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOverlayClickFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlayClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableOverlayClick(value: Boolean | js.Function0[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemListClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemListClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMorphShapeClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphShapeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMorphShapeClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphShapeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* state */ State => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerContainerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerContainerId")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPageWrapId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWrapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageWrapId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWrapId")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

