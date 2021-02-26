package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedZoneOwner extends StObject {
  
  /**
    * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones using the current account, OwningAccount contains the account ID of that account. For example, when you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account. 
    */
  var OwningAccount: js.UndefOr[AWSAccountID] = js.native
  
  /**
    * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted zone, OwningService contains an abbreviation that identifies the service. For example, if Amazon Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of OwningService is efs.amazonaws.com.
    */
  var OwningService: js.UndefOr[HostedZoneOwningService] = js.native
}
object HostedZoneOwner {
  
  @scala.inline
  def apply(): HostedZoneOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneOwner]
  }
  
  @scala.inline
  implicit class HostedZoneOwnerMutableBuilder[Self <: HostedZoneOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwningAccount(value: AWSAccountID): Self = StObject.set(x, "OwningAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwningAccountUndefined: Self = StObject.set(x, "OwningAccount", js.undefined)
    
    @scala.inline
    def setOwningService(value: HostedZoneOwningService): Self = StObject.set(x, "OwningService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwningServiceUndefined: Self = StObject.set(x, "OwningService", js.undefined)
  }
}
