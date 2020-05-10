package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCorsRule extends js.Object {
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: Input[js.Array[Input[String]]] = js.native
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: Input[js.Array[Input[String]]] = js.native
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Input[Double]] = js.native
}

object BucketCorsRule {
  @scala.inline
  def apply(allowedMethods: Input[js.Array[Input[String]]], allowedOrigins: Input[js.Array[Input[String]]]): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
  @scala.inline
  implicit class BucketCorsRuleOps[Self <: BucketCorsRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedMethods(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeHeaders(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
  }
  
}

