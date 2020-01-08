package typingsSlinky.rcDashDrawer.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashDrawer.Anon_OpenTarget
import typingsSlinky.rcDashDrawer.libDrawerChildMod.default
import typingsSlinky.rcDashDrawer.libIDrawerPropTypesMod.IDrawerChildProps
import typingsSlinky.rcDashDrawer.libIDrawerPropTypesMod.ILevelMove
import typingsSlinky.rcDashDrawer.libIDrawerPropTypesMod.IPlacement
import typingsSlinky.rcDashDrawer.rcDashDrawerBooleans.`false`
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerChild
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height, onChange, open, width */
  def apply(
    afterVisibleChange: /* open */ Boolean => Unit = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ease: String = null,
    getContainer: () => HTMLElement = null,
    getOpenCount: () => Double = null,
    handler: ReactElement | `false` = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    level: String | js.Array[String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ Anon_OpenTarget, ILevelMove]) = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onClose: /* e */ SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element] => Unit = null,
    onHandleClick: /* e */ SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element] => Unit = null,
    placement: IPlacement = null,
    prefixCls: String = null,
    showMask: js.UndefOr[Boolean] = js.undefined,
    switchScrollingEffect: /* close */ js.UndefOr[Boolean] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getOpenCount != null) __obj.updateDynamic("getOpenCount")(js.Any.fromFunction0(getOpenCount))
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1(onHandleClick))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask.asInstanceOf[js.Any])
    if (switchScrollingEffect != null) __obj.updateDynamic("switchScrollingEffect")(js.Any.fromFunction1(switchScrollingEffect))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashDrawer.libDrawerChildMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDrawerChildProps
}

