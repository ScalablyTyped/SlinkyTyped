package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.mq.BrokerConfiguration
import typingsSlinky.pulumiAws.outputMod.mq.BrokerEncryptionOptions
import typingsSlinky.pulumiAws.outputMod.mq.BrokerInstance
import typingsSlinky.pulumiAws.outputMod.mq.BrokerLogs
import typingsSlinky.pulumiAws.outputMod.mq.BrokerMaintenanceWindowStartTime
import typingsSlinky.pulumiAws.outputMod.mq.BrokerUser
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brokerMod {
  
  @JSImport("@pulumi/aws/mq/broker", "Broker")
  @js.native
  class Broker protected () extends CustomResource {
    /**
      * Create a Broker resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BrokerArgs) = this()
    def this(name: String, args: BrokerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether any broker modifications
      * are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of the broker.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
      */
    val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the broker.
      */
    val brokerName: Output_[String] = js.native
    
    /**
      * Configuration of the broker. See below.
      */
    val configuration: Output_[BrokerConfiguration] = js.native
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: Output_[js.UndefOr[BrokerEncryptionOptions]] = js.native
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: Output_[String] = js.native
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: Output_[String] = js.native
    
    /**
      * A list of information about allocated brokers (both active & standby).
      * * `instances.0.console_url` - The URL of the broker's [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
      * * `instances.0.ip_address` - The IP Address of the broker.
      * * `instances.0.endpoints` - The broker's wire-level protocol endpoints in the following order & format referenceable e.g. as `instances.0.endpoints.0` (SSL):
      * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
      * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
      * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
      * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
      * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
      */
    val instances: Output_[js.Array[BrokerInstance]] = js.native
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: Output_[js.UndefOr[BrokerLogs]] = js.native
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: Output_[BrokerMaintenanceWindowStartTime] = js.native
    
    /**
      * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
      */
    val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The list of security group IDs assigned to the broker.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: Output_[js.Array[BrokerUser]] = js.native
  }
  /* static members */
  object Broker {
    
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mq/broker", "Broker.get")
    @js.native
    def get(name: String, id: Input[ID]): Broker = js.native
    @JSImport("@pulumi/aws/mq/broker", "Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Broker = js.native
    @JSImport("@pulumi/aws/mq/broker", "Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: BrokerState): Broker = js.native
    @JSImport("@pulumi/aws/mq/broker", "Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): Broker = js.native
    
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mq/broker", "Broker.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = js.native
  }
  
  @js.native
  trait BrokerArgs extends StObject {
    
    /**
      * Specifies whether any broker modifications
      * are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the broker.
      */
    val brokerName: Input[String] = js.native
    
    /**
      * Configuration of the broker. See below.
      */
    val configuration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerConfiguration]] = js.native
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerEncryptionOptions]] = js.native
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: Input[String] = js.native
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: Input[String] = js.native
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: Input[String] = js.native
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerLogs]] = js.native
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]] = js.native
    
    /**
      * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The list of security group IDs assigned to the broker.
      */
    val securityGroups: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]]] = js.native
  }
  object BrokerArgs {
    
    @scala.inline
    def apply(
      brokerName: Input[String],
      engineType: Input[String],
      engineVersion: Input[String],
      hostInstanceType: Input[String],
      securityGroups: Input[js.Array[Input[String]]],
      users: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]]]
    ): BrokerArgs = {
      val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerArgs]
    }
    
    @scala.inline
    implicit class BrokerArgsMutableBuilder[Self <: BrokerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setBrokerName(value: Input[String]): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDeploymentMode(value: Input[String]): Self = StObject.set(x, "deploymentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentModeUndefined: Self = StObject.set(x, "deploymentMode", js.undefined)
      
      @scala.inline
      def setEncryptionOptions(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerEncryptionOptions]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      @scala.inline
      def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostInstanceType(value: Input[String]): Self = StObject.set(x, "hostInstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogs(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerLogs]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setMaintenanceWindowStartTime(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "maintenanceWindowStartTime", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUsers(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BrokerState extends StObject {
    
    /**
      * Specifies whether any broker modifications
      * are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the broker.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the broker.
      */
    val brokerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration of the broker. See below.
      */
    val configuration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerConfiguration]] = js.native
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerEncryptionOptions]] = js.native
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of information about allocated brokers (both active & standby).
      * * `instances.0.console_url` - The URL of the broker's [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
      * * `instances.0.ip_address` - The IP Address of the broker.
      * * `instances.0.endpoints` - The broker's wire-level protocol endpoints in the following order & format referenceable e.g. as `instances.0.endpoints.0` (SSL):
      * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
      * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
      * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
      * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
      * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
      */
    val instances: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerInstance]]]] = js.native
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerLogs]] = js.native
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]] = js.native
    
    /**
      * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The list of security group IDs assigned to the broker.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]]]] = js.native
  }
  object BrokerState {
    
    @scala.inline
    def apply(): BrokerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerState]
    }
    
    @scala.inline
    implicit class BrokerStateMutableBuilder[Self <: BrokerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setBrokerName(value: Input[String]): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerNameUndefined: Self = StObject.set(x, "brokerName", js.undefined)
      
      @scala.inline
      def setConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDeploymentMode(value: Input[String]): Self = StObject.set(x, "deploymentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentModeUndefined: Self = StObject.set(x, "deploymentMode", js.undefined)
      
      @scala.inline
      def setEncryptionOptions(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerEncryptionOptions]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      @scala.inline
      def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setHostInstanceType(value: Input[String]): Self = StObject.set(x, "hostInstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostInstanceTypeUndefined: Self = StObject.set(x, "hostInstanceType", js.undefined)
      
      @scala.inline
      def setInstances(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerInstance]]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      @scala.inline
      def setInstancesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerInstance]*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setLogs(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerLogs]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setMaintenanceWindowStartTime(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "maintenanceWindowStartTime", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUsers(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.mq.BrokerUser]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
