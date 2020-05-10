package typingsSlinky.pulumiAws.domainMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.documentsMod.PolicyDocument
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainClusterConfig
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainEbsOptions
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions
import typingsSlinky.pulumiAws.inputMod.elasticsearch.DomainVpcOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: js.UndefOr[Input[DomainClusterConfig]] = js.native
  val cognitoOptions: js.UndefOr[Input[DomainCognitoOptions]] = js.native
  /**
    * Domain endpoint HTTP(S) related options. See below.
    */
  val domainEndpointOptions: js.UndefOr[Input[DomainDomainEndpointOptions]] = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: js.UndefOr[Input[DomainEbsOptions]] = js.native
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: js.UndefOr[Input[DomainEncryptAtRest]] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: js.UndefOr[Input[js.Array[Input[DomainLogPublishingOption]]]] = js.native
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: js.UndefOr[Input[DomainNodeToNodeEncryption]] = js.native
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: js.UndefOr[Input[DomainSnapshotOptions]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: js.UndefOr[Input[DomainVpcOptions]] = js.native
}

object DomainState {
  @scala.inline
  def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  @scala.inline
  implicit class DomainStateOps[Self <: DomainState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: Input[String | PolicyDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvancedOptions(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterConfig(value: Input[DomainClusterConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoOptions(value: Input[DomainCognitoOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainEndpointOptions(value: Input[DomainDomainEndpointOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainEndpointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainEndpointOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainEndpointOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptions(value: Input[DomainEbsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptAtRest(value: Input[DomainEncryptAtRest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptAtRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptAtRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptAtRest")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withKibanaEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kibanaEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKibanaEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kibanaEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLogPublishingOptions(value: Input[js.Array[Input[DomainLogPublishingOption]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPublishingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPublishingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPublishingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeToNodeEncryption(value: Input[DomainNodeToNodeEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeToNodeEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeToNodeEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeToNodeEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotOptions(value: Input[DomainSnapshotOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcOptions(value: Input[DomainVpcOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcOptions")(js.undefined)
        ret
    }
  }
  
}

