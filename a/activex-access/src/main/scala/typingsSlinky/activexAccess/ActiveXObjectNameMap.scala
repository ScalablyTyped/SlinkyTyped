package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.AccWizObjects.FieldList
import typingsSlinky.activexAccess.AccWizObjects.ImexGrid
import typingsSlinky.activexAccess.AccWizObjects.WizShellLinkA
import typingsSlinky.activexAccess.Access.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
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
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACCWIZDotFieldListCtrl(value: FieldList): Self = StObject.set(x, "ACCWIZ.FieldListCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACCWIZDotImexGridCtrl(value: ImexGrid): Self = StObject.set(x, "ACCWIZ.ImexGridCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessDotApplication(value: Application): Self = StObject.set(x, "Access.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLnkfile(value: WizShellLinkA): Self = StObject.set(x, "lnkfile", value.asInstanceOf[js.Any])
  }
}
