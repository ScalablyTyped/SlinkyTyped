package typingsSlinky.reactDashMeasure.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMeasure.reactDashMeasureMod.ContentRect
import typingsSlinky.reactDashMeasure.reactDashMeasureMod.MeasureProps
import typingsSlinky.reactDashMeasure.reactDashMeasureMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashMeasure
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-measure", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bounds: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    innerRef: /* ref */ org.scalajs.dom.raw.Element | Null => Unit = null,
    margin: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Boolean] = js.undefined,
    onResize: /* contentRect */ ContentRect => Unit = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMeasure.reactDashMeasureMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MeasureProps
}

