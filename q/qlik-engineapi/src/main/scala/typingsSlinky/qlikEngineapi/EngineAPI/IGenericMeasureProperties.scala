package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericMeasureProperties width extend GenericProperties
  */
@js.native
trait IGenericMeasureProperties extends IGenericProperties {
  var qMeasure: INxLibraryMeasureDef = js.native
}

object IGenericMeasureProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef): IGenericMeasureProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureProperties]
  }
  @scala.inline
  implicit class IGenericMeasurePropertiesOps[Self <: IGenericMeasureProperties] (val x: Self) extends AnyVal {
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

