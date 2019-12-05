package typingsSlinky.atNivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoBarMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLCanvasElement
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import slinky.web.SyntheticMouseEvent

  type AccessorFunc = js.Function1[/* datum */ BarDatum, String]
  type BarClickHandler = js.Function2[
    /* datum */ BarExtendedDatum, 
    /* event */ SyntheticMouseEvent[HTMLCanvasElement], 
    Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, TagMod[Any]]
  type BarDatum = StringDictionary[String | Double]
  type IndexByFunc = js.Function1[/* datum */ BarDatum, String | Double]
  type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]
  type Layer = BarLayerType | BarCustomLayer
  type TooltipProp = ReactComponentClass[BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}
