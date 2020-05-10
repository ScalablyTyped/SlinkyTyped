package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDocumentationPartsRequest extends js.Object {
  /**
    * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file, this is a JSON object.
    */
  var body: _Blob = js.native
  /**
    * A query parameter to specify whether to rollback the documentation importation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A query parameter to indicate whether to overwrite (OVERWRITE) any existing DocumentationParts definition or to merge (MERGE) the new definition into the existing one. The default value is MERGE.
    */
  var mode: js.UndefOr[PutMode] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object ImportDocumentationPartsRequest {
  @scala.inline
  def apply(body: _Blob, restApiId: String): ImportDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDocumentationPartsRequest]
  }
  @scala.inline
  implicit class ImportDocumentationPartsRequestOps[Self <: ImportDocumentationPartsRequest] (val x: Self) extends AnyVal {
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
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withMode(value: PutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

