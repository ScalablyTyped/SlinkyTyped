package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInfo extends js.Object {
  /**
    * 
    Arn of active cluster operation.
    
    */
  var ActiveOperationArn: js.UndefOr[string] = js.native
  /**
    * 
    Information about the broker nodes.
    
    */
  var BrokerNodeGroupInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.BrokerNodeGroupInfo] = js.native
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClientAuthentication] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.native
  /**
    * 
    The time when the cluster was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.native
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.native
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EncryptionInfo] = js.native
  /**
    * 
    Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of monitoring, see Monitoring.
    
    */
  var EnhancedMonitoring: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  var LoggingInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.native
  /**
    * 
    Settings for open monitoring using Prometheus.
    
    */
  var OpenMonitoring: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.OpenMonitoring] = js.native
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.native
  var StateInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.StateInfo] = js.native
  /**
    * 
    Tags attached to the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster.
    
    */
  var ZookeeperConnectString: js.UndefOr[string] = js.native
}

object ClusterInfo {
  @scala.inline
  def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOperationArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveOperationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOperationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveOperationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerNodeGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerNodeGroupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerNodeGroupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAuthentication(value: ClientAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBrokerSoftwareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentBrokerSoftwareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBrokerSoftwareInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInfo(value: EncryptionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancedMonitoring(value: EnhancedMonitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingInfo(value: LoggingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBrokerNodes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBrokerNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBrokerNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBrokerNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMonitoring(value: OpenMonitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateInfo(value: StateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withZookeeperConnectString(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperConnectString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZookeeperConnectString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperConnectString")(js.undefined)
        ret
    }
  }
  
}

