package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportApiKeysRequest extends js.Object {
  /**
    * The payload of the POST request to import API keys. For the payload format, see API Key File Format.
    */
  var body: _Blob = js.native
  /**
    * A query parameter to indicate whether to rollback ApiKey importation (true) or not (false) when error is encountered.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A query parameter to specify the input format to imported API keys. Currently, only the csv format is supported.
    */
  var format: ApiKeysFormat = js.native
}

object ImportApiKeysRequest {
  @scala.inline
  def apply(body: _Blob, format: ApiKeysFormat): ImportApiKeysRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApiKeysRequest]
  }
  @scala.inline
  implicit class ImportApiKeysRequestOps[Self <: ImportApiKeysRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ApiKeysFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailOnWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWarnings")(js.undefined)
        ret
    }
  }
  
}

