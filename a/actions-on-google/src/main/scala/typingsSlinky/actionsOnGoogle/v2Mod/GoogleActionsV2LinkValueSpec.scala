package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2LinkValueSpec extends StObject {
  
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.native
  
  /**
    * Destination that the app should link to. Could be a web URL, a
    * conversational link or an Android intent. A web URL is used to handoff the
    * flow to some website. A conversational link is used to provide a deep link
    * into another AoG app. An Android intent URI is used to trigger an Android
    * intent. This requires the package_name to be specified.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
}
object GoogleActionsV2LinkValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2LinkValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2LinkValueSpecMutableBuilder[Self <: GoogleActionsV2LinkValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
    
    @scala.inline
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
  }
}
