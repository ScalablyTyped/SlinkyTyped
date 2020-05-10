package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionCustomErrorResponse extends js.Object {
  /**
    * The minimum amount of time you want
    * HTTP error codes to stay in CloudFront caches before CloudFront queries your
    * origin to see whether the object has been updated.
    */
  var errorCachingMinTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * The 4xx or 5xx HTTP status code that you want to
    * customize.
    */
  var errorCode: Input[Double] = js.native
  /**
    * The HTTP status code that you want CloudFront
    * to return with the custom error page to the viewer.
    */
  var responseCode: js.UndefOr[Input[Double]] = js.native
  /**
    * The path of the custom error page (for
    * example, `/custom_404.html`).
    */
  var responsePagePath: js.UndefOr[Input[String]] = js.native
}

object DistributionCustomErrorResponse {
  @scala.inline
  def apply(errorCode: Input[Double]): DistributionCustomErrorResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionCustomErrorResponse]
  }
  @scala.inline
  implicit class DistributionCustomErrorResponseOps[Self <: DistributionCustomErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCachingMinTtl(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCachingMinTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCachingMinTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCachingMinTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsePagePath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsePagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePagePath")(js.undefined)
        ret
    }
  }
  
}

