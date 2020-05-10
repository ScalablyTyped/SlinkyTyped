package typingsSlinky.mendixmodelsdk.transportationMod

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransportation extends js.Object {
  /**
    * Send a HTTP request, with specified method, url, data, success and failure callbacks.
    */
  def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  def requestMultipartBinaryFileUpload[T](
    options: IRequestMultipartBinaryFileUploadOptions,
    success: IResponseCallback[T],
    failure: IErrorCallback
  ): Unit = js.native
  /**
    * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
    */
  def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
}

object ITransportation {
  @scala.inline
  def apply(
    request: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
    retryableRequest: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
  ): ITransportation = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request), requestFileDownload = js.Any.fromFunction3(requestFileDownload), requestMultipartBinaryFileUpload = js.Any.fromFunction3(requestMultipartBinaryFileUpload), retryableRequest = js.Any.fromFunction3(retryableRequest))
    __obj.asInstanceOf[ITransportation]
  }
  @scala.inline
  implicit class ITransportationOps[Self <: ITransportation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequestFileDownload(value: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFileDownload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequestMultipartBinaryFileUpload(
      value: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMultipartBinaryFileUpload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRetryableRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryableRequest")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

