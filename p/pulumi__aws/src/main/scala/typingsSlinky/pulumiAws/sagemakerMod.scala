package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepositoryArgs
import typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepositoryState
import typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfigurationArgs
import typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfigurationState
import typingsSlinky.pulumiAws.getPrebuiltEcrImageMod.GetPrebuiltEcrImageArgs
import typingsSlinky.pulumiAws.getPrebuiltEcrImageMod.GetPrebuiltEcrImageResult
import typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationArgs
import typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState
import typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstanceArgs
import typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstanceState
import typingsSlinky.pulumiAws.sagemakerEndpointMod.EndpointArgs
import typingsSlinky.pulumiAws.sagemakerEndpointMod.EndpointState
import typingsSlinky.pulumiAws.sagemakerModelMod.ModelArgs
import typingsSlinky.pulumiAws.sagemakerModelMod.ModelState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerMod {
  
  @JSImport("@pulumi/aws/sagemaker", "CodeRepository")
  @js.native
  class CodeRepository protected ()
    extends typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepository {
    /**
      * Create a CodeRepository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CodeRepositoryArgs) = this()
    def this(name: String, args: CodeRepositoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CodeRepository {
    
    /**
      * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState): typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    
    /**
      * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
  @js.native
  class EndpointConfiguration protected ()
    extends typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration {
    /**
      * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointConfigurationArgs) = this()
    def this(name: String, args: EndpointConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EndpointConfiguration {
    
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "Model")
  @js.native
  class Model protected ()
    extends typingsSlinky.pulumiAws.sagemakerModelMod.Model {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Model {
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "Model.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
  @js.native
  class NotebookInstance protected ()
    extends typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance {
    /**
      * Create a NotebookInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotebookInstanceArgs) = this()
    def this(name: String, args: NotebookInstanceArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration")
  @js.native
  class NotebookInstanceLifecycleConfiguration protected ()
    extends typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration {
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
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: NotebookInstanceLifecycleConfigurationState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs): js.Promise[GetPrebuiltEcrImageResult] = js.native
  @JSImport("@pulumi/aws/sagemaker", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs, opts: InvokeOptions): js.Promise[GetPrebuiltEcrImageResult] = js.native
}
