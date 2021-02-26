package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action executed during setup.
  */
@js.native
trait SchemaSetupAction extends StObject {
  
  /**
    * Description of this action.
    */
  var description: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * An action to launch an app.
    */
  var launchApp: js.UndefOr[SchemaLaunchAppAction] = js.native
  
  /**
    * Title of this action.
    */
  var title: js.UndefOr[SchemaUserFacingMessage] = js.native
}
object SchemaSetupAction {
  
  @scala.inline
  def apply(): SchemaSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupAction]
  }
  
  @scala.inline
  implicit class SchemaSetupActionMutableBuilder[Self <: SchemaSetupAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SchemaUserFacingMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLaunchApp(value: SchemaLaunchAppAction): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
    
    @scala.inline
    def setTitle(value: SchemaUserFacingMessage): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
