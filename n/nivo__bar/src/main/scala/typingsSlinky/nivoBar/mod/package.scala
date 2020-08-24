package typingsSlinky.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typingsSlinky.nivoBar.mod.BarDatum, java.lang.String]
  type BarCustomLayer = js.Function1[/* props */ js.Any, slinky.core.facade.ReactElement]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nivoBar.mod.Value]
  type BarMouseEventHandler[T] = js.Function2[
    /* datum */ typingsSlinky.nivoBar.mod.BarExtendedDatum, 
    /* event */ slinky.web.SyntheticMouseEvent[T], 
    scala.Unit
  ]
  type IndexByFunc = js.Function1[/* datum */ typingsSlinky.nivoBar.mod.BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = typingsSlinky.nivoBar.mod.BarLayerType | typingsSlinky.nivoBar.mod.BarCustomLayer
  type TooltipProp = slinky.core.ReactComponentClass[typingsSlinky.nivoBar.mod.BarExtendedDatum]
  type Value = java.lang.String | scala.Double
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
