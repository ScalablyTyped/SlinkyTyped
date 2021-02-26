package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebookInstanceMod {
  
  @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance")
  @js.native
  class NotebookInstance protected () extends CustomResource {
    /**
      * Create a NotebookInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotebookInstanceArgs) = this()
    def this(name: String, args: NotebookInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An array of up to three Git repositories to associate with the notebook instance.
      * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
      */
    val additionalCodeRepositories: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
      */
    val defaultCodeRepository: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
      */
    val directInternetAccess: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of ML compute instance type.
      */
    val instanceType: Output_[String] = js.native
    
    /**
      * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of a lifecycle configuration to associate with the notebook instance.
      */
    val lifecycleConfigName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the notebook instance (must be unique).
      */
    val name: Output_[String] = js.native
    
    /**
      * The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnetId`.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
      */
    val rootAccess: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The associated security groups.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The VPC subnet ID.
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
      */
    val url: Output_[String] = js.native
    
    /**
      * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
      */
    val volumeSize: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object NotebookInstance {
    
    /**
      * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState): NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): NotebookInstance = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
  }
  
  @js.native
  trait NotebookInstanceArgs extends StObject {
    
    /**
      * An array of up to three Git repositories to associate with the notebook instance.
      * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
      */
    val additionalCodeRepositories: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
      */
    val defaultCodeRepository: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
      */
    val directInternetAccess: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of ML compute instance type.
      */
    val instanceType: Input[String] = js.native
    
    /**
      * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of a lifecycle configuration to associate with the notebook instance.
      */
    val lifecycleConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the notebook instance (must be unique).
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
      */
    val roleArn: Input[String] = js.native
    
    /**
      * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
      */
    val rootAccess: js.UndefOr[Input[String]] = js.native
    
    /**
      * The associated security groups.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The VPC subnet ID.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
      */
    val volumeSize: js.UndefOr[Input[Double]] = js.native
  }
  object NotebookInstanceArgs {
    
    @scala.inline
    def apply(instanceType: Input[String], roleArn: Input[String]): NotebookInstanceArgs = {
      val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookInstanceArgs]
    }
    
    @scala.inline
    implicit class NotebookInstanceArgsMutableBuilder[Self <: NotebookInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalCodeRepositories(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalCodeRepositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "additionalCodeRepositories", js.undefined)
      
      @scala.inline
      def setAdditionalCodeRepositoriesVarargs(value: Input[String]*): Self = StObject.set(x, "additionalCodeRepositories", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCodeRepository(value: Input[String]): Self = StObject.set(x, "defaultCodeRepository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "defaultCodeRepository", js.undefined)
      
      @scala.inline
      def setDirectInternetAccess(value: Input[String]): Self = StObject.set(x, "directInternetAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectInternetAccessUndefined: Self = StObject.set(x, "directInternetAccess", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLifecycleConfigName(value: Input[String]): Self = StObject.set(x, "lifecycleConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleConfigNameUndefined: Self = StObject.set(x, "lifecycleConfigName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootAccess(value: Input[String]): Self = StObject.set(x, "rootAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootAccessUndefined: Self = StObject.set(x, "rootAccess", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    }
  }
  
  @js.native
  trait NotebookInstanceState extends StObject {
    
    /**
      * An array of up to three Git repositories to associate with the notebook instance.
      * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
      */
    val additionalCodeRepositories: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
      */
    val defaultCodeRepository: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
      */
    val directInternetAccess: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of ML compute instance type.
      */
    val instanceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of a lifecycle configuration to associate with the notebook instance.
      */
    val lifecycleConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the notebook instance (must be unique).
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnetId`.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
      */
    val rootAccess: js.UndefOr[Input[String]] = js.native
    
    /**
      * The associated security groups.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The VPC subnet ID.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
      */
    val url: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
      */
    val volumeSize: js.UndefOr[Input[Double]] = js.native
  }
  object NotebookInstanceState {
    
    @scala.inline
    def apply(): NotebookInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookInstanceState]
    }
    
    @scala.inline
    implicit class NotebookInstanceStateMutableBuilder[Self <: NotebookInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalCodeRepositories(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalCodeRepositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "additionalCodeRepositories", js.undefined)
      
      @scala.inline
      def setAdditionalCodeRepositoriesVarargs(value: Input[String]*): Self = StObject.set(x, "additionalCodeRepositories", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDefaultCodeRepository(value: Input[String]): Self = StObject.set(x, "defaultCodeRepository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "defaultCodeRepository", js.undefined)
      
      @scala.inline
      def setDirectInternetAccess(value: Input[String]): Self = StObject.set(x, "directInternetAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectInternetAccessUndefined: Self = StObject.set(x, "directInternetAccess", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLifecycleConfigName(value: Input[String]): Self = StObject.set(x, "lifecycleConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleConfigNameUndefined: Self = StObject.set(x, "lifecycleConfigName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setRootAccess(value: Input[String]): Self = StObject.set(x, "rootAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootAccessUndefined: Self = StObject.set(x, "rootAccess", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    }
  }
}
