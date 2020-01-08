package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libSpinMod.SpinProps
import typingsSlinky.antd.libSpinMod.SpinSize
import typingsSlinky.antd.libSpinMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spin
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/spin", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    delay: Int | Double = null,
    indicator: ReactElement = null,
    prefixCls: String = null,
    size: SpinSize = null,
    spinning: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tip: String = null,
    wrapperClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spinning)) __obj.updateDynamic("spinning")(spinning.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libSpinMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpinProps
}

