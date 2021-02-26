package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicAccessBlockConfiguration extends StObject {
  
  /**
    * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   PUT Bucket calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs. This is not supported for Amazon S3 on Outposts.
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies. This is not supported for Amazon S3 on Outposts.
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they contain.  Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. This is not supported for Amazon S3 on Outposts.
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should restrict public bucket policies for buckets in this account. Setting this element to TRUE restricts access to buckets with public policies to only AWS service principals and authorized users within this account. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. This is not supported for Amazon S3 on Outposts.
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.native
}
object PublicAccessBlockConfiguration {
  
  @scala.inline
  def apply(): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
  
  @scala.inline
  implicit class PublicAccessBlockConfigurationMutableBuilder[Self <: PublicAccessBlockConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockPublicAcls(value: Setting): Self = StObject.set(x, "BlockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAclsUndefined: Self = StObject.set(x, "BlockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: Setting): Self = StObject.set(x, "BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicPolicyUndefined: Self = StObject.set(x, "BlockPublicPolicy", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: Setting): Self = StObject.set(x, "IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePublicAclsUndefined: Self = StObject.set(x, "IgnorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: Setting): Self = StObject.set(x, "RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "RestrictPublicBuckets", js.undefined)
  }
}
