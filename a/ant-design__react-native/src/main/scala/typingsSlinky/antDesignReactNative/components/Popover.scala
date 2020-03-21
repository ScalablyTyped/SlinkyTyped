package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.popoverMod.PopoverProps
import typingsSlinky.antDesignReactNative.popoverMod.default
import typingsSlinky.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    overlay: TagMod[Any],
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    placement: Placement | auto = null,
    renderOverlayComponent: /* node */ TagMod[Any] => TagMod[Any] = null,
    styles: Partial[PopoverStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

