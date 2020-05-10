package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.AccWizObjects.FieldList
import typingsSlinky.activexAccess.AccWizObjects.ImexGrid
import typingsSlinky.activexAccess.AccWizObjects.WizShellLinkA
import typingsSlinky.activexAccess.Access.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("ACCWIZ.FieldListCtrl")
  var ACCWIZDotFieldListCtrl: FieldList = js.native
  @JSName("ACCWIZ.ImexGridCtrl")
  var ACCWIZDotImexGridCtrl: ImexGrid = js.native
  @JSName("Access.Application")
  var AccessDotApplication: Application = js.native
  var lnkfile: WizShellLinkA = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    ACCWIZDotFieldListCtrl: FieldList,
    ACCWIZDotImexGridCtrl: ImexGrid,
    AccessDotApplication: Application,
    lnkfile: WizShellLinkA
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(lnkfile = lnkfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(ACCWIZDotFieldListCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(ACCWIZDotImexGridCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Application")(AccessDotApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCWIZDotFieldListCtrl(value: FieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCWIZ.FieldListCtrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACCWIZDotImexGridCtrl(value: ImexGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCWIZ.ImexGridCtrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessDotApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLnkfile(value: WizShellLinkA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnkfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

