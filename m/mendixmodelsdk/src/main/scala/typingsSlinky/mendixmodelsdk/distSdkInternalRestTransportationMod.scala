package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distCommonMod.common.ICallback
import typingsSlinky.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.distSdkConfigurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportationMod.IRequestFileDownloadOptions
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportationMod.IRequestMultipartBinaryFileUploadOptions
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportationMod.IRequestOptions
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportationMod.IResponseCallback
import typingsSlinky.mendixmodelsdk.distSdkInternalTransportationMod.ITransportation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/RestTransportation", JSImport.Namespace)
@js.native
object distSdkInternalRestTransportationMod extends js.Object {
  @js.native
  class RestTransportation protected () extends ITransportation {
    def this(config: ISdkConfig) = this()
    var config: js.Any = js.native
    var generateStandardOptions: js.Any = js.native
    var handleRequest: js.Any = js.native
    var prepareRequestOptions: js.Any = js.native
    var sanitizedMethod: js.Any = js.native
    var url: js.Any = js.native
    /**
      * Send a HTTP request, with specified method, url, data, success and failure callbacks.
      */
    /* CompleteClass */
    override def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    /* CompleteClass */
    override def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    /* CompleteClass */
    override def requestMultipartBinaryFileUpload[T](options: IRequestMultipartBinaryFileUploadOptions, success: ICallback[T], failure: IErrorCallback): Unit = js.native
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    /* CompleteClass */
    override def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  }
  
}

