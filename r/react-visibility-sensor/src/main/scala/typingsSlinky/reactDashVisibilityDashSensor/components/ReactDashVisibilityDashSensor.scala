package typingsSlinky.reactDashVisibilityDashSensor.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVisibilityDashSensor.reactDashVisibilityDashSensorMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashVisibilityDashSensor
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-visibility-sensor", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    containment: HTMLElement = null,
    delayedCall: js.UndefOr[Boolean] = js.undefined,
    intervalCheck: js.UndefOr[Boolean] = js.undefined,
    intervalDelay: Int | Double = null,
    minTopValue: Int | Double = null,
    offset: Shape = null,
    partialVisibility: js.UndefOr[Boolean] = js.undefined,
    resizeCheck: js.UndefOr[Boolean] = js.undefined,
    resizeDelay: Int | Double = null,
    resizeThrottle: Int | Double = null,
    scrollCheck: js.UndefOr[Boolean] = js.undefined,
    scrollDelay: Int | Double = null,
    scrollThrottle: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (!js.isUndefined(delayedCall)) __obj.updateDynamic("delayedCall")(delayedCall.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalCheck)) __obj.updateDynamic("intervalCheck")(intervalCheck.asInstanceOf[js.Any])
    if (intervalDelay != null) __obj.updateDynamic("intervalDelay")(intervalDelay.asInstanceOf[js.Any])
    if (minTopValue != null) __obj.updateDynamic("minTopValue")(minTopValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(partialVisibility)) __obj.updateDynamic("partialVisibility")(partialVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeCheck)) __obj.updateDynamic("resizeCheck")(resizeCheck.asInstanceOf[js.Any])
    if (resizeDelay != null) __obj.updateDynamic("resizeDelay")(resizeDelay.asInstanceOf[js.Any])
    if (resizeThrottle != null) __obj.updateDynamic("resizeThrottle")(resizeThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollCheck)) __obj.updateDynamic("scrollCheck")(scrollCheck.asInstanceOf[js.Any])
    if (scrollDelay != null) __obj.updateDynamic("scrollDelay")(scrollDelay.asInstanceOf[js.Any])
    if (scrollThrottle != null) __obj.updateDynamic("scrollThrottle")(scrollThrottle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashVisibilityDashSensor.reactDashVisibilityDashSensorMod.Props
}

