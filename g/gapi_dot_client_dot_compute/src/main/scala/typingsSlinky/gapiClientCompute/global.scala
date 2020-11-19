package typingsSlinky.gapiClientCompute

import typingsSlinky.gapiClientCompute.gapi.client.compute.AcceleratorTypesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.AddressesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.AutoscalersResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.BackendBucketsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.BackendServicesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.DiskTypesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.DisksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.FirewallsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.ForwardingRulesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.GlobalAddressesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.GlobalForwardingRulesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.GlobalOperationsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.HealthChecksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.HttpHealthChecksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.HttpsHealthChecksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.ImagesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.InstanceGroupManagersResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.InstanceGroupsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.InstanceTemplatesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.InstancesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.LicensesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.MachineTypesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.NetworksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.ProjectsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionAutoscalersResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionBackendServicesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionCommitmentsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionInstanceGroupManagersResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionInstanceGroupsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionOperationsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RegionsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RoutersResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.RoutesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.SnapshotsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.SslCertificatesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.SubnetworksResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetHttpProxiesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetHttpsProxiesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetInstancesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetPoolsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetSslProxiesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetTcpProxiesResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.TargetVpnGatewaysResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.UrlMapsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.VpnTunnelsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.ZoneOperationsResource
import typingsSlinky.gapiClientCompute.gapi.client.compute.ZonesResource
import typingsSlinky.gapiClientCompute.gapiClientComputeStrings.compute
import typingsSlinky.gapiClientCompute.gapiClientComputeStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      val acceleratorTypes: AcceleratorTypesResource = js.native
      
      val addresses: AddressesResource = js.native
      
      val autoscalers: AutoscalersResource = js.native
      
      val backendBuckets: BackendBucketsResource = js.native
      
      val backendServices: BackendServicesResource = js.native
      
      val diskTypes: DiskTypesResource = js.native
      
      val disks: DisksResource = js.native
      
      val firewalls: FirewallsResource = js.native
      
      val forwardingRules: ForwardingRulesResource = js.native
      
      val globalAddresses: GlobalAddressesResource = js.native
      
      val globalForwardingRules: GlobalForwardingRulesResource = js.native
      
      val globalOperations: GlobalOperationsResource = js.native
      
      val healthChecks: HealthChecksResource = js.native
      
      val httpHealthChecks: HttpHealthChecksResource = js.native
      
      val httpsHealthChecks: HttpsHealthChecksResource = js.native
      
      val images: ImagesResource = js.native
      
      val instanceGroupManagers: InstanceGroupManagersResource = js.native
      
      val instanceGroups: InstanceGroupsResource = js.native
      
      val instanceTemplates: InstanceTemplatesResource = js.native
      
      val instances: InstancesResource = js.native
      
      val licenses: LicensesResource = js.native
      
      /** Load Compute Engine API v1 */
      def load(name: compute, version: v1): js.Thenable[Unit] = js.native
      def load(name: compute, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val machineTypes: MachineTypesResource = js.native
      
      val networks: NetworksResource = js.native
      
      val projects: ProjectsResource = js.native
      
      val regionAutoscalers: RegionAutoscalersResource = js.native
      
      val regionBackendServices: RegionBackendServicesResource = js.native
      
      val regionCommitments: RegionCommitmentsResource = js.native
      
      val regionInstanceGroupManagers: RegionInstanceGroupManagersResource = js.native
      
      val regionInstanceGroups: RegionInstanceGroupsResource = js.native
      
      val regionOperations: RegionOperationsResource = js.native
      
      val regions: RegionsResource = js.native
      
      val routers: RoutersResource = js.native
      
      val routes: RoutesResource = js.native
      
      val snapshots: SnapshotsResource = js.native
      
      val sslCertificates: SslCertificatesResource = js.native
      
      val subnetworks: SubnetworksResource = js.native
      
      val targetHttpProxies: TargetHttpProxiesResource = js.native
      
      val targetHttpsProxies: TargetHttpsProxiesResource = js.native
      
      val targetInstances: TargetInstancesResource = js.native
      
      val targetPools: TargetPoolsResource = js.native
      
      val targetSslProxies: TargetSslProxiesResource = js.native
      
      val targetTcpProxies: TargetTcpProxiesResource = js.native
      
      val targetVpnGateways: TargetVpnGatewaysResource = js.native
      
      val urlMaps: UrlMapsResource = js.native
      
      val vpnTunnels: VpnTunnelsResource = js.native
      
      val zoneOperations: ZoneOperationsResource = js.native
      
      val zones: ZonesResource = js.native
    }
  }
}
