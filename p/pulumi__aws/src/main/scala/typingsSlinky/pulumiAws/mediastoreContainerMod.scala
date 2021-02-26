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

object mediastoreContainerMod {
  
  @JSImport("@pulumi/aws/mediastore/container", "Container")
  @js.native
  class Container protected () extends CustomResource {
    /**
      * Create a Container resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ContainerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ContainerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the container.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The DNS endpoint of the container.
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * The name of the container. Must contain alphanumeric characters or underscores.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Container {
    
    /**
      * Get an existing Container resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediastore/container", "Container.get")
    @js.native
    def get(name: String, id: Input[ID]): Container = js.native
    @JSImport("@pulumi/aws/mediastore/container", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Container = js.native
    @JSImport("@pulumi/aws/mediastore/container", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerState): Container = js.native
    @JSImport("@pulumi/aws/mediastore/container", "Container.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerState, opts: CustomResourceOptions): Container = js.native
    
    /**
      * Returns true if the given object is an instance of Container.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediastore/container", "Container.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/container.Container */ Boolean = js.native
  }
  
  @js.native
  trait ContainerArgs extends StObject {
    
    /**
      * The name of the container. Must contain alphanumeric characters or underscores.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ContainerArgs {
    
    @scala.inline
    def apply(): ContainerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerArgs]
    }
    
    @scala.inline
    implicit class ContainerArgsMutableBuilder[Self <: ContainerArgs] (val x: Self) extends AnyVal {
      
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
  trait ContainerState extends StObject {
    
    /**
      * The ARN of the container.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS endpoint of the container.
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the container. Must contain alphanumeric characters or underscores.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ContainerState {
    
    @scala.inline
    def apply(): ContainerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerState]
    }
    
    @scala.inline
    implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
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
