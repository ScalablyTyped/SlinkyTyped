package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.delegationSetMod.DelegationSetArgs
import typingsSlinky.pulumiAws.delegationSetMod.DelegationSetState
import typingsSlinky.pulumiAws.enumsRoute53Mod.RecordType
import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typingsSlinky.pulumiAws.getResolverEndpointMod.GetResolverEndpointArgs
import typingsSlinky.pulumiAws.getResolverEndpointMod.GetResolverEndpointResult
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
import typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpointArgs
import typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpointState
import typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociationArgs
import typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociationState
import typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfigArgs
import typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfigState
import typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationArgs
import typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationState
import typingsSlinky.pulumiAws.resolverRuleMod.ResolverRuleArgs
import typingsSlinky.pulumiAws.resolverRuleMod.ResolverRuleState
import typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorizationArgs
import typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorizationState
import typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociationArgs
import typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociationState
import typingsSlinky.pulumiAws.zoneMod.ZoneArgs
import typingsSlinky.pulumiAws.zoneMod.ZoneState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object route53 {
  
  @JSImport("@pulumi/aws", "route53.DelegationSet")
  @js.native
  class DelegationSet protected ()
    extends typingsSlinky.pulumiAws.route53Mod.DelegationSet {
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
  object DelegationSet {
    
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    @JSImport("@pulumi/aws", "route53.DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    @JSImport("@pulumi/aws", "route53.DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    @JSImport("@pulumi/aws", "route53.DelegationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.delegationSetMod.DelegationSet = js.native
    
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.DelegationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.HealthCheck")
  @js.native
  class HealthCheck protected ()
    extends typingsSlinky.pulumiAws.route53Mod.HealthCheck {
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
  object HealthCheck {
    
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    @JSImport("@pulumi/aws", "route53.HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    @JSImport("@pulumi/aws", "route53.HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    @JSImport("@pulumi/aws", "route53.HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.healthCheckMod.HealthCheck = js.native
    
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.HealthCheck.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.QueryLog")
  @js.native
  class QueryLog protected ()
    extends typingsSlinky.pulumiAws.route53Mod.QueryLog {
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
  object QueryLog {
    
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    @JSImport("@pulumi/aws", "route53.QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    @JSImport("@pulumi/aws", "route53.QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueryLogState): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    @JSImport("@pulumi/aws", "route53.QueryLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.queryLogMod.QueryLog = js.native
    
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.QueryLog.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.Record")
  @js.native
  class Record protected ()
    extends typingsSlinky.pulumiAws.route53Mod.Record {
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
  object Record {
    
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.Record.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.recordMod.Record = js.native
    @JSImport("@pulumi/aws", "route53.Record.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
    @JSImport("@pulumi/aws", "route53.Record.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecordState): typingsSlinky.pulumiAws.recordMod.Record = js.native
    @JSImport("@pulumi/aws", "route53.Record.get")
    @js.native
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.recordMod.Record = js.native
    
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.Record.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
  }
  
  object RecordType {
    
    @JSImport("@pulumi/aws", "route53.RecordType.A")
    @js.native
    val A: typingsSlinky.pulumiAws.pulumiAwsStrings.A = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.AAAA")
    @js.native
    val AAAA: typingsSlinky.pulumiAws.pulumiAwsStrings.AAAA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.CAA")
    @js.native
    val CAA: typingsSlinky.pulumiAws.pulumiAwsStrings.CAA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.CNAME")
    @js.native
    val CNAME: typingsSlinky.pulumiAws.pulumiAwsStrings.CNAME = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.MX")
    @js.native
    val MX: typingsSlinky.pulumiAws.pulumiAwsStrings.MX = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.NAPTR")
    @js.native
    val NAPTR: typingsSlinky.pulumiAws.pulumiAwsStrings.NAPTR = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.NS")
    @js.native
    val NS: typingsSlinky.pulumiAws.pulumiAwsStrings.NS = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.PTR")
    @js.native
    val PTR: typingsSlinky.pulumiAws.pulumiAwsStrings.PTR = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SOA")
    @js.native
    val SOA: typingsSlinky.pulumiAws.pulumiAwsStrings.SOA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SPF")
    @js.native
    val SPF: typingsSlinky.pulumiAws.pulumiAwsStrings.SPF = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SRV")
    @js.native
    val SRV: typingsSlinky.pulumiAws.pulumiAwsStrings.SRV = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.TXT")
    @js.native
    val TXT: typingsSlinky.pulumiAws.pulumiAwsStrings.TXT = js.native
  }
  
  object RecordTypes {
    
    /** Use RecordType.A instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.A")
    @js.native
    val A: RecordType = js.native
    
    /** Use RecordType.AAAA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.AAAA")
    @js.native
    val AAAA: RecordType = js.native
    
    /** Use RecordType.CAA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.CAA")
    @js.native
    val CAA: RecordType = js.native
    
    /** Use RecordType.CNAME instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.CNAME")
    @js.native
    val CNAME: RecordType = js.native
    
    /** Use RecordType.MX instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.MX")
    @js.native
    val MX: RecordType = js.native
    
    /** Use RecordType.NAPTR instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.NAPTR")
    @js.native
    val NAPTR: RecordType = js.native
    
    /** Use RecordType.NS instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.NS")
    @js.native
    val NS: RecordType = js.native
    
    /** Use RecordType.PTR instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.PTR")
    @js.native
    val PTR: RecordType = js.native
    
    /** Use RecordType.SOA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SOA")
    @js.native
    val SOA: RecordType = js.native
    
    /** Use RecordType.SPF instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SPF")
    @js.native
    val SPF: RecordType = js.native
    
    /** Use RecordType.SRV instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SRV")
    @js.native
    val SRV: RecordType = js.native
    
    /** Use RecordType.TXT instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.TXT")
    @js.native
    val TXT: RecordType = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverEndpoint")
  @js.native
  class ResolverEndpoint protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ResolverEndpoint {
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
  object ResolverEndpoint {
    
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig")
  @js.native
  class ResolverQueryLogConfig protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ResolverQueryLogConfig {
    /**
      * Create a ResolverQueryLogConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResolverQueryLogConfig {
    
    /**
      * Get an existing ResolverQueryLogConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState): typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation")
  @js.native
  class ResolverQueryLogConfigAssociation protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ResolverQueryLogConfigAssociation {
    /**
      * Create a ResolverQueryLogConfigAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResolverQueryLogConfigAssociation {
    
    /**
      * Get an existing ResolverQueryLogConfigAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigAssociationState): typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: ResolverQueryLogConfigAssociationState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfigAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfigAssociation.ResolverQueryLogConfigAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverRule")
  @js.native
  class ResolverRule protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ResolverRule {
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
  object ResolverRule {
    
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ResolverRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleMod.ResolverRule = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ResolverRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation")
  @js.native
  class ResolverRuleAssociation protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ResolverRuleAssociation {
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
  object ResolverRuleAssociation {
    
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization")
  @js.native
  class VpcAssociationAuthorization protected ()
    extends typingsSlinky.pulumiAws.route53Mod.VpcAssociationAuthorization {
    /**
      * Create a VpcAssociationAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAssociationAuthorizationArgs) = this()
    def this(name: String, args: VpcAssociationAuthorizationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VpcAssociationAuthorization {
    
    /**
      * Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState): typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAssociationAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.Zone")
  @js.native
  class Zone protected ()
    extends typingsSlinky.pulumiAws.route53Mod.Zone {
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
  object Zone {
    
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.Zone.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    @JSImport("@pulumi/aws", "route53.Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    @JSImport("@pulumi/aws", "route53.Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneState): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    @JSImport("@pulumi/aws", "route53.Zone.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneMod.Zone = js.native
    
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.Zone.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ZoneAssociation")
  @js.native
  class ZoneAssociation protected ()
    extends typingsSlinky.pulumiAws.route53Mod.ZoneAssociation {
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
  object ZoneAssociation {
    
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "route53.ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    @JSImport("@pulumi/aws", "route53.ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "route53.ZoneAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.getDelegationSet")
  @js.native
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = js.native
  @JSImport("@pulumi/aws", "route53.getDelegationSet")
  @js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = js.native
  
  @JSImport("@pulumi/aws", "route53.getResolverEndpoint")
  @js.native
  def getResolverEndpoint(): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: GetResolverEndpointArgs): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: GetResolverEndpointArgs, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
  
  @JSImport("@pulumi/aws", "route53.getResolverRule")
  @js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRule")
  @js.native
  def getResolverRule(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRule")
  @js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRule")
  @js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  
  @JSImport("@pulumi/aws", "route53.getResolverRules")
  @js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRules")
  @js.native
  def getResolverRules(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRules")
  @js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = js.native
  @JSImport("@pulumi/aws", "route53.getResolverRules")
  @js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  
  @JSImport("@pulumi/aws", "route53.getZone")
  @js.native
  def getZone(): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws", "route53.getZone")
  @js.native
  def getZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws", "route53.getZone")
  @js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws", "route53.getZone")
  @js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
}
