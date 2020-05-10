package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCorsRule extends js.Object {
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: js.Array[String] = js.native
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: js.Array[String] = js.native
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
}

object BucketCorsRule {
  @scala.inline
  def apply(allowedMethods: js.Array[String], allowedOrigins: js.Array[String]): BucketCorsRule = {
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
    def withAllowedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedOrigins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHeaders(value: js.Array[String]): Self = {
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
    def withExposeHeaders(value: js.Array[String]): Self = {
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
    def withMaxAgeSeconds(value: Double): Self = {
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

