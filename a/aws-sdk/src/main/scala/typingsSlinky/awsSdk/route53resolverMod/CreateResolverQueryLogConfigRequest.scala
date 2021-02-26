package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResolverQueryLogConfigRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typingsSlinky.awsSdk.route53resolverMod.CreatorRequestId = js.native
  
  /**
    * The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values include the following:    S3 bucket:   arn:aws:s3:::examplebucket  You can optionally append a file prefix to the end of the ARN.  arn:aws:s3:::examplebucket/development/     CloudWatch Logs log group:   arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*     Kinesis Data Firehose delivery stream:  arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name   
    */
  var DestinationArn: typingsSlinky.awsSdk.route53resolverMod.DestinationArn = js.native
  
  /**
    * The name that you want to give the query logging configuration
    */
  var Name: ResolverQueryLogConfigName = js.native
  
  /**
    * A list of the tag keys and values that you want to associate with the query logging configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateResolverQueryLogConfigRequest {
  
  @scala.inline
  def apply(
    CreatorRequestId: CreatorRequestId,
    DestinationArn: DestinationArn,
    Name: ResolverQueryLogConfigName
  ): CreateResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], DestinationArn = DestinationArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit class CreateResolverQueryLogConfigRequestMutableBuilder[Self <: CreateResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResolverQueryLogConfigName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
