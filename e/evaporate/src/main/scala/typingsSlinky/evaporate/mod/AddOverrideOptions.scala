package typingsSlinky.evaporate.mod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<evaporate.evaporate.CreateConfig, evaporate.evaporate.AddOverrideOptionKeys> */
@js.native
trait AddOverrideOptions extends js.Object {
  var abortCompletionThrottlingMs: js.UndefOr[Double] = js.native
  var aws_key: js.UndefOr[String] = js.native
  var aws_url: js.UndefOr[String] = js.native
  var bucket: String = js.native
  var customAuthMethod: js.UndefOr[
    js.Function5[
      /* signParams */ String, 
      /* signHeaders */ String, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      /* canonicalRequest */ String, 
      js.Promise[String]
    ]
  ] = js.native
  var localTimeOffset: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var maxRetryBackoffSecs: js.UndefOr[Double] = js.native
  var mockLocalStorage: js.UndefOr[Boolean] = js.native
  var partSize: js.UndefOr[Double] = js.native
  var progressIntervalMS: js.UndefOr[Double] = js.native
  var readableStreamPartMethod: js.UndefOr[
    js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]]
  ] = js.native
  var readableStreams: js.UndefOr[Boolean] = js.native
  var retryBackoffPower: js.UndefOr[Double] = js.native
  var s3Acceleration: js.UndefOr[Boolean] = js.native
  var s3FileCacheHoursAgo: js.UndefOr[Double] = js.native
  var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.native
  var signHeaders: js.UndefOr[js.Object] = js.native
  var signParams: js.UndefOr[js.Object] = js.native
  var signResponseHandler: js.UndefOr[
    js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      js.Promise[String]
    ]
  ] = js.native
  var signerUrl: js.UndefOr[String] = js.native
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}

object AddOverrideOptions {
  @scala.inline
  def apply(bucket: String): AddOverrideOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOverrideOptions]
  }
  @scala.inline
  implicit class AddOverrideOptionsOps[Self <: AddOverrideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortCompletionThrottlingMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortCompletionThrottlingMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortCompletionThrottlingMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortCompletionThrottlingMs")(js.undefined)
        ret
    }
    @scala.inline
    def withAws_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_key")(js.undefined)
        ret
    }
    @scala.inline
    def withAws_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_url")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAuthMethod(
      value: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuthMethod")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCustomAuthMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuthMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalTimeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetryBackoffSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryBackoffSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetryBackoffSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryBackoffSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withMockLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockLocalStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withPartSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressIntervalMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressIntervalMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressIntervalMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressIntervalMS")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableStreamPartMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReadableStreamPartMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableStreamPartMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableStreams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryBackoffPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryBackoffPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryBackoffPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryBackoffPower")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Acceleration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Acceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Acceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3FileCacheHoursAgo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3FileCacheHoursAgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3FileCacheHoursAgo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3FileCacheHoursAgo")(js.undefined)
        ret
    }
    @scala.inline
    def withSendCanonicalRequestToSignerUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendCanonicalRequestToSignerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendCanonicalRequestToSignerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendCanonicalRequestToSignerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSignHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSignParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSignResponseHandler(
      value: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signResponseHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSignResponseHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signResponseHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(js.undefined)
        ret
    }
  }
  
}

