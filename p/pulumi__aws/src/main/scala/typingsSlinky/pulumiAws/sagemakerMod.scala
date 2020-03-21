package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfigurationArgs
import typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfigurationState
import typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationArgs
import typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState
import typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstanceArgs
import typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstanceState
import typingsSlinky.pulumiAws.sagemakerEndpointMod.EndpointArgs
import typingsSlinky.pulumiAws.sagemakerEndpointMod.EndpointState
import typingsSlinky.pulumiAws.sagemakerModelMod.ModelArgs
import typingsSlinky.pulumiAws.sagemakerModelMod.ModelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", JSImport.Namespace)
@js.native
object sagemakerMod extends js.Object {
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
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EndpointConfiguration extends js.Object {
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sagemakerModelMod.Model = js.native
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookInstance extends js.Object {
    /**
      * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookInstanceLifecycleConfiguration extends js.Object {
    /**
      * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
  }
  
}

