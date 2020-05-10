package typingsSlinky.awsLambda.albMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALBResult extends js.Object {
  var body: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
  var isBase64Encoded: Boolean = js.native
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.native
  var statusCode: Double = js.native
  var statusDescription: String = js.native
}

object ALBResult {
  @scala.inline
  def apply(isBase64Encoded: Boolean, statusCode: Double, statusDescription: String): ALBResult = {
    val __obj = js.Dynamic.literal(isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBResult]
  }
  @scala.inline
  implicit class ALBResultOps[Self <: ALBResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBase64Encoded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
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

