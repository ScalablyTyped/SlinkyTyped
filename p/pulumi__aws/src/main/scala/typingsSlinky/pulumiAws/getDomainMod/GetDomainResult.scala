package typingsSlinky.pulumiAws.getDomainMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainClusterConfig
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainCognitoOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainEbsOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainEncryptionAtRest
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainLogPublishingOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainNodeToNodeEncryption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainSnapshotOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainVpcOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainResult extends js.Object {
  /**
    * The policy document attached to the domain.
    */
  val accessPolicies: String = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    */
  val advancedOptions: StringDictionary[js.Any] = js.native
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  val arn: String = js.native
  /**
    * Cluster configuration of the domain.
    */
  val clusterConfigs: js.Array[GetDomainClusterConfig] = js.native
  /**
    * Domain Amazon Cognito Authentication options for Kibana.
    */
  val cognitoOptions: js.Array[GetDomainCognitoOption] = js.native
  /**
    * Status of the creation of the domain.
    */
  val created: Boolean = js.native
  /**
    * Status of the deletion of the domain.
    */
  val deleted: Boolean = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: String = js.native
  val domainName: String = js.native
  /**
    * EBS Options for the instances in the domain.
    */
  val ebsOptions: js.Array[GetDomainEbsOption] = js.native
  /**
    * ElasticSearch version for the domain.
    */
  val elasticsearchVersion: String = js.native
  /**
    * Domain encryption at rest related options.
    */
  val encryptionAtRests: js.Array[GetDomainEncryptionAtRest] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Domain-specific endpoint used to access the Kibana application.
    */
  val kibanaEndpoint: String = js.native
  /**
    * Domain log publishing related options.
    */
  val logPublishingOptions: js.Array[GetDomainLogPublishingOption] = js.native
  /**
    * Domain in transit encryption related options.
    */
  val nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption] = js.native
  /**
    * Status of a configuration change in the domain.
    * * `snapshotOptions` – Domain snapshot related options.
    */
  val processing: String = js.native
  val snapshotOptions: js.Array[GetDomainSnapshotOption] = js.native
  /**
    * The tags assigned to the domain.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * VPC Options for private Elasticsearch domains.
    */
  val vpcOptions: js.Array[GetDomainVpcOption] = js.native
}

object GetDomainResult {
  @scala.inline
  def apply(
    accessPolicies: String,
    advancedOptions: StringDictionary[js.Any],
    arn: String,
    clusterConfigs: js.Array[GetDomainClusterConfig],
    cognitoOptions: js.Array[GetDomainCognitoOption],
    created: Boolean,
    deleted: Boolean,
    domainId: String,
    domainName: String,
    ebsOptions: js.Array[GetDomainEbsOption],
    elasticsearchVersion: String,
    encryptionAtRests: js.Array[GetDomainEncryptionAtRest],
    endpoint: String,
    id: String,
    kibanaEndpoint: String,
    logPublishingOptions: js.Array[GetDomainLogPublishingOption],
    nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption],
    processing: String,
    snapshotOptions: js.Array[GetDomainSnapshotOption],
    tags: StringDictionary[js.Any],
    vpcOptions: js.Array[GetDomainVpcOption]
  ): GetDomainResult = {
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], advancedOptions = advancedOptions.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], clusterConfigs = clusterConfigs.asInstanceOf[js.Any], cognitoOptions = cognitoOptions.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], ebsOptions = ebsOptions.asInstanceOf[js.Any], elasticsearchVersion = elasticsearchVersion.asInstanceOf[js.Any], encryptionAtRests = encryptionAtRests.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kibanaEndpoint = kibanaEndpoint.asInstanceOf[js.Any], logPublishingOptions = logPublishingOptions.asInstanceOf[js.Any], nodeToNodeEncryptions = nodeToNodeEncryptions.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], snapshotOptions = snapshotOptions.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcOptions = vpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainResult]
  }
  @scala.inline
  implicit class GetDomainResultOps[Self <: GetDomainResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvancedOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterConfigs(value: js.Array[GetDomainClusterConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoOptions(value: js.Array[GetDomainCognitoOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbsOptions(value: js.Array[GetDomainEbsOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElasticsearchVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionAtRests(value: js.Array[GetDomainEncryptionAtRest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAtRests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKibanaEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kibanaEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogPublishingOptions(value: js.Array[GetDomainLogPublishingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPublishingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeToNodeEncryptions(value: js.Array[GetDomainNodeToNodeEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeToNodeEncryptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotOptions(value: js.Array[GetDomainSnapshotOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcOptions(value: js.Array[GetDomainVpcOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

