package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.PartialAccordionStyle
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod.AccordionHeader
import typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod.AccordionNativeProps
import typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod.default
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.EasingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange */
  def apply[T /* <: AccordionHeader */](
    activeSections: js.Array[Double] = null,
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    renderContent: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderFooter: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderHeader: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderSectionTitle: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    sections: js.Array[T] = null,
    style: StyleProp[ViewStyle] = null,
    styles: PartialAccordionStyle = null,
    touchableComponent: ReactComponentClass[js.Object] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (activeSections != null) __obj.updateDynamic("activeSections")(activeSections.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction4(renderContent))
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction4(renderHeader))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4(renderSectionTitle))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libAccordionMod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AccordionNativeProps[js.Any]
}

