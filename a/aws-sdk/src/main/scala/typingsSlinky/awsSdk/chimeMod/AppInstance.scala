package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstance extends StObject {
  
  /**
    * The ARN of the messaging instance. 
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which an app instance was created. In epoch milliseconds.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The time an app instance was last updated. In epoch milliseconds.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The metadata of an app instance.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The name of an app instance.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.native
}
object AppInstance {
  
  @scala.inline
  def apply(): AppInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstance]
  }
  
  @scala.inline
  implicit class AppInstanceMutableBuilder[Self <: AppInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
