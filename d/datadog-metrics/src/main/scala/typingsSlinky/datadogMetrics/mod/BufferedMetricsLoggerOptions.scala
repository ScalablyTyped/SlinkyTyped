package typingsSlinky.datadogMetrics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferedMetricsLoggerOptions extends js.Object {
  /**
    * Sets the DataDog API key.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Sets the DataDog APP key.
    */
  var appKey: js.UndefOr[String] = js.native
  /**
    * Default tags used for all metric reporting.
    */
  var defaultTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * How often to send metrics to DataDog.
    */
  var flushIntervalSeconds: js.UndefOr[Double] = js.native
  /**
    * Sets the hostname reported with each metric.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Sets a default prefix for all metrics.
    */
  var prefix: js.UndefOr[String] = js.native
}

object BufferedMetricsLoggerOptions {
  @scala.inline
  def apply(): BufferedMetricsLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferedMetricsLoggerOptions]
  }
  @scala.inline
  implicit class BufferedMetricsLoggerOptionsOps[Self <: BufferedMetricsLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAppKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushIntervalSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

