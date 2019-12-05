package typingsSlinky.reactDashHeadroom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashHeadroom.reactDashHeadroomMod.ReactHeadroomProps
import typingsSlinky.reactDashHeadroom.reactDashHeadroomMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashHeadroom
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    calcHeightOnResize: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    downTolerance: Int | Double = null,
    onPin: () => Unit = null,
    onUnfix: () => Unit = null,
    onUnpin: () => Unit = null,
    parent: () => _ = null,
    pinStart: Int | Double = null,
    style: CSSProperties = null,
    upTolerance: Int | Double = null,
    wrapperStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calcHeightOnResize)) __obj.updateDynamic("calcHeightOnResize")(calcHeightOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (downTolerance != null) __obj.updateDynamic("downTolerance")(downTolerance.asInstanceOf[js.Any])
    if (onPin != null) __obj.updateDynamic("onPin")(js.Any.fromFunction0(onPin))
    if (onUnfix != null) __obj.updateDynamic("onUnfix")(js.Any.fromFunction0(onUnfix))
    if (onUnpin != null) __obj.updateDynamic("onUnpin")(js.Any.fromFunction0(onUnpin))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction0(parent))
    if (pinStart != null) __obj.updateDynamic("pinStart")(pinStart.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (upTolerance != null) __obj.updateDynamic("upTolerance")(upTolerance.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactHeadroomProps
}

