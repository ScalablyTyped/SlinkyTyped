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

object notebookInstanceLifecycleConfigurationMod {
  
  @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration")
  @js.native
  class NotebookInstanceLifecycleConfiguration protected () extends CustomResource {
    /**
      * Create a NotebookInstanceLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
      */
    val onCreate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
      */
    val onStart: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object NotebookInstanceLifecycleConfiguration {
    
    /**
      * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: NotebookInstanceLifecycleConfigurationState,
      opts: CustomResourceOptions
    ): NotebookInstanceLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait NotebookInstanceLifecycleConfigurationArgs extends StObject {
    
    /**
      * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
      */
    val onCreate: js.UndefOr[Input[String]] = js.native
    
    /**
      * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
      */
    val onStart: js.UndefOr[Input[String]] = js.native
  }
  object NotebookInstanceLifecycleConfigurationArgs {
    
    @scala.inline
    def apply(): NotebookInstanceLifecycleConfigurationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookInstanceLifecycleConfigurationArgs]
    }
    
    @scala.inline
    implicit class NotebookInstanceLifecycleConfigurationArgsMutableBuilder[Self <: NotebookInstanceLifecycleConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnCreate(value: Input[String]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      @scala.inline
      def setOnStart(value: Input[String]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  @js.native
  trait NotebookInstanceLifecycleConfigurationState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
      */
    val onCreate: js.UndefOr[Input[String]] = js.native
    
    /**
      * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
      */
    val onStart: js.UndefOr[Input[String]] = js.native
  }
  object NotebookInstanceLifecycleConfigurationState {
    
    @scala.inline
    def apply(): NotebookInstanceLifecycleConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookInstanceLifecycleConfigurationState]
    }
    
    @scala.inline
    implicit class NotebookInstanceLifecycleConfigurationStateMutableBuilder[Self <: NotebookInstanceLifecycleConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnCreate(value: Input[String]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      @scala.inline
      def setOnStart(value: Input[String]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
