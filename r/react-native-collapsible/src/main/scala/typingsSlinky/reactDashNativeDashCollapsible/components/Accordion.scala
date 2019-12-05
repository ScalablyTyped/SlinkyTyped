package typingsSlinky.reactDashNativeDashCollapsible.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashCollapsible.accordionMod.AccordionProps
import typingsSlinky.reactDashNativeDashCollapsible.accordionMod.default
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.EasingMode
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.bottom
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.center
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Unit,
    renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
    renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
    sections: js.Array[T],
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    renderFooter: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderSectionTitle: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    touchableComponent: ReactComponentClass[js.Object] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4(renderFooter))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4(renderSectionTitle))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashCollapsible.accordionMod.default[js.Any]]]
  }
  type Props = AccordionProps[js.Any]
}

