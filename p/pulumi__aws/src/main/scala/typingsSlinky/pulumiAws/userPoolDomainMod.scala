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

object userPoolDomainMod {
  
  @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
  @js.native
  class UserPoolDomain protected () extends CustomResource {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolDomainArgs) = this()
    def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS account ID for the user pool owner.
      */
    val awsAccountId: Output_[String] = js.native
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
      */
    val cloudfrontDistributionArn: Output_[String] = js.native
    
    /**
      * The domain string.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The S3 bucket where the static files for this domain are stored.
      */
    val s3Bucket: Output_[String] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: Output_[String] = js.native
    
    /**
      * The app version.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object UserPoolDomain {
    
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID]): UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): UserPoolDomain = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
  @js.native
  trait UserPoolDomainArgs extends StObject {
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain string.
      */
    val domain: Input[String] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: Input[String] = js.native
  }
  object UserPoolDomainArgs {
    
    @scala.inline
    def apply(domain: Input[String], userPoolId: Input[String]): UserPoolDomainArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPoolDomainArgs]
    }
    
    @scala.inline
    implicit class UserPoolDomainArgsMutableBuilder[Self <: UserPoolDomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserPoolDomainState extends StObject {
    
    /**
      * The AWS account ID for the user pool owner.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
      */
    val cloudfrontDistributionArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain string.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The S3 bucket where the static files for this domain are stored.
      */
    val s3Bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The app version.
      */
    val version: js.UndefOr[Input[String]] = js.native
  }
  object UserPoolDomainState {
    
    @scala.inline
    def apply(): UserPoolDomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolDomainState]
    }
    
    @scala.inline
    implicit class UserPoolDomainStateMutableBuilder[Self <: UserPoolDomainState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setCloudfrontDistributionArn(value: Input[String]): Self = StObject.set(x, "cloudfrontDistributionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontDistributionArnUndefined: Self = StObject.set(x, "cloudfrontDistributionArn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
