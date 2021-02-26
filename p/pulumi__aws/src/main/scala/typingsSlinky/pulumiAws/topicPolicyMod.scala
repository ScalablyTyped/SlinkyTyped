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

object topicPolicyMod {
  
  @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy")
  @js.native
  class TopicPolicy protected () extends CustomResource {
    /**
      * Create a TopicPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicPolicyArgs) = this()
    def this(name: String, args: TopicPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the SNS topic
      */
    val arn: Output_[String] = js.native
    
    /**
      * The fully-formed AWS policy as JSON.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object TopicPolicy {
    
    /**
      * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): TopicPolicy = js.native
    @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TopicPolicy = js.native
    @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState): TopicPolicy = js.native
    @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): TopicPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
  }
  
  @js.native
  trait TopicPolicyArgs extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    val arn: Input[String] = js.native
    
    /**
      * The fully-formed AWS policy as JSON.
      */
    val policy: Input[String] = js.native
  }
  object TopicPolicyArgs {
    
    @scala.inline
    def apply(arn: Input[String], policy: Input[String]): TopicPolicyArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicPolicyArgs]
    }
    
    @scala.inline
    implicit class TopicPolicyArgsMutableBuilder[Self <: TopicPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopicPolicyState extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fully-formed AWS policy as JSON.
      */
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object TopicPolicyState {
    
    @scala.inline
    def apply(): TopicPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopicPolicyState]
    }
    
    @scala.inline
    implicit class TopicPolicyStateMutableBuilder[Self <: TopicPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
