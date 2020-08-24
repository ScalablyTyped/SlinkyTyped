package typingsSlinky.highchartsReactOfficial.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.highchartsReactOfficial.anon.Chart
import typingsSlinky.highchartsReactOfficial.mod.HighchartsReact.Props
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object HighchartsReactOfficial {
  @JSImport("highcharts-react-official", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: PropsWithoutRef[Props] with RefAttributes[Chart]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HighchartsReactOfficial.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

