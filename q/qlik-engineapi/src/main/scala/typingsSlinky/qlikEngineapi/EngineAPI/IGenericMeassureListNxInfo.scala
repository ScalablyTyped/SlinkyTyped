package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.qlikEngineapiStrings.MeasureList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeassureListNxInfo
  */
@js.native
trait IGenericMeassureListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericMeassureListNxInfo: MeasureList = js.native
}

object IGenericMeassureListNxInfo {
  @scala.inline
  def apply(qType: MeasureList): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
  @scala.inline
  implicit class IGenericMeassureListNxInfoOps[Self <: IGenericMeassureListNxInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQType(value: MeasureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

