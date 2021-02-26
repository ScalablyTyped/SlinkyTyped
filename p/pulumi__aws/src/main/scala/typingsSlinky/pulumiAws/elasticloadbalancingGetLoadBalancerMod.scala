package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elasticloadbalancing.GetLoadBalancerAccessLogs
import typingsSlinky.pulumiAws.outputMod.elasticloadbalancing.GetLoadBalancerHealthCheck
import typingsSlinky.pulumiAws.outputMod.elasticloadbalancing.GetLoadBalancerListener
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingGetLoadBalancerMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/getLoadBalancer", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getLoadBalancer", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  @js.native
  trait GetLoadBalancerArgs extends StObject {
    
    /**
      * The unique name of the load balancer.
      */
    val name: String = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLoadBalancerArgs {
    
    @scala.inline
    def apply(name: String): GetLoadBalancerArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerArgs]
    }
    
    @scala.inline
    implicit class GetLoadBalancerArgsMutableBuilder[Self <: GetLoadBalancerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLoadBalancerResult extends StObject {
    
    val accessLogs: GetLoadBalancerAccessLogs = js.native
    
    val arn: String = js.native
    
    val availabilityZones: js.Array[String] = js.native
    
    val connectionDraining: Boolean = js.native
    
    val connectionDrainingTimeout: Double = js.native
    
    val crossZoneLoadBalancing: Boolean = js.native
    
    val dnsName: String = js.native
    
    val healthCheck: GetLoadBalancerHealthCheck = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val idleTimeout: Double = js.native
    
    val instances: js.Array[String] = js.native
    
    val internal: Boolean = js.native
    
    val listeners: js.Array[GetLoadBalancerListener] = js.native
    
    val name: String = js.native
    
    val securityGroups: js.Array[String] = js.native
    
    val sourceSecurityGroup: String = js.native
    
    val sourceSecurityGroupId: String = js.native
    
    val subnets: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val zoneId: String = js.native
  }
  object GetLoadBalancerResult {
    
    @scala.inline
    def apply(
      accessLogs: GetLoadBalancerAccessLogs,
      arn: String,
      availabilityZones: js.Array[String],
      connectionDraining: Boolean,
      connectionDrainingTimeout: Double,
      crossZoneLoadBalancing: Boolean,
      dnsName: String,
      healthCheck: GetLoadBalancerHealthCheck,
      id: String,
      idleTimeout: Double,
      instances: js.Array[String],
      internal: Boolean,
      listeners: js.Array[GetLoadBalancerListener],
      name: String,
      securityGroups: js.Array[String],
      sourceSecurityGroup: String,
      sourceSecurityGroupId: String,
      subnets: js.Array[String],
      tags: StringDictionary[String],
      zoneId: String
    ): GetLoadBalancerResult = {
      val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], connectionDraining = connectionDraining.asInstanceOf[js.Any], connectionDrainingTimeout = connectionDrainingTimeout.asInstanceOf[js.Any], crossZoneLoadBalancing = crossZoneLoadBalancing.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceSecurityGroup = sourceSecurityGroup.asInstanceOf[js.Any], sourceSecurityGroupId = sourceSecurityGroupId.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerResult]
    }
    
    @scala.inline
    implicit class GetLoadBalancerResultMutableBuilder[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessLogs(value: GetLoadBalancerAccessLogs): Self = StObject.set(x, "accessLogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setConnectionDraining(value: Boolean): Self = StObject.set(x, "connectionDraining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionDrainingTimeout(value: Double): Self = StObject.set(x, "connectionDrainingTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossZoneLoadBalancing(value: Boolean): Self = StObject.set(x, "crossZoneLoadBalancing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheck(value: GetLoadBalancerHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeners(value: js.Array[GetLoadBalancerListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersVarargs(value: GetLoadBalancerListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceSecurityGroup(value: String): Self = StObject.set(x, "sourceSecurityGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSecurityGroupId(value: String): Self = StObject.set(x, "sourceSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
