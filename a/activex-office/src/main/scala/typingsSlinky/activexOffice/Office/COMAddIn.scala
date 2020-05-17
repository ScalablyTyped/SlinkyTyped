package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait COMAddIn extends js.Object {
  val Application: js.Any = js.native
  var Connect: Boolean = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  val Guid: String = js.native
  var Object: js.Any = js.native
  @JSName("Office.COMAddIn_typekey")
  var OfficeDotCOMAddIn_typekey: COMAddIn = js.native
  val Parent: js.Any = js.native
  val ProgId: String = js.native
}

object COMAddIn {
  @scala.inline
  def apply(
    Application: js.Any,
    Connect: Boolean,
    Creator: Double,
    Description: String,
    Guid: String,
    Object: js.Any,
    OfficeDotCOMAddIn_typekey: COMAddIn,
    Parent: js.Any,
    ProgId: String
  ): COMAddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Connect = Connect.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgId = ProgId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.COMAddIn_typekey")(OfficeDotCOMAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMAddIn]
  }
  @scala.inline
  implicit class COMAddInOps[Self <: COMAddIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotCOMAddIn_typekey(value: COMAddIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.COMAddIn_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

