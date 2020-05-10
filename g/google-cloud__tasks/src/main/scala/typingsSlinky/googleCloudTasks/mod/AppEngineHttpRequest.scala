package typingsSlinky.googleCloudTasks.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineHttpRequest extends js.Object {
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.native
  var body: String = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var httpMethod: String = js.native
  var relativeUri: String = js.native
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(body: String, httpMethod: String, relativeUri: String): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
  @scala.inline
  implicit class AppEngineHttpRequestOps[Self <: AppEngineHttpRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUri")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withHeaders(value: StringDictionary[String]): Self = {
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
  }
  
}

