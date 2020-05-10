package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the list of variables in an app.
  */
@js.native
trait IVariableListDef extends js.Object {
  /**
    * Data Type JSON
    */
  var qData: js.Any = js.native
  /**
    * Shows the system variables if set to true.
    */
  var qShowConfig: Boolean = js.native
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: Boolean = js.native
  /**
    * Type of the list.
    */
  var qType: String = js.native
}

object IVariableListDef {
  @scala.inline
  def apply(qData: js.Any, qShowConfig: Boolean, qShowReserved: Boolean, qType: String): IVariableListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qShowConfig = qShowConfig.asInstanceOf[js.Any], qShowReserved = qShowReserved.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableListDef]
  }
  @scala.inline
  implicit class IVariableListDefOps[Self <: IVariableListDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQShowConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQShowReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

