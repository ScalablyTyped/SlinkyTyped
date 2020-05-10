package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReimportApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * Specifies how to interpret the base path of the API during import. Valid values are ignore, prepend, and split. The default value is ignore. To learn more, see Set the OpenAPI basePath Property. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.native
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string = js.native
  /**
    * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.native
}

object ReimportApiRequest {
  @scala.inline
  def apply(ApiId: string, Body: string): ReimportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReimportApiRequest]
  }
  @scala.inline
  implicit class ReimportApiRequestOps[Self <: ReimportApiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasepath(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Basepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Basepath")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnWarnings(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailOnWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailOnWarnings")(js.undefined)
        ret
    }
  }
  
}

