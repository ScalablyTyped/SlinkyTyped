package typingsSlinky.fineUploader.s3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SignatureOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request.
    *
    * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any | S3CustomHeaderFunction] = js.native
  /**
    * The endpoint that Fine Uploader can use to send policy documents (HTML form uploads) or other strings to sign (REST requests) before sending requests off to S3
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The AWS/S3 signature version to use. Currently supported values are `2` and `4`. Directly related to `objectProperties.region`
    *
    * @default `2`
    */
  var version: js.UndefOr[Double] = js.native
}

object S3SignatureOptions {
  @scala.inline
  def apply(): S3SignatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SignatureOptions]
  }
  @scala.inline
  implicit class S3SignatureOptionsOps[Self <: S3SignatureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeadersFunction1(value: /* id */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomHeaders(value: js.Any | S3CustomHeaderFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

