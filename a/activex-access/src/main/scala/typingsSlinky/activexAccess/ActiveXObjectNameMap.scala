package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.AccWizObjects.FieldList
import typingsSlinky.activexAccess.AccWizObjects.ImexGrid
import typingsSlinky.activexAccess.AccWizObjects.WizShellLinkA
import typingsSlinky.activexAccess.Access.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("ACCWIZ.FieldListCtrl")
  var ACCWIZDotFieldListCtrl: FieldList
  @JSName("ACCWIZ.ImexGridCtrl")
  var ACCWIZDotImexGridCtrl: ImexGrid
  @JSName("Access.Application")
  var AccessDotApplication: Application
  var lnkfile: WizShellLinkA
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
}

