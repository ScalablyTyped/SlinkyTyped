package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxVariableListItem...
  */
@js.native
trait INxVariableListItem extends js.Object {
  /**
    * Data.
    */
  var qData: js.Any = js.native
  /**
    * Definition of the variable. It can be a value or an expression.
    */
  var qDefinition: String = js.native
  /**
    * Description of the variable.
    */
  var qDescription: String = js.native
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo = js.native
  /**
    * If set to true, it means that the variable is a system variable.
    * A system variable provides information about the system and is set by the engine.
    * The content cannot be changed by the user.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsConfig: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the variable is reserved.
    * >> This parameter is optional.
    * >> The default value is false.
    *
    * Examples:
    * - ScriptError is a reserved variable, set by the engine.
    * - DayNames is a reserved variable, set by the user.
    */
  var qIsReserved: js.UndefOr[Boolean] = js.native
   // ? nicht dokumentiert
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean = js.native
  /**
    * Information about publishing and permissions.
    * >> This parameter is optional.
    */
  var qMeta: js.UndefOr[INxMeta] = js.native
  /**
    * Name of the variable.
    */
  var qName: String = js.native
}

object INxVariableListItem {
  @scala.inline
  def apply(
    qData: js.Any,
    qDefinition: String,
    qDescription: String,
    qInfo: INxInfo,
    qIsScriptCreated: Boolean,
    qName: String
  ): INxVariableListItem = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qDefinition = qDefinition.asInstanceOf[js.Any], qDescription = qDescription.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qIsScriptCreated = qIsScriptCreated.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxVariableListItem]
  }
  @scala.inline
  implicit class INxVariableListItemOps[Self <: INxVariableListItem] (val x: Self) extends AnyVal {
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
    def withQDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInfo(value: INxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsScriptCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsScriptCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withQIsReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsReserved")(js.undefined)
        ret
    }
    @scala.inline
    def withQMeta(value: INxMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(js.undefined)
        ret
    }
  }
  
}

