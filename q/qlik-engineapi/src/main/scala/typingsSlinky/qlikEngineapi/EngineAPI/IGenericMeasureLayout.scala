package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericMeasureProperties extend of GenericBaseLayout
  */
@js.native
trait IGenericMeasureLayout extends IGenericBaseLayout {
  /**
    * Information about the measure.
    */
  var qMeasure: INxLibraryMeasureDef = js.native
}

object IGenericMeasureLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef, qMeta: INxMeta): IGenericMeasureLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureLayout]
  }
  @scala.inline
  implicit class IGenericMeasureLayoutOps[Self <: IGenericMeasureLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQMeasure(value: INxLibraryMeasureDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

