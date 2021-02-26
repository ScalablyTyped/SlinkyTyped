package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverQueryLogConfig extends StObject {
  
  /**
    * The ARN for the query logging configuration.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Arn] = js.native
  
  /**
    * The number of VPCs that are associated with the query logging configuration.
    */
  var AssociationCount: js.UndefOr[Count] = js.native
  
  /**
    * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * A unique string that identifies the request that created the query logging configuration. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  
  /**
    * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
    */
  var DestinationArn: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.DestinationArn] = js.native
  
  /**
    * The ID for the query logging configuration.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the query logging configuration. 
    */
  var Name: js.UndefOr[ResolverQueryLogConfigName] = js.native
  
  /**
    * The AWS account ID for the account that created the query logging configuration. 
    */
  var OwnerId: js.UndefOr[AccountId] = js.native
  
  /**
    * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
    */
  var ShareStatus: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ShareStatus] = js.native
  
  /**
    * The status of the specified query logging configuration. Valid values include the following:    CREATING: Resolver is creating the query logging configuration.    CREATED: The query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging configuration.    FAILED: Resolver can't deliver logs to the location that is specified in the query logging configuration. Here are two common causes:   The specified destination (for example, an Amazon S3 bucket) was deleted.   Permissions don't allow sending logs to the destination.    
    */
  var Status: js.UndefOr[ResolverQueryLogConfigStatus] = js.native
}
object ResolverQueryLogConfig {
  
  @scala.inline
  def apply(): ResolverQueryLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfig]
  }
  
  @scala.inline
  implicit class ResolverQueryLogConfigMutableBuilder[Self <: ResolverQueryLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAssociationCount(value: Count): Self = StObject.set(x, "AssociationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationCountUndefined: Self = StObject.set(x, "AssociationCount", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ResolverQueryLogConfigName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverQueryLogConfigStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
