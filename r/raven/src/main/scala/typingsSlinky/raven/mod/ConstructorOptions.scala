package typingsSlinky.raven.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.raven.mod.transports.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  var autoBreadcrumbs: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.native
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  var dataCallback: js.UndefOr[DataCallback] = js.native
  var environment: js.UndefOr[String] = js.native
  var extra: js.UndefOr[StringDictionary[js.Any]] = js.native
  var logger: js.UndefOr[String] = js.native
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  var maxReqQueueCount: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var parseUser: js.UndefOr[Boolean | js.Array[String] | parseUserCallback] = js.native
  var release: js.UndefOr[String] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
  var sendTimeout: js.UndefOr[Double] = js.native
  var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.native
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  var transport: js.UndefOr[Transport] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBreadcrumbs(value: Boolean | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureUnhandledRejections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureUnhandledRejections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureUnhandledRejections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureUnhandledRejections")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCallback(value: /* data */ StringDictionary[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBreadcrumbs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReqQueueCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReqQueueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReqQueueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReqQueueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParseUserFunction1(value: /* req */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseUser(value: Boolean | js.Array[String] | parseUserCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSendTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSendCallback(value: /* data */ StringDictionary[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSendCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldSendCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSendCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[String]): Self = {
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
    def withTransport(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

