package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.DefaultSecurityGroupEgress
import typingsSlinky.pulumiAws.outputMod.ec2.DefaultSecurityGroupIngress
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSecurityGroupMod {
  
  @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
  @js.native
  class DefaultSecurityGroup protected () extends CustomResource {
    /**
      * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DefaultSecurityGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DefaultSecurityGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the security group
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of this egress rule.
      */
    val description: Output_[String] = js.native
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: Output_[js.Array[DefaultSecurityGroupEgress]] = js.native
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: Output_[js.Array[DefaultSecurityGroupIngress]] = js.native
    
    /**
      * The name of the security group
      */
    val name: Output_[String] = js.native
    
    /**
      * The owner ID.
      */
    val ownerId: Output_[String] = js.native
    
    val revokeRulesOnDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultSecurityGroup {
    
    /**
      * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): DefaultSecurityGroup = js.native
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DefaultSecurityGroup = js.native
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultSecurityGroupState): DefaultSecurityGroup = js.native
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultSecurityGroupState, opts: CustomResourceOptions): DefaultSecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean = js.native
  }
  
  @js.native
  trait DefaultSecurityGroupArgs extends StObject {
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]
      ] = js.native
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]
        ]
      ] = js.native
    
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object DefaultSecurityGroupArgs {
    
    @scala.inline
    def apply(): DefaultSecurityGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSecurityGroupArgs]
    }
    
    @scala.inline
    implicit class DefaultSecurityGroupArgsMutableBuilder[Self <: DefaultSecurityGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]
            ]
      ): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait DefaultSecurityGroupState extends StObject {
    
    /**
      * The ARN of the security group
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of this egress rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]
      ] = js.native
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]
        ]
      ] = js.native
    
    /**
      * The name of the security group
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The owner ID.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object DefaultSecurityGroupState {
    
    @scala.inline
    def apply(): DefaultSecurityGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSecurityGroupState]
    }
    
    @scala.inline
    implicit class DefaultSecurityGroupStateMutableBuilder[Self <: DefaultSecurityGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]
            ]
      ): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
