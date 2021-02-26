package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSetArgs
import typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSetState
import typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSetArgs
import typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSetState
import typingsSlinky.pulumiAws.getIpsetMod.GetIpsetArgs
import typingsSlinky.pulumiAws.getIpsetMod.GetIpsetResult
import typingsSlinky.pulumiAws.getRateBasedModMod.GetRateBasedModArgs
import typingsSlinky.pulumiAws.getRateBasedModMod.GetRateBasedModResult
import typingsSlinky.pulumiAws.getRuleMod.GetRuleArgs
import typingsSlinky.pulumiAws.getRuleMod.GetRuleResult
import typingsSlinky.pulumiAws.getWebAclMod.GetWebAclArgs
import typingsSlinky.pulumiAws.getWebAclMod.GetWebAclResult
import typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRuleArgs
import typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRuleState
import typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSetArgs
import typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSetState
import typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSetArgs
import typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSetState
import typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSetArgs
import typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSetState
import typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSetArgs
import typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSetState
import typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroupArgs
import typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroupState
import typingsSlinky.pulumiAws.wafregionalRuleMod.RuleArgs
import typingsSlinky.pulumiAws.wafregionalRuleMod.RuleState
import typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociationArgs
import typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociationState
import typingsSlinky.pulumiAws.webAclMod.WebAclArgs
import typingsSlinky.pulumiAws.webAclMod.WebAclState
import typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSetArgs
import typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafregionalMod {
  
  @JSImport("@pulumi/aws/wafregional", "ByteMatchSet")
  @js.native
  class ByteMatchSet protected ()
    extends typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSet {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ByteMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ByteMatchSet {
    
    /**
      * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "ByteMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "GeoMatchSet")
  @js.native
  class GeoMatchSet protected ()
    extends typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSet {
    /**
      * Create a GeoMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GeoMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GeoMatchSet {
    
    /**
      * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "GeoMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/geoMatchSet.GeoMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "IpSet")
  @js.native
  class IpSet protected ()
    extends typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IpSet {
    
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws/wafregional", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws/wafregional", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws/wafregional", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "IpSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ipSet.IpSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "RateBasedRule")
  @js.native
  class RateBasedRule protected ()
    extends typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule {
    /**
      * Create a RateBasedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RateBasedRuleArgs) = this()
    def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RateBasedRule {
    
    /**
      * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws/wafregional", "RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "RateBasedRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "RegexMatchSet")
  @js.native
  class RegexMatchSet protected ()
    extends typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSet {
    /**
      * Create a RegexMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RegexMatchSet {
    
    /**
      * Get an existing RegexMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "RegexMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexMatchSet.RegexMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "RegexPatternSet")
  @js.native
  class RegexPatternSet protected ()
    extends typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RegexPatternSet {
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "RegexPatternSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "Rule")
  @js.native
  class Rule protected ()
    extends typingsSlinky.pulumiAws.wafregionalRuleMod.Rule {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleArgs) = this()
    def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Rule {
    
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "Rule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws/wafregional", "Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws/wafregional", "Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState): typingsSlinky.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws/wafregional", "Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalRuleMod.Rule = js.native
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "Rule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "RuleGroup")
  @js.native
  class RuleGroup protected ()
    extends typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroup {
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
  object RuleGroup {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "RuleGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet")
  @js.native
  class SizeConstraintSet protected ()
    extends typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSet {
    /**
      * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SizeConstraintSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SizeConstraintSet {
    
    /**
      * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "SizeConstraintSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet")
  @js.native
  class SqlInjectionMatchSet protected ()
    extends typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SqlInjectionMatchSet {
    
    /**
      * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "SqlInjectionMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "WebAcl")
  @js.native
  class WebAcl protected ()
    extends typingsSlinky.pulumiAws.webAclMod.WebAcl {
    /**
      * Create a WebAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclArgs) = this()
    def this(name: String, args: WebAclArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object WebAcl {
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState): typingsSlinky.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.webAclMod.WebAcl = js.native
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "WebAcl.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAcl.WebAcl */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "WebAclAssociation")
  @js.native
  class WebAclAssociation protected ()
    extends typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociation {
    /**
      * Create a WebAclAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclAssociationArgs) = this()
    def this(name: String, args: WebAclAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object WebAclAssociation {
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafregional", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "WebAclAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "XssMatchSet")
  @js.native
  class XssMatchSet protected ()
    extends typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSet {
    /**
      * Create a XssMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: XssMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: XssMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object XssMatchSet {
    
    /**
      * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional", "XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState): typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional", "XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional", "XssMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/wafregional", "getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] = js.native
  @JSImport("@pulumi/aws/wafregional", "getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] = js.native
  
  @JSImport("@pulumi/aws/wafregional", "getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs): js.Promise[GetRateBasedModResult] = js.native
  @JSImport("@pulumi/aws/wafregional", "getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs, opts: InvokeOptions): js.Promise[GetRateBasedModResult] = js.native
  
  @JSImport("@pulumi/aws/wafregional", "getRule")
  @js.native
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] = js.native
  @JSImport("@pulumi/aws/wafregional", "getRule")
  @js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] = js.native
  
  @JSImport("@pulumi/aws/wafregional", "getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  @JSImport("@pulumi/aws/wafregional", "getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
}
