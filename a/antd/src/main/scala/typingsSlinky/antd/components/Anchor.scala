package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_Href
import typingsSlinky.antd.esAnchorAnchorMod.AnchorContainer
import typingsSlinky.antd.esAnchorAnchorMod.AnchorProps
import typingsSlinky.antd.esAnchorMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, onChange */
object Anchor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esAnchorMod.default].asInstanceOf[String | js.Object]
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    getContainer: () => AnchorContainer = null,
    getCurrentAnchor: () => String = null,
    offsetTop: Int | Double = null,
    onClick: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Anon_Href) => Unit = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOffset: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnchorProps
}

