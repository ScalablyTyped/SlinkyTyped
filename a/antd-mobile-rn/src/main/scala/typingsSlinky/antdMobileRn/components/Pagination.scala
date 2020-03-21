package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.antdMobileRnStrings.button
import typingsSlinky.antdMobileRn.antdMobileRnStrings.number
import typingsSlinky.antdMobileRn.antdMobileRnStrings.pointer
import typingsSlinky.antdMobileRn.paginationIndexNativeMod.PaginationNativeProps
import typingsSlinky.antdMobileRn.paginationStyleIndexNativeMod.IPaginationStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.Pagination] {
  @JSImport("antd-mobile-rn", "Pagination")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: StyleProp[ViewStyle] = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IPaginationStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Pagination] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationNativeProps
}

