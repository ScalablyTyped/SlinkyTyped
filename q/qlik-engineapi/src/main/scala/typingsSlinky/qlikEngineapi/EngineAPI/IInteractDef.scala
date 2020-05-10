package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InteractDef
  */
@js.native
trait IInteractDef extends js.Object {
  /**
    * Buttons displayed in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    * One of:
    *
    * - 0 means that the qButtons property is not relevant.
    * - 17 means that the message box contains the OK and Cancel buttons or the stop-sign icon.
    */
  var qButtons: js.UndefOr[Double] = js.native
  /**
    * This property is set to true if the returned statement is an hidden script statement.
    */
  var qHidden: js.UndefOr[Boolean] = js.native
  /**
    * Is not used in Qlik Sense.
    */
  var qInput: js.UndefOr[String] = js.native
  /**
    * Next script statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qLine: js.UndefOr[String] = js.native
  /**
    * Message used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qMsg: js.UndefOr[String] = js.native
  /**
    * First line number of the next statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qNewLineNr: js.UndefOr[Double] = js.native
  /**
    * First line number of the previously executed statement.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qOldLineNr: js.UndefOr[Double] = js.native
  /**
    * Path specified by the Include script variable.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    * Example of an Include variable:
    *
    * $(Include=lib:\\MyDataFiles\abc.txt);
    */
  var qPath: js.UndefOr[String] = js.native
  /**
    * Not relevant for describing the requested user interaction.
    */
  var qResult: Double = js.native
  /**
    * Title used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qTitle: js.UndefOr[String] = js.native
  /**
    * Interaction type.
    */
  var qType: js.UndefOr[InteractionType] = js.native
}

object IInteractDef {
  @scala.inline
  def apply(qResult: Double): IInteractDef = {
    val __obj = js.Dynamic.literal(qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractDef]
  }
  @scala.inline
  implicit class IInteractDefOps[Self <: IInteractDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQButtons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withQHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withQInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInput")(js.undefined)
        ret
    }
    @scala.inline
    def withQLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLine")(js.undefined)
        ret
    }
    @scala.inline
    def withQMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withQNewLineNr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNewLineNr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNewLineNr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNewLineNr")(js.undefined)
        ret
    }
    @scala.inline
    def withQOldLineNr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOldLineNr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQOldLineNr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOldLineNr")(js.undefined)
        ret
    }
    @scala.inline
    def withQPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPath")(js.undefined)
        ret
    }
    @scala.inline
    def withQTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withQType(value: InteractionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(js.undefined)
        ret
    }
  }
  
}

