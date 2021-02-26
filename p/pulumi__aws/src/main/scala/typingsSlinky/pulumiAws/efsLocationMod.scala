package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.outputMod.datasync.EfsLocationEc2Config
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efsLocationMod {
  
  @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
  @js.native
  class EfsLocation protected () extends CustomResource {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EfsLocationArgs) = this()
    def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: Output_[EfsLocationEc2Config] = js.native
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: Output_[ARN] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val uri: Output_[String] = js.native
  }
  /* static members */
  object EfsLocation {
    
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID]): EfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EfsLocationState): EfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): EfsLocation = js.native
    
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
  }
  
  @js.native
  trait EfsLocationArgs extends StObject {
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: Input[typingsSlinky.pulumiAws.inputMod.datasync.EfsLocationEc2Config] = js.native
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: Input[ARN] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EfsLocationArgs {
    
    @scala.inline
    implicit class EfsLocationArgsMutableBuilder[Self <: EfsLocationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEc2Config(value: Input[typingsSlinky.pulumiAws.inputMod.datasync.EfsLocationEc2Config]): Self = StObject.set(x, "ec2Config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfsFileSystemArn(value: Input[ARN]): Self = StObject.set(x, "efsFileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait EfsLocationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing EC2 configurations for connecting to the EFS File System.
      */
    val ec2Config: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.datasync.EfsLocationEc2Config]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of EFS File System.
      */
    val efsFileSystemArn: js.UndefOr[Input[ARN]] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Default `/`.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    val uri: js.UndefOr[Input[String]] = js.native
  }
  object EfsLocationState {
    
    @scala.inline
    def apply(): EfsLocationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EfsLocationState]
    }
    
    @scala.inline
    implicit class EfsLocationStateMutableBuilder[Self <: EfsLocationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEc2Config(value: Input[typingsSlinky.pulumiAws.inputMod.datasync.EfsLocationEc2Config]): Self = StObject.set(x, "ec2Config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2ConfigUndefined: Self = StObject.set(x, "ec2Config", js.undefined)
      
      @scala.inline
      def setEfsFileSystemArn(value: Input[ARN]): Self = StObject.set(x, "efsFileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfsFileSystemArnUndefined: Self = StObject.set(x, "efsFileSystemArn", js.undefined)
      
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
