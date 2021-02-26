package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getRateBasedRuleMod.GetRateBasedRuleArgs
import typingsSlinky.pulumiAws.getRateBasedRuleMod.GetRateBasedRuleResult
import typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSetArgs
import typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSetState
import typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSetArgs
import typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSetState
import typingsSlinky.pulumiAws.wafGetIpsetMod.GetIpsetArgs
import typingsSlinky.pulumiAws.wafGetIpsetMod.GetIpsetResult
import typingsSlinky.pulumiAws.wafGetRuleMod.GetRuleArgs
import typingsSlinky.pulumiAws.wafGetRuleMod.GetRuleResult
import typingsSlinky.pulumiAws.wafGetWebAclMod.GetWebAclArgs
import typingsSlinky.pulumiAws.wafGetWebAclMod.GetWebAclResult
import typingsSlinky.pulumiAws.wafIpSetMod.IpSetArgs
import typingsSlinky.pulumiAws.wafIpSetMod.IpSetState
import typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRuleArgs
import typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRuleState
import typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSetArgs
import typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSetState
import typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSetArgs
import typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSetState
import typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroupArgs
import typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroupState
import typingsSlinky.pulumiAws.wafRuleMod.RuleArgs
import typingsSlinky.pulumiAws.wafRuleMod.RuleState
import typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSetArgs
import typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSetState
import typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typingsSlinky.pulumiAws.wafWebAclMod.WebAclArgs
import typingsSlinky.pulumiAws.wafWebAclMod.WebAclState
import typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSetArgs
import typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waf {
  
  @JSImport("@pulumi/aws", "waf.ByteMatchSet")
  @js.native
  class ByteMatchSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.ByteMatchSet {
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
    @JSImport("@pulumi/aws", "waf.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.ByteMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.GeoMatchSet")
  @js.native
  class GeoMatchSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.GeoMatchSet {
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
    @JSImport("@pulumi/aws", "waf.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.GeoMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/geoMatchSet.GeoMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.IpSet")
  @js.native
  class IpSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.IpSet {
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
    @JSImport("@pulumi/aws", "waf.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "waf.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "waf.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState): typingsSlinky.pulumiAws.wafIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "waf.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafIpSetMod.IpSet = js.native
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.IpSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ipSet.IpSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.RateBasedRule")
  @js.native
  class RateBasedRule protected ()
    extends typingsSlinky.pulumiAws.wafMod.RateBasedRule {
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
    @JSImport("@pulumi/aws", "waf.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "waf.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "waf.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "waf.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.RateBasedRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.RegexMatchSet")
  @js.native
  class RegexMatchSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.RegexMatchSet {
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
    @JSImport("@pulumi/aws", "waf.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.RegexMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexMatchSet.RegexMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.RegexPatternSet")
  @js.native
  class RegexPatternSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.RegexPatternSet {
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
    @JSImport("@pulumi/aws", "waf.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "waf.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.RegexPatternSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.Rule")
  @js.native
  class Rule protected ()
    extends typingsSlinky.pulumiAws.wafMod.Rule {
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
    @JSImport("@pulumi/aws", "waf.Rule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "waf.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "waf.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState): typingsSlinky.pulumiAws.wafRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "waf.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRuleMod.Rule = js.native
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.Rule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rule.Rule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.RuleGroup")
  @js.native
  class RuleGroup protected ()
    extends typingsSlinky.pulumiAws.wafMod.RuleGroup {
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
    @JSImport("@pulumi/aws", "waf.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "waf.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "waf.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "waf.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafRuleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.RuleGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ruleGroup.RuleGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.SizeConstraintSet")
  @js.native
  class SizeConstraintSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.SizeConstraintSet {
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
    @JSImport("@pulumi/aws", "waf.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "waf.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "waf.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "waf.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.SizeConstraintSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet")
  @js.native
  class SqlInjectionMatchSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.SqlInjectionMatchSet {
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
    @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.SqlInjectionMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.WebAcl")
  @js.native
  class WebAcl protected ()
    extends typingsSlinky.pulumiAws.wafMod.WebAcl {
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
    @JSImport("@pulumi/aws", "waf.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafWebAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "waf.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafWebAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "waf.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState): typingsSlinky.pulumiAws.wafWebAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "waf.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafWebAclMod.WebAcl = js.native
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.WebAcl.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/webAcl.WebAcl */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.XssMatchSet")
  @js.native
  class XssMatchSet protected ()
    extends typingsSlinky.pulumiAws.wafMod.XssMatchSet {
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
    @JSImport("@pulumi/aws", "waf.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState): typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "waf.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "waf.XssMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/xssMatchSet.XssMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "waf.getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] = js.native
  @JSImport("@pulumi/aws", "waf.getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] = js.native
  
  @JSImport("@pulumi/aws", "waf.getRateBasedRule")
  @js.native
  def getRateBasedRule(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] = js.native
  @JSImport("@pulumi/aws", "waf.getRateBasedRule")
  @js.native
  def getRateBasedRule(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] = js.native
  
  @JSImport("@pulumi/aws", "waf.getRule")
  @js.native
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] = js.native
  @JSImport("@pulumi/aws", "waf.getRule")
  @js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] = js.native
  
  @JSImport("@pulumi/aws", "waf.getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  @JSImport("@pulumi/aws", "waf.getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
}
