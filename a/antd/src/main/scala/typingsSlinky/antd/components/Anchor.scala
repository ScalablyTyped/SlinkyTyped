package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.AnonHref
import typingsSlinky.antd.anchorAnchorMod.AnchorContainer
import typingsSlinky.antd.anchorAnchorMod.AnchorProps
import typingsSlinky.antd.anchorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Anchor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/anchor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    getContainer: () => AnchorContainer = null,
    getCurrentAnchor: () => String = null,
    offsetTop: Int | Double = null,
    onChange: /* currentActiveLink */ String => Unit = null,
    onClick: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ AnonHref) => Unit = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    targetOffset: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.anchorMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AnchorProps
}

