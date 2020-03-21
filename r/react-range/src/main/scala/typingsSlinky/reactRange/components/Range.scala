package typingsSlinky.reactRange.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRange.AnonChildren
import typingsSlinky.reactRange.AnonIndex
import typingsSlinky.reactRange.rangeMod.default
import typingsSlinky.reactRange.typesMod.Direction
import typingsSlinky.reactRange.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Range
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-range/lib/Range", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Unit,
    renderThumb: AnonIndex => TagMod[Any],
    renderTrack: AnonChildren => TagMod[Any],
    rtl: Boolean,
    step: Double,
    values: js.Array[Double],
    onFinalChange: /* values */ js.Array[Double] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1(onFinalChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IProps
}

