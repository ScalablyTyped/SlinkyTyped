package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicy extends StObject {
  
  /**
    * The unique identifier for the origin request policy.
    */
  var Id: String = js.native
  
  /**
    * The date and time when the origin request policy was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * The origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typingsSlinky.awsSdk.cloudfrontMod.OriginRequestPolicyConfig = js.native
}
object OriginRequestPolicy {
  
  @scala.inline
  def apply(Id: String, LastModifiedTime: js.Date, OriginRequestPolicyConfig: OriginRequestPolicyConfig): OriginRequestPolicy = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicy]
  }
  
  @scala.inline
  implicit class OriginRequestPolicyMutableBuilder[Self <: OriginRequestPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
}
