package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.elasticbeanstalkMod.Application
import typingsSlinky.pulumiAws.s3Mod.Bucket
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationVersionMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
  @js.native
  class ApplicationVersion protected () extends CustomResource {
    /**
      * Create a ApplicationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationVersionArgs) = this()
    def this(name: String, args: ApplicationVersionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name of the Beanstalk Application the version is associated with.
      */
    val application: Output_[String] = js.native
    
    /**
      * The ARN assigned by AWS for this Elastic Beanstalk Application.
      */
    val arn: Output_[String] = js.native
    
    /**
      * S3 bucket that contains the Application Version source bundle.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Short description of the Application Version.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * On delete, force an Application Version to be deleted when it may be in use
      * by multiple Elastic Beanstalk Environments.
      */
    val forceDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * S3 object that is the Application Version source bundle.
      */
    val key: Output_[String] = js.native
    
    /**
      * A unique name for the this Application Version.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application Version.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ApplicationVersion {
    
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID]): ApplicationVersion = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ApplicationVersion = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): ApplicationVersion = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): ApplicationVersion = js.native
    
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
  }
  
  @js.native
  trait ApplicationVersionArgs extends StObject {
    
    /**
      * Name of the Beanstalk Application the version is associated with.
      */
    val application: Input[String | Application] = js.native
    
    /**
      * S3 bucket that contains the Application Version source bundle.
      */
    val bucket: Input[String | Bucket] = js.native
    
    /**
      * Short description of the Application Version.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * On delete, force an Application Version to be deleted when it may be in use
      * by multiple Elastic Beanstalk Environments.
      */
    val forceDelete: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * S3 object that is the Application Version source bundle.
      */
    val key: Input[String] = js.native
    
    /**
      * A unique name for the this Application Version.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application Version.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ApplicationVersionArgs {
    
    @scala.inline
    def apply(application: Input[String | Application], bucket: Input[String | Bucket], key: Input[String]): ApplicationVersionArgs = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationVersionArgs]
    }
    
    @scala.inline
    implicit class ApplicationVersionArgsMutableBuilder[Self <: ApplicationVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Input[String | Application]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucket(value: Input[String | Bucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDelete(value: Input[Boolean]): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ApplicationVersionState extends StObject {
    
    /**
      * Name of the Beanstalk Application the version is associated with.
      */
    val application: js.UndefOr[Input[String | Application]] = js.native
    
    /**
      * The ARN assigned by AWS for this Elastic Beanstalk Application.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * S3 bucket that contains the Application Version source bundle.
      */
    val bucket: js.UndefOr[Input[String | Bucket]] = js.native
    
    /**
      * Short description of the Application Version.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * On delete, force an Application Version to be deleted when it may be in use
      * by multiple Elastic Beanstalk Environments.
      */
    val forceDelete: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * S3 object that is the Application Version source bundle.
      */
    val key: js.UndefOr[Input[String]] = js.native
    
    /**
      * A unique name for the this Application Version.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application Version.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ApplicationVersionState {
    
    @scala.inline
    def apply(): ApplicationVersionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationVersionState]
    }
    
    @scala.inline
    implicit class ApplicationVersionStateMutableBuilder[Self <: ApplicationVersionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Input[String | Application]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String | Bucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDelete(value: Input[Boolean]): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
