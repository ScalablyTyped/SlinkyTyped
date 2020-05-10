package typingsSlinky.pulumiAws.mskClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo
import typingsSlinky.pulumiAws.inputMod.msk.ClusterClientAuthentication
import typingsSlinky.pulumiAws.inputMod.msk.ClusterConfigurationInfo
import typingsSlinky.pulumiAws.inputMod.msk.ClusterEncryptionInfo
import typingsSlinky.pulumiAws.inputMod.msk.ClusterOpenMonitoring
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to boostrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
    */
  val bootstrapBrokers: js.UndefOr[Input[String]] = js.native
  /**
    * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to boostrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
    */
  val bootstrapBrokersTls: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: js.UndefOr[Input[ClusterBrokerNodeGroupInfo]] = js.native
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[Input[ClusterClientAuthentication]] = js.native
  /**
    * Name of the MSK cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[Input[ClusterConfigurationInfo]] = js.native
  /**
    * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val currentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: js.UndefOr[Input[ClusterEncryptionInfo]] = js.native
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: js.UndefOr[Input[Double]] = js.native
  /**
    * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
    */
  val openMonitoring: js.UndefOr[Input[ClusterOpenMonitoring]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: js.UndefOr[Input[String]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBootstrapBrokers(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapBrokers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapBrokers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapBrokers")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapBrokersTls(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapBrokersTls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapBrokersTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapBrokersTls")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerNodeGroupInfo(value: Input[ClusterBrokerNodeGroupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerNodeGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerNodeGroupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerNodeGroupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAuthentication(value: Input[ClusterClientAuthentication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationInfo(value: Input[ClusterConfigurationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInfo(value: Input[ClusterEncryptionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancedMonitoring(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBrokerNodes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBrokerNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBrokerNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBrokerNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMonitoring(value: Input[ClusterOpenMonitoring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMonitoring")(js.undefined)
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
    def withZookeeperConnectString(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zookeeperConnectString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZookeeperConnectString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zookeeperConnectString")(js.undefined)
        ret
    }
  }
  
}

