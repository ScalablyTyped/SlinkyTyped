package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.msk.ClusterBrokerNodeGroupInfo
import typingsSlinky.pulumiAws.outputMod.msk.ClusterClientAuthentication
import typingsSlinky.pulumiAws.outputMod.msk.ClusterConfigurationInfo
import typingsSlinky.pulumiAws.outputMod.msk.ClusterEncryptionInfo
import typingsSlinky.pulumiAws.outputMod.msk.ClusterLoggingInfo
import typingsSlinky.pulumiAws.outputMod.msk.ClusterOpenMonitoring
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskClusterMod {
  
  @JSImport("@pulumi/aws/msk/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
      */
    val bootstrapBrokers: Output_[String] = js.native
    
    /**
      * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
      */
    val bootstrapBrokersTls: Output_[String] = js.native
    
    /**
      * Configuration block for the broker nodes of the Kafka cluster.
      */
    val brokerNodeGroupInfo: Output_[ClusterBrokerNodeGroupInfo] = js.native
    
    /**
      * Configuration block for specifying a client authentication. See below.
      */
    val clientAuthentication: Output_[js.UndefOr[ClusterClientAuthentication]] = js.native
    
    /**
      * Name of the MSK cluster.
      */
    val clusterName: Output_[String] = js.native
    
    /**
      * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
      */
    val configurationInfo: Output_[js.UndefOr[ClusterConfigurationInfo]] = js.native
    
    /**
      * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
      * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
      */
    val currentVersion: Output_[String] = js.native
    
    /**
      * Configuration block for specifying encryption. See below.
      */
    val encryptionInfo: Output_[js.UndefOr[ClusterEncryptionInfo]] = js.native
    
    /**
      * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
      */
    val enhancedMonitoring: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specify the desired Kafka software version.
      */
    val kafkaVersion: Output_[String] = js.native
    
    /**
      * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
      */
    val loggingInfo: Output_[js.UndefOr[ClusterLoggingInfo]] = js.native
    
    /**
      * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
      */
    val numberOfBrokerNodes: Output_[Double] = js.native
    
    /**
      * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
      */
    val openMonitoring: Output_[js.UndefOr[ClusterOpenMonitoring]] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
      */
    val zookeeperConnectString: Output_[String] = js.native
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/msk/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): Cluster = js.native
    @JSImport("@pulumi/aws/msk/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
    @JSImport("@pulumi/aws/msk/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
    @JSImport("@pulumi/aws/msk/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/msk/cluster", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  trait ClusterArgs extends StObject {
    
    /**
      * Configuration block for the broker nodes of the Kafka cluster.
      */
    val brokerNodeGroupInfo: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo] = js.native
    
    /**
      * Configuration block for specifying a client authentication. See below.
      */
    val clientAuthentication: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterClientAuthentication]] = js.native
    
    /**
      * Name of the MSK cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
      */
    val configurationInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterConfigurationInfo]] = js.native
    
    /**
      * Configuration block for specifying encryption. See below.
      */
    val encryptionInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterEncryptionInfo]] = js.native
    
    /**
      * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
      */
    val enhancedMonitoring: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify the desired Kafka software version.
      */
    val kafkaVersion: Input[String] = js.native
    
    /**
      * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
      */
    val loggingInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterLoggingInfo]] = js.native
    
    /**
      * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
      */
    val numberOfBrokerNodes: Input[Double] = js.native
    
    /**
      * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
      */
    val openMonitoring: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterOpenMonitoring]] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(
      brokerNodeGroupInfo: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo],
      kafkaVersion: Input[String],
      numberOfBrokerNodes: Input[Double]
    ): ClusterArgs = {
      val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrokerNodeGroupInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]): Self = StObject.set(x, "brokerNodeGroupInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAuthentication(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterClientAuthentication]): Self = StObject.set(x, "clientAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAuthenticationUndefined: Self = StObject.set(x, "clientAuthentication", js.undefined)
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      @scala.inline
      def setConfigurationInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterConfigurationInfo]): Self = StObject.set(x, "configurationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationInfoUndefined: Self = StObject.set(x, "configurationInfo", js.undefined)
      
      @scala.inline
      def setEncryptionInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      @scala.inline
      def setEnhancedMonitoring(value: Input[String]): Self = StObject.set(x, "enhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedMonitoringUndefined: Self = StObject.set(x, "enhancedMonitoring", js.undefined)
      
      @scala.inline
      def setKafkaVersion(value: Input[String]): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterLoggingInfo]): Self = StObject.set(x, "loggingInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingInfoUndefined: Self = StObject.set(x, "loggingInfo", js.undefined)
      
      @scala.inline
      def setNumberOfBrokerNodes(value: Input[Double]): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMonitoring(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterOpenMonitoring]): Self = StObject.set(x, "openMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMonitoringUndefined: Self = StObject.set(x, "openMonitoring", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
      */
    val bootstrapBrokers: js.UndefOr[Input[String]] = js.native
    
    /**
      * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
      */
    val bootstrapBrokersTls: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for the broker nodes of the Kafka cluster.
      */
    val brokerNodeGroupInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]] = js.native
    
    /**
      * Configuration block for specifying a client authentication. See below.
      */
    val clientAuthentication: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterClientAuthentication]] = js.native
    
    /**
      * Name of the MSK cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
      */
    val configurationInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterConfigurationInfo]] = js.native
    
    /**
      * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
      * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
      */
    val currentVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for specifying encryption. See below.
      */
    val encryptionInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterEncryptionInfo]] = js.native
    
    /**
      * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
      */
    val enhancedMonitoring: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify the desired Kafka software version.
      */
    val kafkaVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
      */
    val loggingInfo: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterLoggingInfo]] = js.native
    
    /**
      * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
      */
    val numberOfBrokerNodes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
      */
    val openMonitoring: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterOpenMonitoring]] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
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
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBootstrapBrokers(value: Input[String]): Self = StObject.set(x, "bootstrapBrokers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapBrokersTls(value: Input[String]): Self = StObject.set(x, "bootstrapBrokersTls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapBrokersTlsUndefined: Self = StObject.set(x, "bootstrapBrokersTls", js.undefined)
      
      @scala.inline
      def setBootstrapBrokersUndefined: Self = StObject.set(x, "bootstrapBrokers", js.undefined)
      
      @scala.inline
      def setBrokerNodeGroupInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]): Self = StObject.set(x, "brokerNodeGroupInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerNodeGroupInfoUndefined: Self = StObject.set(x, "brokerNodeGroupInfo", js.undefined)
      
      @scala.inline
      def setClientAuthentication(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterClientAuthentication]): Self = StObject.set(x, "clientAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientAuthenticationUndefined: Self = StObject.set(x, "clientAuthentication", js.undefined)
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      @scala.inline
      def setConfigurationInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterConfigurationInfo]): Self = StObject.set(x, "configurationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationInfoUndefined: Self = StObject.set(x, "configurationInfo", js.undefined)
      
      @scala.inline
      def setCurrentVersion(value: Input[String]): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      @scala.inline
      def setEncryptionInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      @scala.inline
      def setEnhancedMonitoring(value: Input[String]): Self = StObject.set(x, "enhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedMonitoringUndefined: Self = StObject.set(x, "enhancedMonitoring", js.undefined)
      
      @scala.inline
      def setKafkaVersion(value: Input[String]): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersionUndefined: Self = StObject.set(x, "kafkaVersion", js.undefined)
      
      @scala.inline
      def setLoggingInfo(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterLoggingInfo]): Self = StObject.set(x, "loggingInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingInfoUndefined: Self = StObject.set(x, "loggingInfo", js.undefined)
      
      @scala.inline
      def setNumberOfBrokerNodes(value: Input[Double]): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "numberOfBrokerNodes", js.undefined)
      
      @scala.inline
      def setOpenMonitoring(value: Input[typingsSlinky.pulumiAws.inputMod.msk.ClusterOpenMonitoring]): Self = StObject.set(x, "openMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMonitoringUndefined: Self = StObject.set(x, "openMonitoring", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setZookeeperConnectString(value: Input[String]): Self = StObject.set(x, "zookeeperConnectString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZookeeperConnectStringUndefined: Self = StObject.set(x, "zookeeperConnectString", js.undefined)
    }
  }
}
