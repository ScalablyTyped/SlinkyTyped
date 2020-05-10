package typingsSlinky.awsSdkTypes.responseMod

import typingsSlinky.awsSdkTypes.httpMod.HeaderBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseMetadata extends js.Object {
  /**
    * A tertiary identifier for the last request sent. Used for debugging.
    */
  var cfId: js.UndefOr[String] = js.native
  /**
    * A secondary identifier for the last request sent. Used for debugging.
    */
  var extendedRequestId: js.UndefOr[String] = js.native
  /**
    * The headers of the last HTTP response received for this operation.
    */
  var httpHeaders: js.UndefOr[HeaderBag] = js.native
  /**
    * The status code of the last HTTP response received for this operation.
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  /**
    * A unique identifier for the last request sent for this operation. Often
    * requested by AWS service teams to aid in debugging.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The number of times this operation was retried.
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * The total amount of time (in milliseconds) that was spent waiting between
    * retry attempts.
    */
  var totalRetryDelay: js.UndefOr[Double] = js.native
}

object ResponseMetadata {
  @scala.inline
  def apply(): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetadata]
  }
  @scala.inline
  implicit class ResponseMetadataOps[Self <: ResponseMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCfId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCfId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfId")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: HeaderBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRetryDelay")(js.undefined)
        ret
    }
  }
  
}

