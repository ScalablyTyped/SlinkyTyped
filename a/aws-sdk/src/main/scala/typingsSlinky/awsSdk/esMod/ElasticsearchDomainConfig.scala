package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDomainConfig extends js.Object {
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.native
  /**
    * Specifies the AdvancedOptions for the domain. See Configuring Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.native
  /**
    * Specifies AdvancedSecurityOptions for the domain. 
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.native
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.native
  /**
    * Specifies the DomainEndpointOptions for the Elasticsearch domain.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
  /**
    * Specifies the EBSOptions for the Elasticsearch domain.
    */
  var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.native
  /**
    * Specifies the ElasticsearchClusterConfig for the Elasticsearch domain.
    */
  var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.native
  /**
    * String of format X.Y to specify version for the Elasticsearch domain.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.native
  /**
    * Specifies the EncryptionAtRestOptions for the Elasticsearch domain.
    */
  var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.native
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.native
  /**
    * Specifies the NodeToNodeEncryptionOptions for the Elasticsearch domain.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.native
  /**
    * Specifies the SnapshotOptions for the Elasticsearch domain.
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.native
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.native
}

object ElasticsearchDomainConfig {
  @scala.inline
  def apply(): ElasticsearchDomainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDomainConfig]
  }
  @scala.inline
  implicit class ElasticsearchDomainConfigOps[Self <: ElasticsearchDomainConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: AccessPoliciesStatus): Self = {
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
    def withAdvancedOptions(value: AdvancedOptionsStatus): Self = {
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
    def withAdvancedSecurityOptions(value: AdvancedSecurityOptionsStatus): Self = {
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
    def withCognitoOptions(value: CognitoOptionsStatus): Self = {
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
    def withDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = {
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
    def withEBSOptions(value: EBSOptionsStatus): Self = {
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
    def withElasticsearchClusterConfig(value: ElasticsearchClusterConfigStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchClusterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchClusterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchClusterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchVersion(value: ElasticsearchVersionStatus): Self = {
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
    def withEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = {
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
    def withLogPublishingOptions(value: LogPublishingOptionsStatus): Self = {
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
    def withNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptionsStatus): Self = {
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
    def withSnapshotOptions(value: SnapshotOptionsStatus): Self = {
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
    def withVPCOptions(value: VPCDerivedInfoStatus): Self = {
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

