package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeasureListProperties
  */
@js.native
trait IGenericMeasureListProperties extends IGenericProperties {
  @JSName("qInfo")
  var qInfo_IGenericMeasureListProperties: IGenericMeassureListNxInfo = js.native
  var qMeasureListDef: IMeasureListDef = js.native
}

object IGenericMeasureListProperties {
  @scala.inline
  def apply(qInfo: IGenericMeassureListNxInfo, qMeasureListDef: IMeasureListDef): IGenericMeasureListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasureListDef = qMeasureListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListProperties]
  }
  @scala.inline
  implicit class IGenericMeasureListPropertiesOps[Self <: IGenericMeasureListProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQInfo(value: IGenericMeassureListNxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeasureListDef(value: IMeasureListDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasureListDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

