package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.firewallMod.FirewallArgs
import typingsSlinky.pulumiAws.firewallMod.FirewallState
import typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicyArgs
import typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicyState
import typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfigurationArgs
import typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfigurationState
import typingsSlinky.pulumiAws.ruleGroupMod.RuleGroupArgs
import typingsSlinky.pulumiAws.ruleGroupMod.RuleGroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/networkfirewall", JSImport.Namespace)
@js.native
object networkfirewallMod extends js.Object {
  
  @js.native
  class Firewall protected ()
    extends typingsSlinky.pulumiAws.firewallMod.Firewall {
    /**
      * Create a Firewall resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallArgs) = this()
    def this(name: String, args: FirewallArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Firewall extends js.Object {
    
    /**
      * Get an existing Firewall resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.firewallMod.Firewall = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.firewallMod.Firewall = js.native
    def get(name: String, id: Input[ID], state: FirewallState): typingsSlinky.pulumiAws.firewallMod.Firewall = js.native
    def get(name: String, id: Input[ID], state: FirewallState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.firewallMod.Firewall = js.native
    
    /**
      * Returns true if the given object is an instance of Firewall.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewall.Firewall */ Boolean = js.native
  }
  
  @js.native
  class FirewallPolicy protected ()
    extends typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicy {
    /**
      * Create a FirewallPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallPolicyArgs) = this()
    def this(name: String, args: FirewallPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object FirewallPolicy extends js.Object {
    
    /**
      * Get an existing FirewallPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState): typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FirewallPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewallPolicy.FirewallPolicy */ Boolean = js.native
  }
  
  @js.native
  class LoggingConfiguration protected ()
    extends typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfiguration {
    /**
      * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoggingConfigurationArgs) = this()
    def this(name: String, args: LoggingConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LoggingConfiguration extends js.Object {
    
    /**
      * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: LoggingConfigurationState): typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: LoggingConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/loggingConfiguration.LoggingConfiguration */ Boolean = js.native
  }
  
  @js.native
  class RuleGroup protected ()
    extends typingsSlinky.pulumiAws.ruleGroupMod.RuleGroup {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object RuleGroup extends js.Object {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ruleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ruleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typingsSlinky.pulumiAws.ruleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ruleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/ruleGroup.RuleGroup */ Boolean = js.native
  }
}
