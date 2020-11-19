package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.delegationSetMod.DelegationSetArgs
import typingsSlinky.pulumiAws.delegationSetMod.DelegationSetState
import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typingsSlinky.pulumiAws.getResolverRuleMod.GetResolverRuleArgs
import typingsSlinky.pulumiAws.getResolverRuleMod.GetResolverRuleResult
import typingsSlinky.pulumiAws.getResolverRulesMod.GetResolverRulesArgs
import typingsSlinky.pulumiAws.getResolverRulesMod.GetResolverRulesResult
import typingsSlinky.pulumiAws.getZoneMod.GetZoneArgs
import typingsSlinky.pulumiAws.getZoneMod.GetZoneResult
import typingsSlinky.pulumiAws.healthCheckMod.HealthCheckArgs
import typingsSlinky.pulumiAws.healthCheckMod.HealthCheckState
import typingsSlinky.pulumiAws.queryLogMod.QueryLogArgs
import typingsSlinky.pulumiAws.queryLogMod.QueryLogState
import typingsSlinky.pulumiAws.recordMod.RecordArgs
import typingsSlinky.pulumiAws.recordMod.RecordState
import typingsSlinky.pulumiAws.recordTypeMod.RecordType
import typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpointArgs
import typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpointState
import typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationArgs
import typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationState
import typingsSlinky.pulumiAws.resolverRuleMod.ResolverRuleArgs
import typingsSlinky.pulumiAws.resolverRuleMod.ResolverRuleState
import typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociationArgs
import typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociationState
import typingsSlinky.pulumiAws.zoneMod.ZoneArgs
import typingsSlinky.pulumiAws.zoneMod.ZoneState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", JSImport.Namespace)
@js.native
object route53Mod extends js.Object {
  
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = js.native
  
  def getResolverRule(): js.Promise[GetResolverRuleResult] = js.native
  def getResolverRule(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  
  def getResolverRules(): js.Promise[GetResolverRulesResult] = js.native
  def getResolverRules(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  
  def getZone(): js.Promise[GetZoneResult] = js.native
  def getZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] = js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  
  @js.native
  class DelegationSet protected ()
    extends typingsSlinky.pulumiAws.delegationSetMod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DelegationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object DelegationSet extends js.Object {
    
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
  }
  
  @js.native
  class HealthCheck protected ()
    extends typingsSlinky.pulumiAws.healthCheckMod.HealthCheck {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HealthCheckArgs) = this()
    def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object HealthCheck extends js.Object {
    
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
  }
  
  @js.native
  class QueryLog protected ()
    extends typingsSlinky.pulumiAws.queryLogMod.QueryLog {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueryLogArgs) = this()
    def this(name: String, args: QueryLogArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object QueryLog extends js.Object {
    
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
  }
  
  @js.native
  class Record protected ()
    extends typingsSlinky.pulumiAws.recordMod.Record {
    /**
      * Create a Record resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecordArgs) = this()
    def this(name: String, args: RecordArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Record extends js.Object {
    
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState): typingsSlinky.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
    
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
  }
  
  @js.native
  object RecordTypes extends js.Object {
    
    val A: RecordType = js.native
    
    val AAAA: RecordType = js.native
    
    val CAA: RecordType = js.native
    
    val CNAME: RecordType = js.native
    
    val MX: RecordType = js.native
    
    val NAPTR: RecordType = js.native
    
    val NS: RecordType = js.native
    
    val PTR: RecordType = js.native
    
    val SOA: RecordType = js.native
    
    val SPF: RecordType = js.native
    
    val SRV: RecordType = js.native
    
    val TXT: RecordType = js.native
  }
  
  @js.native
  class ResolverEndpoint protected ()
    extends typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint {
    /**
      * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverEndpointArgs) = this()
    def this(name: String, args: ResolverEndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ResolverEndpoint extends js.Object {
    
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
  }
  
  @js.native
  class ResolverRule protected ()
    extends typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule {
    /**
      * Create a ResolverRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleArgs) = this()
    def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ResolverRule extends js.Object {
    
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
  }
  
  @js.native
  class ResolverRuleAssociation protected ()
    extends typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation {
    /**
      * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleAssociationArgs) = this()
    def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ResolverRuleAssociation extends js.Object {
    
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
  }
  
  @js.native
  class Zone protected ()
    extends typingsSlinky.pulumiAws.zoneMod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ZoneArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Zone extends js.Object {
    
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ZoneAssociationArgs) = this()
    def this(name: String, args: ZoneAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ZoneAssociation extends js.Object {
    
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
}
