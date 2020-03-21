package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobile.antdMobileStrings.button
import typingsSlinky.antdMobile.antdMobileStrings.number
import typingsSlinky.antdMobile.antdMobileStrings.pointer
import typingsSlinky.antdMobile.paginationMod.PaginationProps
import typingsSlinky.antdMobile.paginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    current: Double,
    total: Double,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prefixCls: String = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

