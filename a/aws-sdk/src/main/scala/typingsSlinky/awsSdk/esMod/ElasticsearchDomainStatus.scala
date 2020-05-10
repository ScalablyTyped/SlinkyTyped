package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDomainStatus extends js.Object {
  /**
    * The Amazon resource name (ARN) of an Elasticsearch domain. See Identifiers for IAM Entities in Using AWS Identity and Access Management for more information.
    */
  var ARN: typingsSlinky.awsSdk.esMod.ARN = js.native
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    * Specifies the status of the AdvancedOptions
    */
  var AdvancedOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * The current status of the Elasticsearch domain's advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.AdvancedSecurityOptions] = js.native
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * The domain creation status. True if the creation of an Elasticsearch domain is complete. False if domain creation is still in progress.
    */
  var Created: js.UndefOr[Boolean] = js.native
  /**
    * The domain deletion status. True if a delete request has been received for the domain but resource cleanup is still in progress. False if the domain has not been deleted. Once domain deletion is complete, the status of the domain is no longer returned.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  /**
    * The current status of the Elasticsearch domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The unique identifier for the specified Elasticsearch domain.
    */
  var DomainId: typingsSlinky.awsSdk.esMod.DomainId = js.native
  /**
    * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
  /**
    * The EBSOptions for the specified domain. See Configuring EBS-based Storage for more information.
    */
  var EBSOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.EBSOptions] = js.native
  /**
    * The type and number of instances in the domain cluster.
    */
  var ElasticsearchClusterConfig: typingsSlinky.awsSdk.esMod.ElasticsearchClusterConfig = js.native
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  /**
    *  Specifies the status of the EncryptionAtRestOptions.
    */
  var EncryptionAtRestOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.EncryptionAtRestOptions] = js.native
  /**
    * The Elasticsearch domain endpoint that you use to submit index and search requests.
    */
  var Endpoint: js.UndefOr[ServiceUrl] = js.native
  /**
    * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example key, value: 'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'.
    */
  var Endpoints: js.UndefOr[EndpointsMap] = js.native
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Specifies the status of the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.NodeToNodeEncryptionOptions] = js.native
  /**
    * The status of the Elasticsearch domain configuration. True if Amazon Elasticsearch Service is processing configuration changes. False if the configuration is active.
    */
  var Processing: js.UndefOr[Boolean] = js.native
  /**
    * The current status of the Elasticsearch domain's service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.ServiceSoftwareOptions] = js.native
  /**
    * Specifies the status of the SnapshotOptions
    */
  var SnapshotOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * The status of an Elasticsearch domain version upgrade. True if Amazon Elasticsearch Service is undergoing a version upgrade. False if the configuration is active.
    */
  var UpgradeProcessing: js.UndefOr[Boolean] = js.native
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.native
}

object ElasticsearchDomainStatus {
  @scala.inline
  def apply(
    ARN: ARN,
    DomainId: DomainId,
    DomainName: DomainName,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig
  ): ElasticsearchDomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ElasticsearchClusterConfig = ElasticsearchClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDomainStatus]
  }
  @scala.inline
  implicit class ElasticsearchDomainStatusOps[Self <: ElasticsearchDomainStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchClusterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessPolicies(value: PolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvancedOptions(value: AdvancedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvancedSecurityOptions(value: AdvancedSecurityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedSecurityOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedSecurityOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedSecurityOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoOptions(value: CognitoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainEndpointOptions(value: DomainEndpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainEndpointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainEndpointOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainEndpointOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEBSOptions(value: EBSOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EBSOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEBSOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EBSOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchVersion(value: ElasticsearchVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAtRestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: ServiceUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: EndpointsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withLogPublishingOptions(value: LogPublishingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPublishingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPublishingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPublishingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeToNodeEncryptionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeToNodeEncryptionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeToNodeEncryptionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processing")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSoftwareOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSoftwareOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSoftwareOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotOptions(value: SnapshotOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withVPCOptions(value: VPCDerivedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCOptions")(js.undefined)
        ret
    }
  }
  
}

