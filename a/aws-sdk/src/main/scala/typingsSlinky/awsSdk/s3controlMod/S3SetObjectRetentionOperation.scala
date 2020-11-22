package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SetObjectRetentionOperation extends js.Object {
  
  /**
    * Indicates if the action should be applied to objects in the Batch Operations job even if they have Object Lock  GOVERNANCE type in place.
    */
  var BypassGovernanceRetention: js.UndefOr[Boolean] = js.native
  
  /**
    * Contains the Object Lock retention mode to be applied to all objects in the Batch Operations job. For more information, see Using S3 Object Lock retention with S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.
    */
  var Retention: S3Retention = js.native
}
object S3SetObjectRetentionOperation {
  
  @scala.inline
  def apply(Retention: S3Retention): S3SetObjectRetentionOperation = {
    val __obj = js.Dynamic.literal(Retention = Retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectRetentionOperation]
  }
  
  @scala.inline
  implicit class S3SetObjectRetentionOperationOps[Self <: S3SetObjectRetentionOperation] (val x: Self) extends AnyVal {
    
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
    def setRetention(value: S3Retention): Self = this.set("Retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetention(value: Boolean): Self = this.set("BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassGovernanceRetention: Self = this.set("BypassGovernanceRetention", js.undefined)
  }
}
