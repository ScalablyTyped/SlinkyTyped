package typingsSlinky.reactRange.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRange.AnonChildren
import typingsSlinky.reactRange.AnonIndex
import typingsSlinky.reactRange.rangeMod.default
import typingsSlinky.reactRange.typesMod.Direction
import typingsSlinky.reactRange.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Range {
  @JSImport("react-range/lib/Range", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onFinalChange(value: /* values */ js.Array[Double] => Unit): this.type = set("onFinalChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
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
    values: js.Array[Double]
  ): Builder = {
    val __props = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProps]))
  }
}

