package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderConfiguration extends StObject {
  
  /**
    * The action to take on the folder contents at the end of the folder configuration period.
    */
  var Action: RetentionAction = js.native
  
  /**
    * The folder name.
    */
  var Name: FolderName = js.native
  
  /**
    * The period of time at which the folder configuration action is applied.
    */
  var Period: js.UndefOr[RetentionPeriod] = js.native
}
object FolderConfiguration {
  
  @scala.inline
  def apply(Action: RetentionAction, Name: FolderName): FolderConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderConfiguration]
  }
  
  @scala.inline
  implicit class FolderConfigurationMutableBuilder[Self <: FolderConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RetentionAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: RetentionPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
  }
}
