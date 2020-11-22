package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerReplicationParameters extends js.Object {
  
  /**
    * Indicates whether the replication job produces encrypted AMIs.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  
  /**
    * The frequency of creating replication jobs for the server.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias   If encrypted is enabled but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The license type for creating a replication job for the server.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  
  /**
    * The number of recent AMIs to keep when creating a replication job for this server.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  
  /**
    * Indicates whether to run the replication job one time.
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  
  /**
    * The seed time for creating a replication job for the server.
    */
  var seedTime: js.UndefOr[js.Date] = js.native
}
object ServerReplicationParameters {
  
  @scala.inline
  def apply(): ServerReplicationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationParameters]
  }
  
  @scala.inline
  implicit class ServerReplicationParametersOps[Self <: ServerReplicationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setFrequency(value: Frequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseType(value: LicenseType): Self = this.set("licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseType: Self = this.set("licenseType", js.undefined)
    
    @scala.inline
    def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = this.set("numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRecentAmisToKeep: Self = this.set("numberOfRecentAmisToKeep", js.undefined)
    
    @scala.inline
    def setRunOnce(value: RunOnce): Self = this.set("runOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnce: Self = this.set("runOnce", js.undefined)
    
    @scala.inline
    def setSeedTime(value: js.Date): Self = this.set("seedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeedTime: Self = this.set("seedTime", js.undefined)
  }
}
