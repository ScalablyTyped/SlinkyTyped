package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainDetails extends js.Object {
  /**
    * IAM policy document specifying the access policies for the new Amazon ES domain.
    */
  var AccessPolicies: js.UndefOr[NonEmptyString] = js.native
  /**
    * Additional options for the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions] = js.native
  /**
    * Unique identifier for an Amazon ES domain.
    */
  var DomainId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Name of an Amazon ES domain. Domain names are unique across all domains owned by the same account within an AWS Region. Domain names must start with a lowercase letter and must be between 3 and 28 characters. Valid characters are a-z (lowercase only), 0-9, and – (hyphen). 
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * Elasticsearch version.
    */
  var ElasticsearchVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * Details about the configuration for encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain. The endpoint is a service URL. 
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  /**
    * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
    */
  var Endpoints: js.UndefOr[FieldMap] = js.native
  /**
    * Details about the configuration for node-to-node encryption.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions] = js.native
  /**
    * Information that Amazon ES derives based on VPCOptions for the domain.
    */
  var VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions] = js.native
}

object AwsElasticsearchDomainDetails {
  @scala.inline
  def apply(): AwsElasticsearchDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDetails]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainDetailsOps[Self <: AwsElasticsearchDomainDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: NonEmptyString): Self = {
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
    def withDomainEndpointOptions(value: AwsElasticsearchDomainDomainEndpointOptions): Self = {
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
    def withDomainId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchVersion(value: NonEmptyString): Self = {
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
    def withEncryptionAtRestOptions(value: AwsElasticsearchDomainEncryptionAtRestOptions): Self = {
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
    def withEndpoint(value: NonEmptyString): Self = {
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
    def withEndpoints(value: FieldMap): Self = {
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
    def withNodeToNodeEncryptionOptions(value: AwsElasticsearchDomainNodeToNodeEncryptionOptions): Self = {
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
    def withVPCOptions(value: AwsElasticsearchDomainVPCOptions): Self = {
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

