package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange
import typingsSlinky.pulumiAws.outputMod.ec2.TrafficMirrorFilterRuleSourcePortRange
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficMirrorFilterRuleMod {
  
  @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule")
  @js.native
  class TrafficMirrorFilterRule protected () extends CustomResource {
    /**
      * Create a TrafficMirrorFilterRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TrafficMirrorFilterRuleArgs) = this()
    def this(name: String, args: TrafficMirrorFilterRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A description of the traffic mirror filter rule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The destination CIDR block to assign to the Traffic Mirror rule.
      */
    val destinationCidrBlock: Output_[String] = js.native
    
    /**
      * The destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val destinationPortRange: Output_[js.UndefOr[TrafficMirrorFilterRuleDestinationPortRange]] = js.native
    
    /**
      * The protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
      */
    val protocol: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
      */
    val ruleAction: Output_[String] = js.native
    
    /**
      * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
      */
    val ruleNumber: Output_[Double] = js.native
    
    /**
      * The source CIDR block to assign to the Traffic Mirror rule.
      */
    val sourceCidrBlock: Output_[String] = js.native
    
    /**
      * The source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val sourcePortRange: Output_[js.UndefOr[TrafficMirrorFilterRuleSourcePortRange]] = js.native
    
    /**
      * The direction of traffic to be captured. Valid values are `ingress` and `egress`
      */
    val trafficDirection: Output_[String] = js.native
    
    /**
      * ID of the traffic mirror filter to which this rule should be added
      */
    val trafficMirrorFilterId: Output_[String] = js.native
  }
  /* static members */
  object TrafficMirrorFilterRule {
    
    /**
      * Get an existing TrafficMirrorFilterRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule.get")
    @js.native
    def get(name: String, id: Input[ID]): TrafficMirrorFilterRule = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TrafficMirrorFilterRule = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorFilterRuleState): TrafficMirrorFilterRule = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorFilterRuleState, opts: CustomResourceOptions): TrafficMirrorFilterRule = js.native
    
    /**
      * Returns true if the given object is an instance of TrafficMirrorFilterRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilterRule", "TrafficMirrorFilterRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorFilterRule.TrafficMirrorFilterRule */ Boolean = js.native
  }
  
  @js.native
  trait TrafficMirrorFilterRuleArgs extends StObject {
    
    /**
      * A description of the traffic mirror filter rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The destination CIDR block to assign to the Traffic Mirror rule.
      */
    val destinationCidrBlock: Input[String] = js.native
    
    /**
      * The destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val destinationPortRange: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange]
      ] = js.native
    
    /**
      * The protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
      */
    val protocol: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
      */
    val ruleAction: Input[String] = js.native
    
    /**
      * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
      */
    val ruleNumber: Input[Double] = js.native
    
    /**
      * The source CIDR block to assign to the Traffic Mirror rule.
      */
    val sourceCidrBlock: Input[String] = js.native
    
    /**
      * The source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val sourcePortRange: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange]
      ] = js.native
    
    /**
      * The direction of traffic to be captured. Valid values are `ingress` and `egress`
      */
    val trafficDirection: Input[String] = js.native
    
    /**
      * ID of the traffic mirror filter to which this rule should be added
      */
    val trafficMirrorFilterId: Input[String] = js.native
  }
  object TrafficMirrorFilterRuleArgs {
    
    @scala.inline
    def apply(
      destinationCidrBlock: Input[String],
      ruleAction: Input[String],
      ruleNumber: Input[Double],
      sourceCidrBlock: Input[String],
      trafficDirection: Input[String],
      trafficMirrorFilterId: Input[String]
    ): TrafficMirrorFilterRuleArgs = {
      val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], ruleAction = ruleAction.asInstanceOf[js.Any], ruleNumber = ruleNumber.asInstanceOf[js.Any], sourceCidrBlock = sourceCidrBlock.asInstanceOf[js.Any], trafficDirection = trafficDirection.asInstanceOf[js.Any], trafficMirrorFilterId = trafficMirrorFilterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrafficMirrorFilterRuleArgs]
    }
    
    @scala.inline
    implicit class TrafficMirrorFilterRuleArgsMutableBuilder[Self <: TrafficMirrorFilterRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationPortRange(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange]): Self = StObject.set(x, "destinationPortRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationPortRangeUndefined: Self = StObject.set(x, "destinationPortRange", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[Double]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRuleAction(value: Input[String]): Self = StObject.set(x, "ruleAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNumber(value: Input[Double]): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCidrBlock(value: Input[String]): Self = StObject.set(x, "sourceCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePortRange(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange]): Self = StObject.set(x, "sourcePortRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePortRangeUndefined: Self = StObject.set(x, "sourcePortRange", js.undefined)
      
      @scala.inline
      def setTrafficDirection(value: Input[String]): Self = StObject.set(x, "trafficDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficMirrorFilterId(value: Input[String]): Self = StObject.set(x, "trafficMirrorFilterId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrafficMirrorFilterRuleState extends StObject {
    
    /**
      * A description of the traffic mirror filter rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The destination CIDR block to assign to the Traffic Mirror rule.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val destinationPortRange: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange]
      ] = js.native
    
    /**
      * The protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
      */
    val protocol: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
      */
    val ruleAction: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
      */
    val ruleNumber: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The source CIDR block to assign to the Traffic Mirror rule.
      */
    val sourceCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
      */
    val sourcePortRange: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange]
      ] = js.native
    
    /**
      * The direction of traffic to be captured. Valid values are `ingress` and `egress`
      */
    val trafficDirection: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the traffic mirror filter to which this rule should be added
      */
    val trafficMirrorFilterId: js.UndefOr[Input[String]] = js.native
  }
  object TrafficMirrorFilterRuleState {
    
    @scala.inline
    def apply(): TrafficMirrorFilterRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorFilterRuleState]
    }
    
    @scala.inline
    implicit class TrafficMirrorFilterRuleStateMutableBuilder[Self <: TrafficMirrorFilterRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setDestinationPortRange(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange]): Self = StObject.set(x, "destinationPortRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationPortRangeUndefined: Self = StObject.set(x, "destinationPortRange", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[Double]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRuleAction(value: Input[String]): Self = StObject.set(x, "ruleAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleActionUndefined: Self = StObject.set(x, "ruleAction", js.undefined)
      
      @scala.inline
      def setRuleNumber(value: Input[Double]): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
      
      @scala.inline
      def setSourceCidrBlock(value: Input[String]): Self = StObject.set(x, "sourceCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCidrBlockUndefined: Self = StObject.set(x, "sourceCidrBlock", js.undefined)
      
      @scala.inline
      def setSourcePortRange(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange]): Self = StObject.set(x, "sourcePortRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePortRangeUndefined: Self = StObject.set(x, "sourcePortRange", js.undefined)
      
      @scala.inline
      def setTrafficDirection(value: Input[String]): Self = StObject.set(x, "trafficDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficDirectionUndefined: Self = StObject.set(x, "trafficDirection", js.undefined)
      
      @scala.inline
      def setTrafficMirrorFilterId(value: Input[String]): Self = StObject.set(x, "trafficMirrorFilterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "trafficMirrorFilterId", js.undefined)
    }
  }
}
