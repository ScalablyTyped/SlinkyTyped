package typingsSlinky.reactDashResizeDashDetector.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashResizeDashDetector.Anon_Leading
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorMod.ReactResizeDetectorDimensions
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorMod.ReactResizeDetectorProps
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorMod.default
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorStrings.debounce
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashResizeDashDetector
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    handleHeight: js.UndefOr[Boolean] = js.undefined,
    handleWidth: js.UndefOr[Boolean] = js.undefined,
    nodeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any = null,
    onResize: (/* width */ Double, /* height */ Double) => Unit = null,
    querySelector: String = null,
    refreshMode: throttle | debounce = null,
    refreshOptions: Anon_Leading = null,
    refreshRate: Int | Double = null,
    render: /* props */ ReactResizeDetectorDimensions => TagMod[Any] = null,
    skipOnMount: js.UndefOr[Boolean] = js.undefined,
    targetDomEl: HTMLElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (querySelector != null) __obj.updateDynamic("querySelector")(querySelector.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshOptions != null) __obj.updateDynamic("refreshOptions")(refreshOptions.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount.asInstanceOf[js.Any])
    if (targetDomEl != null) __obj.updateDynamic("targetDomEl")(targetDomEl.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactResizeDetectorProps
}

