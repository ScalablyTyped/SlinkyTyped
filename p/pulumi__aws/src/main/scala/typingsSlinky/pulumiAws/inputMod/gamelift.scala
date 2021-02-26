package typingsSlinky.pulumiAws.inputMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamelift {
  
  @js.native
  trait AliasRoutingStrategy extends StObject {
    
    /**
      * ID of the Gamelift Fleet to point the alias to.
      */
    var fleetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Message text to be used with the `TERMINAL` routing strategy.
      */
    var message: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
      */
    var `type`: Input[String] = js.native
  }
  object AliasRoutingStrategy {
    
    @scala.inline
    def apply(`type`: Input[String]): AliasRoutingStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasRoutingStrategy]
    }
    
    @scala.inline
    implicit class AliasRoutingStrategyMutableBuilder[Self <: AliasRoutingStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFleetId(value: Input[String]): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetIdUndefined: Self = StObject.set(x, "fleetId", js.undefined)
      
      @scala.inline
      def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BuildStorageLocation extends StObject {
    
    /**
      * Name of your S3 bucket.
      */
    var bucket: Input[String] = js.native
    
    /**
      * Name of the zip file containing your build files.
      */
    var key: Input[String] = js.native
    
    /**
      * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
      */
    var roleArn: Input[String] = js.native
  }
  object BuildStorageLocation {
    
    @scala.inline
    def apply(bucket: Input[String], key: Input[String], roleArn: Input[String]): BuildStorageLocation = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildStorageLocation]
    }
    
    @scala.inline
    implicit class BuildStorageLocationMutableBuilder[Self <: BuildStorageLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FleetEc2InboundPermission extends StObject {
    
    /**
      * Starting value for a range of allowed port numbers.
      */
    var fromPort: Input[Double] = js.native
    
    /**
      * Range of allowed IP addresses expressed in CIDR notation. e.g. `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
      */
    var ipRange: Input[String] = js.native
    
    /**
      * Network communication protocol used by the fleet. e.g. `TCP` or `UDP`
      */
    var protocol: Input[String] = js.native
    
    /**
      * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `fromPort`.
      */
    var toPort: Input[Double] = js.native
  }
  object FleetEc2InboundPermission {
    
    @scala.inline
    def apply(fromPort: Input[Double], ipRange: Input[String], protocol: Input[String], toPort: Input[Double]): FleetEc2InboundPermission = {
      val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetEc2InboundPermission]
    }
    
    @scala.inline
    implicit class FleetEc2InboundPermissionMutableBuilder[Self <: FleetEc2InboundPermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpRange(value: Input[String]): Self = StObject.set(x, "ipRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FleetResourceCreationLimitPolicy extends StObject {
    
    /**
      * Maximum number of game sessions that an individual can create during the policy period.
      */
    var newGameSessionsPerCreator: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Time span used in evaluating the resource creation limit policy.
      */
    var policyPeriodInMinutes: js.UndefOr[Input[Double]] = js.native
  }
  object FleetResourceCreationLimitPolicy {
    
    @scala.inline
    def apply(): FleetResourceCreationLimitPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetResourceCreationLimitPolicy]
    }
    
    @scala.inline
    implicit class FleetResourceCreationLimitPolicyMutableBuilder[Self <: FleetResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewGameSessionsPerCreator(value: Input[Double]): Self = StObject.set(x, "newGameSessionsPerCreator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewGameSessionsPerCreatorUndefined: Self = StObject.set(x, "newGameSessionsPerCreator", js.undefined)
      
      @scala.inline
      def setPolicyPeriodInMinutes(value: Input[Double]): Self = StObject.set(x, "policyPeriodInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyPeriodInMinutesUndefined: Self = StObject.set(x, "policyPeriodInMinutes", js.undefined)
    }
  }
  
  @js.native
  trait FleetRuntimeConfiguration extends StObject {
    
    /**
      * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
      */
    var gameSessionActivationTimeoutSeconds: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
      */
    var maxConcurrentGameSessionActivations: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
      */
    var serverProcesses: js.UndefOr[Input[js.Array[Input[FleetRuntimeConfigurationServerProcess]]]] = js.native
  }
  object FleetRuntimeConfiguration {
    
    @scala.inline
    def apply(): FleetRuntimeConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetRuntimeConfiguration]
    }
    
    @scala.inline
    implicit class FleetRuntimeConfigurationMutableBuilder[Self <: FleetRuntimeConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGameSessionActivationTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "gameSessionActivationTimeoutSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameSessionActivationTimeoutSecondsUndefined: Self = StObject.set(x, "gameSessionActivationTimeoutSeconds", js.undefined)
      
      @scala.inline
      def setMaxConcurrentGameSessionActivations(value: Input[Double]): Self = StObject.set(x, "maxConcurrentGameSessionActivations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentGameSessionActivationsUndefined: Self = StObject.set(x, "maxConcurrentGameSessionActivations", js.undefined)
      
      @scala.inline
      def setServerProcesses(value: Input[js.Array[Input[FleetRuntimeConfigurationServerProcess]]]): Self = StObject.set(x, "serverProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerProcessesUndefined: Self = StObject.set(x, "serverProcesses", js.undefined)
      
      @scala.inline
      def setServerProcessesVarargs(value: Input[FleetRuntimeConfigurationServerProcess]*): Self = StObject.set(x, "serverProcesses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FleetRuntimeConfigurationServerProcess extends StObject {
    
    /**
      * Number of server processes using this configuration to run concurrently on an instance.
      */
    var concurrentExecutions: Input[Double] = js.native
    
    /**
      * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
      */
    var launchPath: Input[String] = js.native
    
    /**
      * Optional list of parameters to pass to the server executable on launch.
      */
    var parameters: js.UndefOr[Input[String]] = js.native
  }
  object FleetRuntimeConfigurationServerProcess {
    
    @scala.inline
    def apply(concurrentExecutions: Input[Double], launchPath: Input[String]): FleetRuntimeConfigurationServerProcess = {
      val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions.asInstanceOf[js.Any], launchPath = launchPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetRuntimeConfigurationServerProcess]
    }
    
    @scala.inline
    implicit class FleetRuntimeConfigurationServerProcessMutableBuilder[Self <: FleetRuntimeConfigurationServerProcess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrentExecutions(value: Input[Double]): Self = StObject.set(x, "concurrentExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchPath(value: Input[String]): Self = StObject.set(x, "launchPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: Input[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  @js.native
  trait GameSessionQueuePlayerLatencyPolicy extends StObject {
    
    /**
      * Maximum latency value that is allowed for any player.
      */
    var maximumIndividualPlayerLatencyMilliseconds: Input[Double] = js.native
    
    /**
      * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
      */
    var policyDurationSeconds: js.UndefOr[Input[Double]] = js.native
  }
  object GameSessionQueuePlayerLatencyPolicy {
    
    @scala.inline
    def apply(maximumIndividualPlayerLatencyMilliseconds: Input[Double]): GameSessionQueuePlayerLatencyPolicy = {
      val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GameSessionQueuePlayerLatencyPolicy]
    }
    
    @scala.inline
    implicit class GameSessionQueuePlayerLatencyPolicyMutableBuilder[Self <: GameSessionQueuePlayerLatencyPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximumIndividualPlayerLatencyMilliseconds(value: Input[Double]): Self = StObject.set(x, "maximumIndividualPlayerLatencyMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDurationSeconds(value: Input[Double]): Self = StObject.set(x, "policyDurationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDurationSecondsUndefined: Self = StObject.set(x, "policyDurationSeconds", js.undefined)
    }
  }
}
