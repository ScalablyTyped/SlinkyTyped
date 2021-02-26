package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object healthCheckMod {
  
  @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck")
  @js.native
  class HealthCheck protected () extends CustomResource {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HealthCheckArgs) = this()
    def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
      */
    val childHealthThreshold: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
      */
    val childHealthchecks: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the CloudWatch alarm.
      */
    val cloudwatchAlarmName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The CloudWatchRegion that the CloudWatch alarm was created in.
      */
    val cloudwatchAlarmRegion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
      * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
      * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
      * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
      */
    val disabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
      */
    val enableSni: Output_[Boolean] = js.native
    
    /**
      * The number of consecutive health checks that an endpoint must pass or fail.
      */
    val failureThreshold: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The fully qualified domain name of the endpoint to be checked.
      */
    val fqdn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
      */
    val insufficientDataHealthStatus: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
      */
    val invertHealthcheck: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The IP address of the endpoint to be checked.
      */
    val ipAddress: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
      */
    val measureLatency: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The port of the endpoint to be checked.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single healthCheck set amongst others)
      */
    val referenceName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
      */
    val regions: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
      */
    val requestInterval: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The path that you want Amazon Route 53 to request when performing health checks.
      */
    val resourcePath: Output_[js.UndefOr[String]] = js.native
    
    /**
      * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
      */
    val searchString: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the health check.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object HealthCheck {
    
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID]): HealthCheck = js.native
    @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): HealthCheck = js.native
    @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): HealthCheck = js.native
    @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck.get")
    @js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): HealthCheck = js.native
    
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/healthCheck", "HealthCheck.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
  }
  
  @js.native
  trait HealthCheckArgs extends StObject {
    
    /**
      * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
      */
    val childHealthThreshold: js.UndefOr[Input[Double]] = js.native
    
    /**
      * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
      */
    val childHealthchecks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the CloudWatch alarm.
      */
    val cloudwatchAlarmName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CloudWatchRegion that the CloudWatch alarm was created in.
      */
    val cloudwatchAlarmRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
      * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
      * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
      * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
      */
    val disabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
      */
    val enableSni: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of consecutive health checks that an endpoint must pass or fail.
      */
    val failureThreshold: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The fully qualified domain name of the endpoint to be checked.
      */
    val fqdn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
      */
    val insufficientDataHealthStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
      */
    val invertHealthcheck: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The IP address of the endpoint to be checked.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
      */
    val measureLatency: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The port of the endpoint to be checked.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single healthCheck set amongst others)
      */
    val referenceName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
      */
    val regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
      */
    val requestInterval: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The path that you want Amazon Route 53 to request when performing health checks.
      */
    val resourcePath: js.UndefOr[Input[String]] = js.native
    
    /**
      * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
      */
    val searchString: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the health check.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
      */
    val `type`: Input[String] = js.native
  }
  object HealthCheckArgs {
    
    @scala.inline
    def apply(`type`: Input[String]): HealthCheckArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheckArgs]
    }
    
    @scala.inline
    implicit class HealthCheckArgsMutableBuilder[Self <: HealthCheckArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildHealthThreshold(value: Input[Double]): Self = StObject.set(x, "childHealthThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildHealthThresholdUndefined: Self = StObject.set(x, "childHealthThreshold", js.undefined)
      
      @scala.inline
      def setChildHealthchecks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "childHealthchecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildHealthchecksUndefined: Self = StObject.set(x, "childHealthchecks", js.undefined)
      
      @scala.inline
      def setChildHealthchecksVarargs(value: Input[String]*): Self = StObject.set(x, "childHealthchecks", js.Array(value :_*))
      
      @scala.inline
      def setCloudwatchAlarmName(value: Input[String]): Self = StObject.set(x, "cloudwatchAlarmName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmNameUndefined: Self = StObject.set(x, "cloudwatchAlarmName", js.undefined)
      
      @scala.inline
      def setCloudwatchAlarmRegion(value: Input[String]): Self = StObject.set(x, "cloudwatchAlarmRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmRegionUndefined: Self = StObject.set(x, "cloudwatchAlarmRegion", js.undefined)
      
      @scala.inline
      def setDisabled(value: Input[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnableSni(value: Input[Boolean]): Self = StObject.set(x, "enableSni", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSniUndefined: Self = StObject.set(x, "enableSni", js.undefined)
      
      @scala.inline
      def setFailureThreshold(value: Input[Double]): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      @scala.inline
      def setFqdn(value: Input[String]): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
      
      @scala.inline
      def setInsufficientDataHealthStatus(value: Input[String]): Self = StObject.set(x, "insufficientDataHealthStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsufficientDataHealthStatusUndefined: Self = StObject.set(x, "insufficientDataHealthStatus", js.undefined)
      
      @scala.inline
      def setInvertHealthcheck(value: Input[Boolean]): Self = StObject.set(x, "invertHealthcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertHealthcheckUndefined: Self = StObject.set(x, "invertHealthcheck", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setMeasureLatency(value: Input[Boolean]): Self = StObject.set(x, "measureLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureLatencyUndefined: Self = StObject.set(x, "measureLatency", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReferenceName(value: Input[String]): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceNameUndefined: Self = StObject.set(x, "referenceName", js.undefined)
      
      @scala.inline
      def setRegions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: Input[String]*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setRequestInterval(value: Input[Double]): Self = StObject.set(x, "requestInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIntervalUndefined: Self = StObject.set(x, "requestInterval", js.undefined)
      
      @scala.inline
      def setResourcePath(value: Input[String]): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePathUndefined: Self = StObject.set(x, "resourcePath", js.undefined)
      
      @scala.inline
      def setSearchString(value: Input[String]): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HealthCheckState extends StObject {
    
    /**
      * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
      */
    val childHealthThreshold: js.UndefOr[Input[Double]] = js.native
    
    /**
      * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
      */
    val childHealthchecks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the CloudWatch alarm.
      */
    val cloudwatchAlarmName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CloudWatchRegion that the CloudWatch alarm was created in.
      */
    val cloudwatchAlarmRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
      * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
      * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
      * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
      */
    val disabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
      */
    val enableSni: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of consecutive health checks that an endpoint must pass or fail.
      */
    val failureThreshold: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The fully qualified domain name of the endpoint to be checked.
      */
    val fqdn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
      */
    val insufficientDataHealthStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
      */
    val invertHealthcheck: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The IP address of the endpoint to be checked.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
      */
    val measureLatency: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The port of the endpoint to be checked.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * This is a reference name used in Caller Reference
      * (helpful for identifying single healthCheck set amongst others)
      */
    val referenceName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
      */
    val regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
      */
    val requestInterval: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The path that you want Amazon Route 53 to request when performing health checks.
      */
    val resourcePath: js.UndefOr[Input[String]] = js.native
    
    /**
      * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
      */
    val searchString: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the health check.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object HealthCheckState {
    
    @scala.inline
    def apply(): HealthCheckState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HealthCheckState]
    }
    
    @scala.inline
    implicit class HealthCheckStateMutableBuilder[Self <: HealthCheckState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildHealthThreshold(value: Input[Double]): Self = StObject.set(x, "childHealthThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildHealthThresholdUndefined: Self = StObject.set(x, "childHealthThreshold", js.undefined)
      
      @scala.inline
      def setChildHealthchecks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "childHealthchecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildHealthchecksUndefined: Self = StObject.set(x, "childHealthchecks", js.undefined)
      
      @scala.inline
      def setChildHealthchecksVarargs(value: Input[String]*): Self = StObject.set(x, "childHealthchecks", js.Array(value :_*))
      
      @scala.inline
      def setCloudwatchAlarmName(value: Input[String]): Self = StObject.set(x, "cloudwatchAlarmName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmNameUndefined: Self = StObject.set(x, "cloudwatchAlarmName", js.undefined)
      
      @scala.inline
      def setCloudwatchAlarmRegion(value: Input[String]): Self = StObject.set(x, "cloudwatchAlarmRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmRegionUndefined: Self = StObject.set(x, "cloudwatchAlarmRegion", js.undefined)
      
      @scala.inline
      def setDisabled(value: Input[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnableSni(value: Input[Boolean]): Self = StObject.set(x, "enableSni", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSniUndefined: Self = StObject.set(x, "enableSni", js.undefined)
      
      @scala.inline
      def setFailureThreshold(value: Input[Double]): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      @scala.inline
      def setFqdn(value: Input[String]): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
      
      @scala.inline
      def setInsufficientDataHealthStatus(value: Input[String]): Self = StObject.set(x, "insufficientDataHealthStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsufficientDataHealthStatusUndefined: Self = StObject.set(x, "insufficientDataHealthStatus", js.undefined)
      
      @scala.inline
      def setInvertHealthcheck(value: Input[Boolean]): Self = StObject.set(x, "invertHealthcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertHealthcheckUndefined: Self = StObject.set(x, "invertHealthcheck", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setMeasureLatency(value: Input[Boolean]): Self = StObject.set(x, "measureLatency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureLatencyUndefined: Self = StObject.set(x, "measureLatency", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReferenceName(value: Input[String]): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceNameUndefined: Self = StObject.set(x, "referenceName", js.undefined)
      
      @scala.inline
      def setRegions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: Input[String]*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setRequestInterval(value: Input[Double]): Self = StObject.set(x, "requestInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIntervalUndefined: Self = StObject.set(x, "requestInterval", js.undefined)
      
      @scala.inline
      def setResourcePath(value: Input[String]): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePathUndefined: Self = StObject.set(x, "resourcePath", js.undefined)
      
      @scala.inline
      def setSearchString(value: Input[String]): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
