package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.outputMod.datasync.S3LocationS3Config
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3locationMod {
  
  @JSImport("@pulumi/aws/datasync/s3location", "S3Location")
  @js.native
  class S3Location protected () extends CustomResource {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3LocationArgs) = this()
    def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: Output_[ARN] = js.native
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: Output_[S3LocationS3Config] = js.native
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: Output_[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val uri: Output_[String] = js.native
  }
  /* static members */
  object S3Location {
    
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location.get")
    @js.native
    def get(name: String, id: Input[ID]): S3Location = js.native
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): S3Location = js.native
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3LocationState): S3Location = js.native
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): S3Location = js.native
    
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datasync/s3location", "S3Location.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = js.native
  }
  
  @js.native
  trait S3LocationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: Input[ARN] = js.native
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: Input[typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config] = js.native
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: Input[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object S3LocationArgs {
    
    @scala.inline
    implicit class S3LocationArgsMutableBuilder[Self <: S3LocationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3BucketArn(value: Input[ARN]): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Config(value: Input[typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config]): Self = StObject.set(x, "s3Config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait S3LocationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the S3 Bucket.
      */
    val s3BucketArn: js.UndefOr[Input[ARN]] = js.native
    
    /**
      * Configuration block containing information for connecting to S3.
      */
    val s3Config: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config]] = js.native
    
    /**
      * Prefix to perform actions as source or destination.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    val uri: js.UndefOr[Input[String]] = js.native
  }
  object S3LocationState {
    
    @scala.inline
    def apply(): S3LocationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3LocationState]
    }
    
    @scala.inline
    implicit class S3LocationStateMutableBuilder[Self <: S3LocationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setS3BucketArn(value: Input[ARN]): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketArnUndefined: Self = StObject.set(x, "s3BucketArn", js.undefined)
      
      @scala.inline
      def setS3Config(value: Input[typingsSlinky.pulumiAws.inputMod.datasync.S3LocationS3Config]): Self = StObject.set(x, "s3Config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ConfigUndefined: Self = StObject.set(x, "s3Config", js.undefined)
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
