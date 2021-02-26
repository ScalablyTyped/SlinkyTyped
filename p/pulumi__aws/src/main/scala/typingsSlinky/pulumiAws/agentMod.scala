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

object agentMod {
  
  @JSImport("@pulumi/aws/datasync/agent", "Agent")
  @js.native
  class Agent protected () extends CustomResource {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
      */
    val activationKey: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Agent.
      */
    val arn: Output_[String] = js.native
    
    /**
      * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * Name of the DataSync Agent.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Agent.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Agent {
    
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datasync/agent", "Agent.get")
    @js.native
    def get(name: String, id: Input[ID]): Agent = js.native
    @JSImport("@pulumi/aws/datasync/agent", "Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Agent = js.native
    @JSImport("@pulumi/aws/datasync/agent", "Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: AgentState): Agent = js.native
    @JSImport("@pulumi/aws/datasync/agent", "Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): Agent = js.native
    
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datasync/agent", "Agent.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
  }
  
  @js.native
  trait AgentArgs extends StObject {
    
    /**
      * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
      */
    val activationKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the DataSync Agent.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Agent.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AgentArgs {
    
    @scala.inline
    def apply(): AgentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentArgs]
    }
    
    @scala.inline
    implicit class AgentArgsMutableBuilder[Self <: AgentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivationKey(value: Input[String]): Self = StObject.set(x, "activationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationKeyUndefined: Self = StObject.set(x, "activationKey", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
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
  trait AgentState extends StObject {
    
    /**
      * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
      */
    val activationKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Agent.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the DataSync Agent.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Agent.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AgentState {
    
    @scala.inline
    def apply(): AgentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentState]
    }
    
    @scala.inline
    implicit class AgentStateMutableBuilder[Self <: AgentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivationKey(value: Input[String]): Self = StObject.set(x, "activationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationKeyUndefined: Self = StObject.set(x, "activationKey", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
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
