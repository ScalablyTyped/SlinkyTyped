package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CurrentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionNxInfo width extend NxInfo
  */
@js.native
trait IGenericSelectionNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericSelectionNxInfo: CurrentSelection = js.native
}

object IGenericSelectionNxInfo {
  @scala.inline
  def apply(qType: CurrentSelection): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
  @scala.inline
  implicit class IGenericSelectionNxInfoOps[Self <: IGenericSelectionNxInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQType(value: CurrentSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

