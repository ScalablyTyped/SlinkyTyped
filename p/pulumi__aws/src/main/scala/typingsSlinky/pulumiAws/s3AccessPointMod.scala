package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.s3.AccessPointPublicAccessBlockConfiguration
import typingsSlinky.pulumiAws.outputMod.s3.AccessPointVpcConfiguration
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3AccessPointMod {
  
  @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint")
  @js.native
  class AccessPoint protected () extends CustomResource {
    /**
      * Create a AccessPoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessPointArgs) = this()
    def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the S3 Access Point.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
      * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * Indicates whether this access point currently has a policy that allows public access.
      */
    val hasPublicAccessPolicy: Output_[Boolean] = js.native
    
    /**
      * The name you want to assign to this access point.
      */
    val name: Output_[String] = js.native
    
    /**
      * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
      */
    val networkOrigin: Output_[String] = js.native
    
    /**
      * A valid JSON document that specifies the policy that you want to apply to this access point.
      */
    val policy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
      */
    val publicAccessBlockConfiguration: Output_[js.UndefOr[AccessPointPublicAccessBlockConfiguration]] = js.native
    
    /**
      * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
      */
    val vpcConfiguration: Output_[js.UndefOr[AccessPointVpcConfiguration]] = js.native
  }
  /* static members */
  object AccessPoint {
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID]): AccessPoint = js.native
    @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccessPoint = js.native
    @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState): AccessPoint = js.native
    @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): AccessPoint = js.native
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accessPoint.AccessPoint */ Boolean = js.native
  }
  
  @js.native
  trait AccessPointArgs extends StObject {
    
    /**
      * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
      */
    val bucket: Input[String] = js.native
    
    /**
      * The name you want to assign to this access point.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid JSON document that specifies the policy that you want to apply to this access point.
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
      */
    val publicAccessBlockConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration]
      ] = js.native
    
    /**
      * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
      */
    val vpcConfiguration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration]] = js.native
  }
  object AccessPointArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): AccessPointArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointArgs]
    }
    
    @scala.inline
    implicit class AccessPointArgsMutableBuilder[Self <: AccessPointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPublicAccessBlockConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration]): Self = StObject.set(x, "publicAccessBlockConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "publicAccessBlockConfiguration", js.undefined)
      
      @scala.inline
      def setVpcConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration]): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait AccessPointState extends StObject {
    
    /**
      * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the S3 Access Point.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
      * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
      */
    val domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether this access point currently has a policy that allows public access.
      */
    val hasPublicAccessPolicy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name you want to assign to this access point.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
      */
    val networkOrigin: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid JSON document that specifies the policy that you want to apply to this access point.
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
      */
    val publicAccessBlockConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration]
      ] = js.native
    
    /**
      * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
      */
    val vpcConfiguration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration]] = js.native
  }
  object AccessPointState {
    
    @scala.inline
    def apply(): AccessPointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessPointState]
    }
    
    @scala.inline
    implicit class AccessPointStateMutableBuilder[Self <: AccessPointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setHasPublicAccessPolicy(value: Input[Boolean]): Self = StObject.set(x, "hasPublicAccessPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPublicAccessPolicyUndefined: Self = StObject.set(x, "hasPublicAccessPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetworkOrigin(value: Input[String]): Self = StObject.set(x, "networkOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkOriginUndefined: Self = StObject.set(x, "networkOrigin", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPublicAccessBlockConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration]): Self = StObject.set(x, "publicAccessBlockConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "publicAccessBlockConfiguration", js.undefined)
      
      @scala.inline
      def setVpcConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AccessPointVpcConfiguration]): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
    }
  }
}
