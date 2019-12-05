package typingsSlinky.makerDotJs.MakerJs.measure

import typingsSlinky.makerDotJs.MakerJs.IMeasureWithCenter
import typingsSlinky.makerDotJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.modelExtents")
@js.native
object modelExtents extends js.Object {
  /**
    * Measures the smallest rectangle which contains a model.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  def apply(modelToMeasure: IModel): IMeasureWithCenter = js.native
  def apply(modelToMeasure: IModel, atlas: Atlas): IMeasureWithCenter = js.native
}

