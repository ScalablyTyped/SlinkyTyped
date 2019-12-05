package typingsSlinky.recharts.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.ScatterChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(recharts), Name(rechartsMod), Name(ScatterChartProps))) was not a @ScalaJSDefined trait */
object ScatterChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.ScatterChart] {
  @JSImport("recharts", "ScatterChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ScatterChartProps
}

