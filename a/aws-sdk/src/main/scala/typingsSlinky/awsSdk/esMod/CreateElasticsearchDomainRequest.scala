package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElasticsearchDomainRequest extends js.Object {
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * Specifies advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.native
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
  /**
    * Options to enable, disable and specify the type and size of EBS storage volumes. 
    */
  var EBSOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.EBSOptions] = js.native
  /**
    * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
    */
  var ElasticsearchClusterConfig: js.UndefOr[typingsSlinky.awsSdk.esMod.ElasticsearchClusterConfig] = js.native
  /**
    * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  /**
    * Specifies the Encryption At Rest Options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.EncryptionAtRestOptions] = js.native
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Specifies the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.NodeToNodeEncryptionOptions] = js.native
  /**
    * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.VPCOptions] = js.native
}

object CreateElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): CreateElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateElasticsearchDomainRequest]
  }
  @scala.inline
  implicit class CreateElasticsearchDomainRequestOps[Self <: CreateElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
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
    def withAdvancedSecurityOptions(value: AdvancedSecurityOptionsInput): Self = {
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
    def withElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = {
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
    def withVPCOptions(value: VPCOptions): Self = {
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

