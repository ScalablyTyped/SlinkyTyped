package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackingUtilsMod {
  type GenericStackingResult[D] = typingsSlinky.plottable.utilsMod.Map[
    typingsSlinky.plottable.datasetMod.Dataset, 
    typingsSlinky.plottable.utilsMod.Map[
      java.lang.String | scala.Double, 
      typingsSlinky.plottable.stackingUtilsMod.GenericStackedDatum[D]
    ]
  ]
  type StackedDatum = typingsSlinky.plottable.stackingUtilsMod.GenericStackedDatum[java.lang.String]
  type StackingResult = typingsSlinky.plottable.stackingUtilsMod.GenericStackingResult[java.lang.String]
}
