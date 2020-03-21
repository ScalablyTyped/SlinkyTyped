package typingsSlinky.reactBurgerMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactBurgerMenu.mod.State
import typingsSlinky.reactBurgerMenu.mod.Styles
import typingsSlinky.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props1553393975[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, id, width */
  def apply(
    bodyClassName: String = null,
    burgerBarClassName: String = null,
    burgerButtonClassName: String = null,
    crossButtonClassName: String = null,
    crossClassName: String = null,
    customBurgerIcon: ReactElement | `false` = null,
    customCrossIcon: ReactElement | `false` = null,
    customOnKeyDown: /* event */ SyntheticKeyboardEvent[org.scalajs.dom.raw.Element] => Unit = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClick: Boolean | js.Function0[Boolean] = null,
    htmlClassName: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemClassName: String = null,
    itemListClassName: String = null,
    menuClassName: String = null,
    morphShapeClassName: String = null,
    noOverlay: js.UndefOr[Boolean] = js.undefined,
    noTransition: js.UndefOr[Boolean] = js.undefined,
    onStateChange: /* state */ State => Unit = null,
    outerContainerId: String = null,
    overlayClassName: String = null,
    pageWrapId: String = null,
    right: js.UndefOr[Boolean] = js.undefined,
    styles: Styles = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (burgerBarClassName != null) __obj.updateDynamic("burgerBarClassName")(burgerBarClassName.asInstanceOf[js.Any])
    if (burgerButtonClassName != null) __obj.updateDynamic("burgerButtonClassName")(burgerButtonClassName.asInstanceOf[js.Any])
    if (crossButtonClassName != null) __obj.updateDynamic("crossButtonClassName")(crossButtonClassName.asInstanceOf[js.Any])
    if (crossClassName != null) __obj.updateDynamic("crossClassName")(crossClassName.asInstanceOf[js.Any])
    if (customBurgerIcon != null) __obj.updateDynamic("customBurgerIcon")(customBurgerIcon.asInstanceOf[js.Any])
    if (customCrossIcon != null) __obj.updateDynamic("customCrossIcon")(customCrossIcon.asInstanceOf[js.Any])
    if (customOnKeyDown != null) __obj.updateDynamic("customOnKeyDown")(js.Any.fromFunction1(customOnKeyDown))
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.asInstanceOf[js.Any])
    if (disableOverlayClick != null) __obj.updateDynamic("disableOverlayClick")(disableOverlayClick.asInstanceOf[js.Any])
    if (htmlClassName != null) __obj.updateDynamic("htmlClassName")(htmlClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemListClassName != null) __obj.updateDynamic("itemListClassName")(itemListClassName.asInstanceOf[js.Any])
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName.asInstanceOf[js.Any])
    if (morphShapeClassName != null) __obj.updateDynamic("morphShapeClassName")(morphShapeClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(noOverlay)) __obj.updateDynamic("noOverlay")(noOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(noTransition)) __obj.updateDynamic("noTransition")(noTransition.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (outerContainerId != null) __obj.updateDynamic("outerContainerId")(outerContainerId.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (pageWrapId != null) __obj.updateDynamic("pageWrapId")(pageWrapId.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactBurgerMenu.mod.Props
}

