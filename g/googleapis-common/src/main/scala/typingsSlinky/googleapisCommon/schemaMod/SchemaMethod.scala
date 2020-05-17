package typingsSlinky.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapisCommon.anon.Protocols
import typingsSlinky.googleapisCommon.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMethod extends js.Object {
  var description: String = js.native
  var fragment: String = js.native
  var httpMethod: HttpMethod = js.native
  var id: String = js.native
  var mediaUpload: Protocols = js.native
  var parameterOrder: js.UndefOr[js.Array[String]] = js.native
  var parameters: js.UndefOr[StringDictionary[SchemaParameter]] = js.native
  var path: String = js.native
  var request: Ref = js.native
  var response: Ref = js.native
  var sampleUrl: String = js.native
  var scopes: js.Array[String] = js.native
}

object SchemaMethod {
  @scala.inline
  def apply(
    description: String,
    fragment: String,
    httpMethod: HttpMethod,
    id: String,
    mediaUpload: Protocols,
    path: String,
    request: Ref,
    response: Ref,
    sampleUrl: String,
    scopes: js.Array[String]
  ): SchemaMethod = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mediaUpload = mediaUpload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sampleUrl = sampleUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMethod]
  }
  @scala.inline
  implicit class SchemaMethodOps[Self <: SchemaMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaUpload(value: Protocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

