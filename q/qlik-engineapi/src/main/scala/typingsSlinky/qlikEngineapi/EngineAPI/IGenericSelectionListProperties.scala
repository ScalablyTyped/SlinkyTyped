package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionListProperties width extend GenericObjectProperties
  */
@js.native
trait IGenericSelectionListProperties extends IGenericObjectProperties {
  @JSName("qInfo")
  var qInfo_IGenericSelectionListProperties: IGenericSelectionNxInfo = js.native
  var qSelectionObjectDef: js.Any = js.native
}

object IGenericSelectionListProperties {
  @scala.inline
  def apply(qInfo: IGenericSelectionNxInfo, qSelectionObjectDef: js.Any): IGenericSelectionListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qSelectionObjectDef = qSelectionObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListProperties]
  }
  @scala.inline
  implicit class IGenericSelectionListPropertiesOps[Self <: IGenericSelectionListProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQInfo(value: IGenericSelectionNxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectionObjectDef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectionObjectDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

