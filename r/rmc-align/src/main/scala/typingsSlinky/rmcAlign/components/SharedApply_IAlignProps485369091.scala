package typingsSlinky.rmcAlign.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.rmcAlign.alignMod.IAlignProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IAlignProps485369091[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    target: () => Unit,
    childrenProps: js.Object = null,
    monitorBufferTime: Int | Double = null,
    monitorWindowResize: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* source */ js.Any, /* align */ js.Any) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    if (childrenProps != null) __obj.updateDynamic("childrenProps")(childrenProps.asInstanceOf[js.Any])
    if (monitorBufferTime != null) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2(onAlign))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAlignProps
}

