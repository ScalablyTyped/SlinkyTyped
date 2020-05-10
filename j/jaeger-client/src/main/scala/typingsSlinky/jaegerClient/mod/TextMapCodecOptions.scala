package typingsSlinky.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMapCodecOptions extends js.Object {
  var baggagePrefix: js.UndefOr[String] = js.native
  var contextKey: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[MetricsFactory] = js.native
  var urlEncoding: js.UndefOr[Boolean] = js.native
}

object TextMapCodecOptions {
  @scala.inline
  def apply(): TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMapCodecOptions]
  }
  @scala.inline
  implicit class TextMapCodecOptionsOps[Self <: TextMapCodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaggagePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baggagePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaggagePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baggagePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withContextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MetricsFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEncoding")(js.undefined)
        ret
    }
  }
  
}

