package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountPublicAccessBlockMod {
  
  @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock")
  @js.native
  class AccountPublicAccessBlock protected () extends CustomResource {
    /**
      * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
      * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
      * * PUT Object calls will fail if the request includes an object ACL.
      */
    val blockPublicAcls: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
      * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
      */
    val blockPublicPolicy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
      * * Ignore all public ACLs on buckets in this account and any objects that they contain.
      */
    val ignorePublicAcls: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
      * * Only the bucket owner and AWS Services can access buckets with public policies.
      */
    val restrictPublicBuckets: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object AccountPublicAccessBlock {
    
    /**
      * Get an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID]): AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState): AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState, opts: CustomResourceOptions): AccountPublicAccessBlock = js.native
    
    /**
      * Returns true if the given object is an instance of AccountPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean = js.native
  }
  
  @js.native
  trait AccountPublicAccessBlockArgs extends StObject {
    
    /**
      * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
      * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
      * * PUT Object calls will fail if the request includes an object ACL.
      */
    val blockPublicAcls: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
      * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
      * * Ignore all public ACLs on buckets in this account and any objects that they contain.
      */
    val ignorePublicAcls: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
      * * Only the bucket owner and AWS Services can access buckets with public policies.
      */
    val restrictPublicBuckets: js.UndefOr[Input[Boolean]] = js.native
  }
  object AccountPublicAccessBlockArgs {
    
    @scala.inline
    def apply(): AccountPublicAccessBlockArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountPublicAccessBlockArgs]
    }
    
    @scala.inline
    implicit class AccountPublicAccessBlockArgsMutableBuilder[Self <: AccountPublicAccessBlockArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setBlockPublicAcls(value: Input[Boolean]): Self = StObject.set(x, "blockPublicAcls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicAclsUndefined: Self = StObject.set(x, "blockPublicAcls", js.undefined)
      
      @scala.inline
      def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      @scala.inline
      def setIgnorePublicAcls(value: Input[Boolean]): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePublicAclsUndefined: Self = StObject.set(x, "ignorePublicAcls", js.undefined)
      
      @scala.inline
      def setRestrictPublicBuckets(value: Input[Boolean]): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "restrictPublicBuckets", js.undefined)
    }
  }
  
  @js.native
  trait AccountPublicAccessBlockState extends StObject {
    
    /**
      * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
      * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
      * * PUT Object calls will fail if the request includes an object ACL.
      */
    val blockPublicAcls: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
      * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
      */
    val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
      * * Ignore all public ACLs on buckets in this account and any objects that they contain.
      */
    val ignorePublicAcls: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
      * * Only the bucket owner and AWS Services can access buckets with public policies.
      */
    val restrictPublicBuckets: js.UndefOr[Input[Boolean]] = js.native
  }
  object AccountPublicAccessBlockState {
    
    @scala.inline
    def apply(): AccountPublicAccessBlockState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountPublicAccessBlockState]
    }
    
    @scala.inline
    implicit class AccountPublicAccessBlockStateMutableBuilder[Self <: AccountPublicAccessBlockState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setBlockPublicAcls(value: Input[Boolean]): Self = StObject.set(x, "blockPublicAcls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicAclsUndefined: Self = StObject.set(x, "blockPublicAcls", js.undefined)
      
      @scala.inline
      def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
      
      @scala.inline
      def setIgnorePublicAcls(value: Input[Boolean]): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePublicAclsUndefined: Self = StObject.set(x, "ignorePublicAcls", js.undefined)
      
      @scala.inline
      def setRestrictPublicBuckets(value: Input[Boolean]): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "restrictPublicBuckets", js.undefined)
    }
  }
}
