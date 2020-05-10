package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineTaskTarget extends js.Object {
  /** Deprecated. Use AppEngineHttpRequest.app_engine_routing. */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.native
  /** Deprecated. Use AppEngineHttpRequest.headers. */
  var headers: js.UndefOr[Record[String, String]] = js.native
  /** Deprecated. Use AppEngineHttpRequest.http_method. */
  var httpMethod: js.UndefOr[String] = js.native
  /** Deprecated. Use AppEngineHttpRequest.payload. */
  var payload: js.UndefOr[String] = js.native
  /** Deprecated. Use AppEngineHttpRequest.relative_url. */
  var relativeUrl: js.UndefOr[String] = js.native
}

object AppEngineTaskTarget {
  @scala.inline
  def apply(): AppEngineTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineTaskTarget]
  }
  @scala.inline
  implicit class AppEngineTaskTargetOps[Self <: AppEngineTaskTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineRouting(value: AppEngineRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRouting")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUrl")(js.undefined)
        ret
    }
  }
  
}

