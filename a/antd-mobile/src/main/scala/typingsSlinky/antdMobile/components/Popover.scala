package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.bottomLeft
import typingsSlinky.antdMobile.antdMobileStrings.bottomRight
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.antdMobileStrings.topLeft
import typingsSlinky.antdMobile.antdMobileStrings.topRight
import typingsSlinky.antdMobile.popoverMod.PopOverPropsType
import typingsSlinky.antdMobile.popoverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    overlay: TagMod[Any],
    mask: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    placement: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight = null,
    prefixCls: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopOverPropsType
}

