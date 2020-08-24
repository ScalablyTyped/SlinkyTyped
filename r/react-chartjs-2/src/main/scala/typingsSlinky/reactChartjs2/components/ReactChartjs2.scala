package typingsSlinky.reactChartjs2.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactChartjs2.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ReactChartjs2 {
  @JSImport("react-chartjs-2", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactChartjs2.mod.ChartComponentProps */ P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[P]]
  
  def apply[/* <: typingsSlinky.reactChartjs2.mod.ChartComponentProps */ P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactChartjs2.mod.ChartComponentProps */ P](companion: ReactChartjs2.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

