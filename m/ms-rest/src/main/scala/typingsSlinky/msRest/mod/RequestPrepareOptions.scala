package typingsSlinky.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPrepareOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var bodyIsStream: js.UndefOr[Boolean] = js.native
  var deserializationMapper: Mapper = js.native
  var disableClientRequestId: js.UndefOr[Boolean] = js.native
  var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.native
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.native
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var method: String = js.native
  var pathParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.native
  var queryParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.native
  var serializationMapper: Mapper = js.native
}

object RequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper): RequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPrepareOptions]
  }
  @scala.inline
  implicit class RequestPrepareOptionsOps[Self <: RequestPrepareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserializationMapper(value: Mapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializationMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializationMapper(value: Mapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyIsStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyIsStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyIsStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyIsStream")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableClientRequestId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClientRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableClientRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClientRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableJsonStringifyOnBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableJsonStringifyOnBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableJsonStringifyOnBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableJsonStringifyOnBody")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[js.Any]): Self = {
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
    def withPathParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(js.undefined)
        ret
    }
  }
  
}

