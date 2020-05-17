package typingsSlinky.k6.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.k6.anon.Max
import typingsSlinky.k6.httpMod.CipherSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Maximum parallel `http.batch()` connections per VU. */
  var batch: Double = js.native
  /** Maximum parallel `http.batch()` host connections per VU. */
  var batchPerHost: Double = js.native
  /** Blacklist IP ranges from being called. */
  var blacklistIPs: js.Array[String] = js.native
  /** Discard response bodies. */
  var discardResponseBodies: Boolean = js.native
  /** Test duration. */
  var duration: String = js.native
  /** Third party collector configuration. */
  var ext: StringDictionary[CollectorOptions] = js.native
  /** Static hostname mapping. */
  var hosts: StringDictionary[String] = js.native
  /** Log all HTTP requests and responses. */
  var httpDebug: String = js.native
  /** Disable TLS verification. Insecure. */
  var insecureSkipTLSVerify: Boolean = js.native
  /** Iterations to execute. */
  var iterations: Double = js.native
  /** Persist the k6 process after test completion. */
  var linger: Boolean = js.native
  /** Maximum HTTP redirects to follow. */
  var maxRedirects: Double = js.native
  /** Minimum test iteration duration. */
  var minIterationDuration: String = js.native
  /** Disable keepalive connections. */
  var noConnectionReuse: Boolean = js.native
  /** Disable usage reports. */
  var noUsageReport: Boolean = js.native
  /** Disable cross-VU TCP connection reuse. */
  var noVUConnectionReuse: Boolean = js.native
  /** Start test in paused state. */
  var paused: Boolean = js.native
  /** Maximum requests per second across all VUs. */
  var rps: Double = js.native
  /** Setup function timeout. */
  var setupTimeout: String = js.native
  /** Test stage specifications. Program of target VU stages. */
  var stages: js.Array[Stage] = js.native
  /** Define stats for trend metrics. */
  var summaryTrendStats: js.Array[String] = js.native
  /** Which system tags to include in collected metrics. */
  var systemTags: js.Array[String] = js.native
  /** Tags to set test wide across all metrics. */
  var tags: StringDictionary[String] = js.native
  /** Teardown function timeout. */
  var teardownTimeout: String = js.native
  /** Threshold specifications. Defines pass and fail conditions. */
  var thresholds: StringDictionary[js.Array[Threshold]] = js.native
  /** Throw error on failed HTTP request. */
  var `throw`: Boolean = js.native
  /** TLS client certificates. */
  var tlsAuth: js.Array[Certificate] = js.native
  /** Allowed TLS cipher suites. */
  var tlsCipherSuites: js.Array[CipherSuite] = js.native
  /** Allowed TLS version. Use `http.SSL_*` `http.TLS_*` constants. */
  var tlsVersion: String | Max = js.native
  /** User agent string to include in HTTP requests. */
  var userAgent: String = js.native
  /** Number of VUs to run concurrently. */
  var vus: Double = js.native
  /** Maximum VUs. Preallocates VUs to enable faster scaling. */
  var vusMax: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    batch: Double,
    batchPerHost: Double,
    blacklistIPs: js.Array[String],
    discardResponseBodies: Boolean,
    duration: String,
    ext: StringDictionary[CollectorOptions],
    hosts: StringDictionary[String],
    httpDebug: String,
    insecureSkipTLSVerify: Boolean,
    iterations: Double,
    linger: Boolean,
    maxRedirects: Double,
    minIterationDuration: String,
    noConnectionReuse: Boolean,
    noUsageReport: Boolean,
    noVUConnectionReuse: Boolean,
    paused: Boolean,
    rps: Double,
    setupTimeout: String,
    stages: js.Array[Stage],
    summaryTrendStats: js.Array[String],
    systemTags: js.Array[String],
    tags: StringDictionary[String],
    teardownTimeout: String,
    thresholds: StringDictionary[js.Array[Threshold]],
    `throw`: Boolean,
    tlsAuth: js.Array[Certificate],
    tlsCipherSuites: js.Array[CipherSuite],
    tlsVersion: String | Max,
    userAgent: String,
    vus: Double,
    vusMax: Double
  ): Options = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], batchPerHost = batchPerHost.asInstanceOf[js.Any], blacklistIPs = blacklistIPs.asInstanceOf[js.Any], discardResponseBodies = discardResponseBodies.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], httpDebug = httpDebug.asInstanceOf[js.Any], insecureSkipTLSVerify = insecureSkipTLSVerify.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], maxRedirects = maxRedirects.asInstanceOf[js.Any], minIterationDuration = minIterationDuration.asInstanceOf[js.Any], noConnectionReuse = noConnectionReuse.asInstanceOf[js.Any], noUsageReport = noUsageReport.asInstanceOf[js.Any], noVUConnectionReuse = noVUConnectionReuse.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rps = rps.asInstanceOf[js.Any], setupTimeout = setupTimeout.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any], summaryTrendStats = summaryTrendStats.asInstanceOf[js.Any], systemTags = systemTags.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], teardownTimeout = teardownTimeout.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tlsAuth = tlsAuth.asInstanceOf[js.Any], tlsCipherSuites = tlsCipherSuites.asInstanceOf[js.Any], tlsVersion = tlsVersion.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vus = vus.asInstanceOf[js.Any], vusMax = vusMax.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchPerHost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklistIPs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistIPs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscardResponseBodies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardResponseBodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: StringDictionary[CollectorOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHosts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpDebug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsecureSkipTLSVerify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureSkipTLSVerify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinIterationDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIterationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoConnectionReuse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConnectionReuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoUsageReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUsageReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoVUConnectionReuse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noVUConnectionReuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStages(value: js.Array[Stage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryTrendStats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryTrendStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeardownTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardownTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholds(value: StringDictionary[js.Array[Threshold]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlsAuth(value: js.Array[Certificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlsCipherSuites(value: js.Array[CipherSuite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsCipherSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlsVersion(value: String | Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVusMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vusMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

