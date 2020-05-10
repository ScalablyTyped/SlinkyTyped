package typingsSlinky.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayProxyResult extends js.Object {
  var body: String = js.native
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.native
  var statusCode: Double = js.native
}

object APIGatewayProxyResult {
  @scala.inline
  def apply(body: String, statusCode: Double): APIGatewayProxyResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyResult]
  }
  @scala.inline
  implicit class APIGatewayProxyResultOps[Self <: APIGatewayProxyResult] (val x: Self) extends AnyVal {
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
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[Boolean | Double | String]): Self = {
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
    def withIsBase64Encoded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBase64Encoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64Encoded")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(js.undefined)
        ret
    }
  }
  
}

