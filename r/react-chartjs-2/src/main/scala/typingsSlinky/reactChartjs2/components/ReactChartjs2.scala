package typingsSlinky.reactChartjs2.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactChartjs2.mod.ChartComponentProps
import typingsSlinky.reactChartjs2.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ReactChartjs2 {
  
  def apply[P /* <: ChartComponentProps */](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-chartjs-2", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: ChartComponentProps */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[P]]
  
  implicit def make[P /* <: ChartComponentProps */](companion: ReactChartjs2.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
