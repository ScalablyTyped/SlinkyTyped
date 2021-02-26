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

object assessmentTemplateMod {
  
  @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate")
  @js.native
  class AssessmentTemplate protected () extends CustomResource {
    /**
      * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AssessmentTemplateArgs) = this()
    def this(name: String, args: AssessmentTemplateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The template assessment ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The duration of the inspector run.
      */
    val duration: Output_[Double] = js.native
    
    /**
      * The name of the assessment template.
      */
    val name: Output_[String] = js.native
    
    /**
      * The rules to be used during the run.
      */
    val rulesPackageArns: Output_[js.Array[String]] = js.native
    
    /**
      * Key-value map of tags for the Inspector assessment template.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The assessment target ARN to attach the template to.
      */
    val targetArn: Output_[String] = js.native
  }
  /* static members */
  object AssessmentTemplate {
    
    /**
      * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID]): AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): AssessmentTemplate = js.native
    
    /**
      * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = js.native
  }
  
  @js.native
  trait AssessmentTemplateArgs extends StObject {
    
    /**
      * The duration of the inspector run.
      */
    val duration: Input[Double] = js.native
    
    /**
      * The name of the assessment template.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The rules to be used during the run.
      */
    val rulesPackageArns: Input[js.Array[Input[String]]] = js.native
    
    /**
      * Key-value map of tags for the Inspector assessment template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The assessment target ARN to attach the template to.
      */
    val targetArn: Input[String] = js.native
  }
  object AssessmentTemplateArgs {
    
    @scala.inline
    def apply(
      duration: Input[Double],
      rulesPackageArns: Input[js.Array[Input[String]]],
      targetArn: Input[String]
    ): AssessmentTemplateArgs = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssessmentTemplateArgs]
    }
    
    @scala.inline
    implicit class AssessmentTemplateArgsMutableBuilder[Self <: AssessmentTemplateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Input[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRulesPackageArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesPackageArnsVarargs(value: Input[String]*): Self = StObject.set(x, "rulesPackageArns", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssessmentTemplateState extends StObject {
    
    /**
      * The template assessment ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The duration of the inspector run.
      */
    val duration: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name of the assessment template.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The rules to be used during the run.
      */
    val rulesPackageArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-value map of tags for the Inspector assessment template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The assessment target ARN to attach the template to.
      */
    val targetArn: js.UndefOr[Input[String]] = js.native
  }
  object AssessmentTemplateState {
    
    @scala.inline
    def apply(): AssessmentTemplateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssessmentTemplateState]
    }
    
    @scala.inline
    implicit class AssessmentTemplateStateMutableBuilder[Self <: AssessmentTemplateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDuration(value: Input[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRulesPackageArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesPackageArnsUndefined: Self = StObject.set(x, "rulesPackageArns", js.undefined)
      
      @scala.inline
      def setRulesPackageArnsVarargs(value: Input[String]*): Self = StObject.set(x, "rulesPackageArns", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    }
  }
}
