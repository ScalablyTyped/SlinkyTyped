package typingsSlinky.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typingsSlinky.nivoBar.mod.BarDatum, java.lang.String]
  type BarClickHandler = js.Function2[
    /* datum */ typingsSlinky.nivoBar.mod.BarExtendedDatum, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLCanvasElement], 
    scala.Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, slinky.core.TagMod[scala.Any]]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IndexByFunc = js.Function1[/* datum */ typingsSlinky.nivoBar.mod.BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = typingsSlinky.nivoBar.mod.BarLayerType | typingsSlinky.nivoBar.mod.BarCustomLayer
  type TooltipProp = slinky.core.ReactComponentClass[typingsSlinky.nivoBar.mod.BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
