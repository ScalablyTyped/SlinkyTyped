package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationRestoreConfiguration extends StObject {
  
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreType = js.native
  
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotName] = js.native
}
object ApplicationRestoreConfiguration {
  
  @scala.inline
  def apply(ApplicationRestoreType: ApplicationRestoreType): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationRestoreConfigurationMutableBuilder[Self <: ApplicationRestoreConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationRestoreType(value: ApplicationRestoreType): Self = StObject.set(x, "ApplicationRestoreType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
  }
}
