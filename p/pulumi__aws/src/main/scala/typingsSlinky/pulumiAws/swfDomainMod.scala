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

object swfDomainMod {
  
  @JSImport("@pulumi/aws/swf/domain", "Domain")
  @js.native
  class Domain protected () extends CustomResource {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The domain description.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the domain. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
      */
    val workflowExecutionRetentionPeriodInDays: Output_[String] = js.native
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/swf/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): Domain = js.native
    @JSImport("@pulumi/aws/swf/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Domain = js.native
    @JSImport("@pulumi/aws/swf/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
    @JSImport("@pulumi/aws/swf/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/swf/domain", "Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/swf/domain.Domain */ Boolean = js.native
  }
  
  @js.native
  trait DomainArgs extends StObject {
    
    /**
      * The domain description.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the domain. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
      */
    val workflowExecutionRetentionPeriodInDays: Input[String] = js.native
  }
  object DomainArgs {
    
    @scala.inline
    def apply(workflowExecutionRetentionPeriodInDays: Input[String]): DomainArgs = {
      val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainArgs]
    }
    
    @scala.inline
    implicit class DomainArgsMutableBuilder[Self <: DomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkflowExecutionRetentionPeriodInDays(value: Input[String]): Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomainState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain description.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the domain. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
      */
    val workflowExecutionRetentionPeriodInDays: js.UndefOr[Input[String]] = js.native
  }
  object DomainState {
    
    @scala.inline
    def apply(): DomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainState]
    }
    
    @scala.inline
    implicit class DomainStateMutableBuilder[Self <: DomainState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkflowExecutionRetentionPeriodInDays(value: Input[String]): Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkflowExecutionRetentionPeriodInDaysUndefined: Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", js.undefined)
    }
  }
}
