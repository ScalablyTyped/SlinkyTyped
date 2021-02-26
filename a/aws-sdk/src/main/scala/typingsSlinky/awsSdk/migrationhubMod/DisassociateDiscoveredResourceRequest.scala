package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateDiscoveredResourceRequest extends StObject {
  
  /**
    * ConfigurationId of the Application Discovery Service resource to be disassociated.
    */
  var ConfigurationId: typingsSlinky.awsSdk.migrationhubMod.ConfigurationId = js.native
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.DryRun] = js.native
  
  /**
    * The identifier given to the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName = js.native
  
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}
object DisassociateDiscoveredResourceRequest {
  
  @scala.inline
  def apply(
    ConfigurationId: ConfigurationId,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream
  ): DisassociateDiscoveredResourceRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDiscoveredResourceRequest]
  }
  
  @scala.inline
  implicit class DisassociateDiscoveredResourceRequestMutableBuilder[Self <: DisassociateDiscoveredResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
