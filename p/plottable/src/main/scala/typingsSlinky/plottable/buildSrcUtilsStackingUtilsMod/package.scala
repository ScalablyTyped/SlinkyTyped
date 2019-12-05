package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsStackingUtilsMod {
  import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset
  import typingsSlinky.plottable.buildSrcUtilsMod.Map

  type GenericStackingResult[D] = Map[Dataset, Map[String | Double, GenericStackedDatum[D]]]
  type IStackingOrder = String
  type StackedDatum = GenericStackedDatum[String]
  type StackingResult = GenericStackingResult[String]
}
