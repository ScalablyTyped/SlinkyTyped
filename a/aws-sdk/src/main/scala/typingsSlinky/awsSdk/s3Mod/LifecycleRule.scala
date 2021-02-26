package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends StObject {
  
  var AbortIncompleteMultipartUpload: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  
  /**
    * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
  
  var NoncurrentVersionExpiration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  
  /**
    *  Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set period in the object's lifetime. 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.native
  
  /**
    * Prefix identifying one or more objects to which the rule applies. This is No longer used; use Filter instead.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  
  /**
    * Specifies when an Amazon S3 object transitions to a specified storage class.
    */
  var Transitions: js.UndefOr[TransitionList] = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(Status: ExpirationStatus): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleMutableBuilder[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setFilter(value: LifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: NoncurrentVersionTransitionList): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setStatus(value: ExpirationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitions(value: TransitionList): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "Transitions", js.Array(value :_*))
  }
}
