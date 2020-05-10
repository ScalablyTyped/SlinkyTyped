package typingsSlinky.reactSparklines.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSparklines.mod.SparklinesReferenceLineProps
import typingsSlinky.reactSparklines.reactSparklinesStrings.avg
import typingsSlinky.reactSparklines.reactSparklinesStrings.custom
import typingsSlinky.reactSparklines.reactSparklinesStrings.max
import typingsSlinky.reactSparklines.reactSparklinesStrings.mean
import typingsSlinky.reactSparklines.reactSparklinesStrings.median
import typingsSlinky.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesReferenceLine {
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesReferenceLine] {
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: max | min | mean | avg | median | custom): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SparklinesReferenceLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SparklinesReferenceLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

