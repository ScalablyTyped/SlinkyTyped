package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSetArgs
import typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSetState
import typingsSlinky.atPulumiAws.route53GetDelegationSetMod.GetDelegationSetArgs
import typingsSlinky.atPulumiAws.route53GetDelegationSetMod.GetDelegationSetResult
import typingsSlinky.atPulumiAws.route53GetResolverRuleMod.GetResolverRuleArgs
import typingsSlinky.atPulumiAws.route53GetResolverRuleMod.GetResolverRuleResult
import typingsSlinky.atPulumiAws.route53GetResolverRulesMod.GetResolverRulesArgs
import typingsSlinky.atPulumiAws.route53GetResolverRulesMod.GetResolverRulesResult
import typingsSlinky.atPulumiAws.route53GetZoneMod.GetZoneArgs
import typingsSlinky.atPulumiAws.route53GetZoneMod.GetZoneResult
import typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheckArgs
import typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheckState
import typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLogArgs
import typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLogState
import typingsSlinky.atPulumiAws.route53RecordMod.RecordArgs
import typingsSlinky.atPulumiAws.route53RecordMod.RecordState
import typingsSlinky.atPulumiAws.route53RecordTypeMod.RecordType
import typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpointArgs
import typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpointState
import typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociationArgs
import typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociationState
import typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRuleArgs
import typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRuleState
import typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociationArgs
import typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociationState
import typingsSlinky.atPulumiAws.route53ZoneMod.ZoneArgs
import typingsSlinky.atPulumiAws.route53ZoneMod.ZoneState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", JSImport.Namespace)
@js.native
object route53Mod extends js.Object {
  @js.native
  class DelegationSet protected ()
    extends typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DelegationSetArgs) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class HealthCheck protected ()
    extends typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheck {
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
  
  @js.native
  class QueryLog protected ()
    extends typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLog {
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
  
  @js.native
  class Record protected ()
    extends typingsSlinky.atPulumiAws.route53RecordMod.Record {
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
  
  @js.native
  class ResolverEndpoint protected ()
    extends typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpoint {
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
  
  @js.native
  class ResolverRule protected ()
    extends typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRule {
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
  
  @js.native
  class ResolverRuleAssociation protected ()
    extends typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation {
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
  
  @js.native
  class Zone protected ()
    extends typingsSlinky.atPulumiAws.route53ZoneMod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ZoneArgs) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociation {
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
  
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getZone(): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] with GetZoneResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53DelegationSetMod.DelegationSet = js.native
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState): typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53QueryLogMod.QueryLog = js.native
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53RecordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState): typingsSlinky.atPulumiAws.route53RecordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53RecordMod.Record = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53ResolverEndpointMod.ResolverEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState): typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53ResolverRuleMod.ResolverRule = js.native
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53ResolverRuleAssociationMod.ResolverRuleAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53ZoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState): typingsSlinky.atPulumiAws.route53ZoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53ZoneMod.Zone = js.native
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.route53ZoneAssociationMod.ZoneAssociation = js.native
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
  
}

