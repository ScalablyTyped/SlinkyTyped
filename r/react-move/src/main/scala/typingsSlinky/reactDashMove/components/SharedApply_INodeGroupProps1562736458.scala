package typingsSlinky.reactDashMove.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMove.nodeGroupMod.INodeGroupProps
import typingsSlinky.reactDashMove.reactDashMoveMod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_INodeGroupProps1562736458[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap,
    enter: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any] = null,
    leave: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null,
    update: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4(interpolation))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = INodeGroupProps
}

