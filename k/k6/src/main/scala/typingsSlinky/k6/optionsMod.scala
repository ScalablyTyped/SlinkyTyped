package typingsSlinky.k6

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.k6.anon.Max
import typingsSlinky.k6.httpMod.CipherSuite
import typingsSlinky.k6.k6Strings.`constant-arrival-rate`
import typingsSlinky.k6.k6Strings.`constant-vus`
import typingsSlinky.k6.k6Strings.`externally-controlled`
import typingsSlinky.k6.k6Strings.`per-vu-iterations`
import typingsSlinky.k6.k6Strings.`ramping-arrival-rate`
import typingsSlinky.k6.k6Strings.`ramping-vus`
import typingsSlinky.k6.k6Strings.`shared-iterations`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("k6/options", "BaseScenario")
  @js.native
  abstract class BaseScenario () extends StObject {
    
    /** Environment variables specific to this scenario.  */
    var env: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Name of exported JS function to execute.
      *
      * The default value is "default".
      */
    var exec: js.UndefOr[String] = js.native
    
    /**
      * Executor type.  Options available:
      * - `shared-iterations`
      * - `per-vu-iterations`
      * - `constant-vus`
      * - `ramping-vus`
      * - `constant-arrival-rate`
      * - `ramping-arrival-rate`
      * - `externally-controlled`
      */
    var executor: ExecutorOptions = js.native
    
    /**
      * Time to wait for iterations to finish executing before stopping them forcefully.
      * See https://k6.io/docs/using-k6/scenarios#graceful-stop-and-ramp-down
      *
      * Default value is 30s
      */
    var gracefulStop: js.UndefOr[String] = js.native
    
    /**
      * Time offset since the start of the test, at which point this scenario should begin execution.
      *
      * Default value is 0s.
      */
    var startTime: js.UndefOr[String] = js.native
    
    /** Tags specific to this scenario. */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  
  @js.native
  trait Certificate extends StObject {
    
    /** PEM encoded certificate. */
    var cert: String = js.native
    
    /** Domains certificate is valid for. */
    var domains: js.Array[String] = js.native
    
    /** PEM encoded certificate key. */
    var key: String = js.native
  }
  object Certificate {
    
    @scala.inline
    def apply(cert: String, domains: js.Array[String], key: String): Certificate = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Certificate]
    }
    
    @scala.inline
    implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type CollectorOptions = StringDictionary[js.Any]
  
  @js.native
  trait ConstantArrivalRateScenario
    extends BaseScenario
       with Scenario {
    
    /** Total scenario duration (excluding `gracefulStop`) */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ConstantArrivalRateScenario: `constant-arrival-rate` = js.native
    
    /**
      * Maximum number of VUs to allow during the test run.
      *
      * The default value is the value of the `preAllocatedVUs` option.
      */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
    var preAllocatedVUs: Double = js.native
    
    /** Number of iterations to execute each `timeUnit` period. */
    var rate: Double = js.native
    
    /**
      * Period of time to apply the `rate` value.
      *
      * The default value is 1s.
      */
    var timeUnit: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ConstantVUsScenario
    extends BaseScenario
       with Scenario {
    
    /**
      * Total scenario duration (excluding `gracefulStop`)
      */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ConstantVUsScenario: `constant-vus` = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.k6.k6Strings.`shared-iterations`
    - typingsSlinky.k6.k6Strings.`per-vu-iterations`
    - typingsSlinky.k6.k6Strings.`constant-vus`
    - typingsSlinky.k6.k6Strings.`ramping-vus`
    - typingsSlinky.k6.k6Strings.`constant-arrival-rate`
    - typingsSlinky.k6.k6Strings.`ramping-arrival-rate`
    - typingsSlinky.k6.k6Strings.`externally-controlled`
  */
  trait ExecutorOptions extends StObject
  object ExecutorOptions {
    
    @scala.inline
    def `constant-arrival-rate`: typingsSlinky.k6.k6Strings.`constant-arrival-rate` = "constant-arrival-rate".asInstanceOf[typingsSlinky.k6.k6Strings.`constant-arrival-rate`]
    
    @scala.inline
    def `constant-vus`: typingsSlinky.k6.k6Strings.`constant-vus` = "constant-vus".asInstanceOf[typingsSlinky.k6.k6Strings.`constant-vus`]
    
    @scala.inline
    def `externally-controlled`: typingsSlinky.k6.k6Strings.`externally-controlled` = "externally-controlled".asInstanceOf[typingsSlinky.k6.k6Strings.`externally-controlled`]
    
    @scala.inline
    def `per-vu-iterations`: typingsSlinky.k6.k6Strings.`per-vu-iterations` = "per-vu-iterations".asInstanceOf[typingsSlinky.k6.k6Strings.`per-vu-iterations`]
    
    @scala.inline
    def `ramping-arrival-rate`: typingsSlinky.k6.k6Strings.`ramping-arrival-rate` = "ramping-arrival-rate".asInstanceOf[typingsSlinky.k6.k6Strings.`ramping-arrival-rate`]
    
    @scala.inline
    def `ramping-vus`: typingsSlinky.k6.k6Strings.`ramping-vus` = "ramping-vus".asInstanceOf[typingsSlinky.k6.k6Strings.`ramping-vus`]
    
    @scala.inline
    def `shared-iterations`: typingsSlinky.k6.k6Strings.`shared-iterations` = "shared-iterations".asInstanceOf[typingsSlinky.k6.k6Strings.`shared-iterations`]
  }
  
  @js.native
  trait ExternallyControlledScenario
    extends BaseScenario
       with Scenario {
    
    /** Total scenario duration (excluding `gracefulStop`) */
    var duration: String = js.native
    
    @JSName("executor")
    var executor_ExternallyControlledScenario: `externally-controlled` = js.native
    
    /** Maximum number of VUs to allow during the test run. */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait ObjectThreshold extends StObject {
    
    /** Abort test if threshold violated. */
    var abortOnFail: js.UndefOr[Boolean] = js.native
    
    /** Duration to delay evaluation. Enables collecting additional metrics. */
    var delayAbortEval: js.UndefOr[String] = js.native
    
    /** Threshold expression. */
    var threshold: String = js.native
  }
  object ObjectThreshold {
    
    @scala.inline
    def apply(threshold: String): ObjectThreshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectThreshold]
    }
    
    @scala.inline
    implicit class ObjectThresholdMutableBuilder[Self <: ObjectThreshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortOnFail(value: Boolean): Self = StObject.set(x, "abortOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortOnFailUndefined: Self = StObject.set(x, "abortOnFail", js.undefined)
      
      @scala.inline
      def setDelayAbortEval(value: String): Self = StObject.set(x, "delayAbortEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayAbortEvalUndefined: Self = StObject.set(x, "delayAbortEval", js.undefined)
      
      @scala.inline
      def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Maximum parallel `http.batch()` connections per VU. */
    var batch: js.UndefOr[Double] = js.native
    
    /** Maximum parallel `http.batch()` host connections per VU. */
    var batchPerHost: js.UndefOr[Double] = js.native
    
    /** Blacklist IP ranges from being called. */
    var blacklistIPs: js.UndefOr[js.Array[String]] = js.native
    
    /** Discard response bodies. */
    var discardResponseBodies: js.UndefOr[Boolean] = js.native
    
    /** Test duration. */
    var duration: js.UndefOr[String] = js.native
    
    /** Partition the test run in different segments. https://k6.io/docs/using-k6/options#execution-segment */
    var executionSegment: js.UndefOr[String] = js.native
    
    /** Define the sequence segment to run. https://k6.io/docs/using-k6/options#execution-segment */
    var executionSegmentSequence: js.UndefOr[String] = js.native
    
    /** Third party collector configuration. */
    var ext: js.UndefOr[StringDictionary[CollectorOptions]] = js.native
    
    /** Static hostname mapping. */
    var hosts: js.UndefOr[StringDictionary[String]] = js.native
    
    /** Log all HTTP requests and responses. */
    var httpDebug: js.UndefOr[String] = js.native
    
    /** Disable TLS verification. Insecure. */
    var insecureSkipTLSVerify: js.UndefOr[Boolean] = js.native
    
    /** Iterations to execute. */
    var iterations: js.UndefOr[Double] = js.native
    
    /** Persist the k6 process after test completion. */
    var linger: js.UndefOr[Boolean] = js.native
    
    /** Maximum HTTP redirects to follow. */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    /** Minimum test iteration duration. */
    var minIterationDuration: js.UndefOr[String] = js.native
    
    /** Disable keepalive connections. */
    var noConnectionReuse: js.UndefOr[Boolean] = js.native
    
    /** This disables the default behavior of resetting the cookie jar after each VU iteration. If it's enabled, saved cookies will be persisted across VU iterations.. */
    var noCookiesReset: js.UndefOr[Boolean] = js.native
    
    /** Disable usage reports. */
    var noUsageReport: js.UndefOr[Boolean] = js.native
    
    /** Disable cross-VU TCP connection reuse. */
    var noVUConnectionReuse: js.UndefOr[Boolean] = js.native
    
    /** Start test in paused state. */
    var paused: js.UndefOr[Boolean] = js.native
    
    /** Maximum requests per second across all VUs. */
    var rps: js.UndefOr[Double] = js.native
    
    /** Scenario specifications. */
    var scenarios: js.UndefOr[StringDictionary[Scenario]] = js.native
    
    /** Setup function timeout. */
    var setupTimeout: js.UndefOr[String] = js.native
    
    /** Test stage specifications. Program of target VU stages. */
    var stages: js.UndefOr[js.Array[Stage]] = js.native
    
    /** Define stats for trend metrics. */
    var summaryTrendStats: js.UndefOr[js.Array[String]] = js.native
    
    /** Which system tags to include in collected metrics. */
    var systemTags: js.UndefOr[js.Array[String]] = js.native
    
    /** Tags to set test wide across all metrics. */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /** Teardown function timeout. */
    var teardownTimeout: js.UndefOr[String] = js.native
    
    /** Threshold specifications. Defines pass and fail conditions. */
    var thresholds: js.UndefOr[StringDictionary[js.Array[Threshold]]] = js.native
    
    /** Throw error on failed HTTP request. */
    var `throw`: js.UndefOr[Boolean] = js.native
    
    /** TLS client certificates. */
    var tlsAuth: js.UndefOr[js.Array[Certificate]] = js.native
    
    /** Allowed TLS cipher suites. */
    var tlsCipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.native
    
    /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
    var tlsVersion: js.UndefOr[String | Max] = js.native
    
    /** User agent string to include in HTTP requests. */
    var userAgent: js.UndefOr[String] = js.native
    
    /** Number of VUs to run concurrently. */
    var vus: js.UndefOr[Double] = js.native
    
    /** Maximum VUs. Preallocates VUs to enable faster scaling. */
    var vusMax: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch(value: Double): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchPerHost(value: Double): Self = StObject.set(x, "batchPerHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchPerHostUndefined: Self = StObject.set(x, "batchPerHost", js.undefined)
      
      @scala.inline
      def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      @scala.inline
      def setBlacklistIPs(value: js.Array[String]): Self = StObject.set(x, "blacklistIPs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistIPsUndefined: Self = StObject.set(x, "blacklistIPs", js.undefined)
      
      @scala.inline
      def setBlacklistIPsVarargs(value: String*): Self = StObject.set(x, "blacklistIPs", js.Array(value :_*))
      
      @scala.inline
      def setDiscardResponseBodies(value: Boolean): Self = StObject.set(x, "discardResponseBodies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscardResponseBodiesUndefined: Self = StObject.set(x, "discardResponseBodies", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setExecutionSegment(value: String): Self = StObject.set(x, "executionSegment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionSegmentSequence(value: String): Self = StObject.set(x, "executionSegmentSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionSegmentSequenceUndefined: Self = StObject.set(x, "executionSegmentSequence", js.undefined)
      
      @scala.inline
      def setExecutionSegmentUndefined: Self = StObject.set(x, "executionSegment", js.undefined)
      
      @scala.inline
      def setExt(value: StringDictionary[CollectorOptions]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setHosts(value: StringDictionary[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHttpDebug(value: String): Self = StObject.set(x, "httpDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpDebugUndefined: Self = StObject.set(x, "httpDebug", js.undefined)
      
      @scala.inline
      def setInsecureSkipTLSVerify(value: Boolean): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureSkipTLSVerifyUndefined: Self = StObject.set(x, "insecureSkipTLSVerify", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setLinger(value: Boolean): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMinIterationDuration(value: String): Self = StObject.set(x, "minIterationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIterationDurationUndefined: Self = StObject.set(x, "minIterationDuration", js.undefined)
      
      @scala.inline
      def setNoConnectionReuse(value: Boolean): Self = StObject.set(x, "noConnectionReuse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoConnectionReuseUndefined: Self = StObject.set(x, "noConnectionReuse", js.undefined)
      
      @scala.inline
      def setNoCookiesReset(value: Boolean): Self = StObject.set(x, "noCookiesReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCookiesResetUndefined: Self = StObject.set(x, "noCookiesReset", js.undefined)
      
      @scala.inline
      def setNoUsageReport(value: Boolean): Self = StObject.set(x, "noUsageReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUsageReportUndefined: Self = StObject.set(x, "noUsageReport", js.undefined)
      
      @scala.inline
      def setNoVUConnectionReuse(value: Boolean): Self = StObject.set(x, "noVUConnectionReuse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoVUConnectionReuseUndefined: Self = StObject.set(x, "noVUConnectionReuse", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setRps(value: Double): Self = StObject.set(x, "rps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpsUndefined: Self = StObject.set(x, "rps", js.undefined)
      
      @scala.inline
      def setScenarios(value: StringDictionary[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
      
      @scala.inline
      def setSetupTimeout(value: String): Self = StObject.set(x, "setupTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupTimeoutUndefined: Self = StObject.set(x, "setupTimeout", js.undefined)
      
      @scala.inline
      def setStages(value: js.Array[Stage]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
      
      @scala.inline
      def setStagesVarargs(value: Stage*): Self = StObject.set(x, "stages", js.Array(value :_*))
      
      @scala.inline
      def setSummaryTrendStats(value: js.Array[String]): Self = StObject.set(x, "summaryTrendStats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryTrendStatsUndefined: Self = StObject.set(x, "summaryTrendStats", js.undefined)
      
      @scala.inline
      def setSummaryTrendStatsVarargs(value: String*): Self = StObject.set(x, "summaryTrendStats", js.Array(value :_*))
      
      @scala.inline
      def setSystemTags(value: js.Array[String]): Self = StObject.set(x, "systemTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemTagsUndefined: Self = StObject.set(x, "systemTags", js.undefined)
      
      @scala.inline
      def setSystemTagsVarargs(value: String*): Self = StObject.set(x, "systemTags", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTeardownTimeout(value: String): Self = StObject.set(x, "teardownTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeardownTimeoutUndefined: Self = StObject.set(x, "teardownTimeout", js.undefined)
      
      @scala.inline
      def setThresholds(value: StringDictionary[js.Array[Threshold]]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
      
      @scala.inline
      def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
      
      @scala.inline
      def setTlsAuth(value: js.Array[Certificate]): Self = StObject.set(x, "tlsAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsAuthUndefined: Self = StObject.set(x, "tlsAuth", js.undefined)
      
      @scala.inline
      def setTlsAuthVarargs(value: Certificate*): Self = StObject.set(x, "tlsAuth", js.Array(value :_*))
      
      @scala.inline
      def setTlsCipherSuites(value: js.Array[CipherSuite]): Self = StObject.set(x, "tlsCipherSuites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsCipherSuitesUndefined: Self = StObject.set(x, "tlsCipherSuites", js.undefined)
      
      @scala.inline
      def setTlsCipherSuitesVarargs(value: CipherSuite*): Self = StObject.set(x, "tlsCipherSuites", js.Array(value :_*))
      
      @scala.inline
      def setTlsVersion(value: String | Max): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setVus(value: Double): Self = StObject.set(x, "vus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVusMax(value: Double): Self = StObject.set(x, "vusMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVusMaxUndefined: Self = StObject.set(x, "vusMax", js.undefined)
      
      @scala.inline
      def setVusUndefined: Self = StObject.set(x, "vus", js.undefined)
    }
  }
  
  @js.native
  trait PerVUIterationsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_PerVUIterationsScenario: `per-vu-iterations` = js.native
    
    /**
      * Number of iterations to execute across per VU.
      *
      * The default value is 1.
      */
    var iterations: js.UndefOr[Double] = js.native
    
    /**
      * Maximum scenario duration before it's forcibly stopped (excluding gracefulStop).
      *
      * The default value is 10m.
      */
    var maxDuration: js.UndefOr[String] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait RampingArrivalRateScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_RampingArrivalRateScenario: `ramping-arrival-rate` = js.native
    
    /** Maximum number of VUs to allow during the test run. */
    var maxVUs: js.UndefOr[Double] = js.native
    
    /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
    var preAllocatedVUs: Double = js.native
    
    /** Array of objects that specify the number of iterations to ramp up or down to. */
    var stages: js.Array[Stage] = js.native
    
    /** Number of iterations to execute each `timeUnit` period at test start. */
    var startRate: js.UndefOr[Double] = js.native
    
    /**
      * Period of time to apply the `startRate` the `stages` target value..
      *
      * The default value is 1s.
      */
    var timeUnit: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait RampingVUsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_RampingVUsScenario: `ramping-vus` = js.native
    
    /**
      * Time to wait for an already started iteration to finish before stopping it during a ramp down.
      *
      * The default value is 30s.
      */
    var gracefulRampDown: js.UndefOr[String] = js.native
    
    /** Array of objects that specify the number of VUs to ramp up or down to. */
    var stages: js.Array[Stage] = js.native
    
    /**
      * Number of VUs to run at test start.
      *
      * The default value is 1.
      */
    var startVUs: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.k6.optionsMod.SharedIterationsScenario
    - typingsSlinky.k6.optionsMod.PerVUIterationsScenario
    - typingsSlinky.k6.optionsMod.ConstantVUsScenario
    - typingsSlinky.k6.optionsMod.RampingVUsScenario
    - typingsSlinky.k6.optionsMod.ConstantArrivalRateScenario
    - typingsSlinky.k6.optionsMod.RampingArrivalRateScenario
    - typingsSlinky.k6.optionsMod.ExternallyControlledScenario
  */
  trait Scenario extends StObject
  
  @js.native
  trait SharedIterationsScenario
    extends BaseScenario
       with Scenario {
    
    @JSName("executor")
    var executor_SharedIterationsScenario: `shared-iterations` = js.native
    
    /**
      * Number of iterations to execute across all VUs.
      *
      * The default value is 1.
      */
    var iterations: js.UndefOr[Double] = js.native
    
    /**
      * Maximum scenario duration before it's forcibly stopped (excluding gracefulStop).
      *
      * The default value is 10m.
      */
    var maxDuration: js.UndefOr[String] = js.native
    
    /**
      * Number of VUs to run concurrently.
      *
      * The default value is 1.
      */
    var vus: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait Stage extends StObject {
    
    /** Stage duration. */
    var duration: String = js.native
    
    /** Target number of VUs. */
    var target: Double = js.native
  }
  object Stage {
    
    @scala.inline
    def apply(duration: String, target: Double): Stage = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stage]
    }
    
    @scala.inline
    implicit class StageMutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type Threshold = String | ObjectThreshold
}
