package typingsSlinky.dropboxjs.Dropbox.Util

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.dropboxjs.Dropbox.ApiError
import typingsSlinky.dropboxjs.Dropbox.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xhr extends js.Object {
  var xhr: XMLHttpRequest = js.native
  def addOauthHeader(oauth: Oauth): Xhr = js.native
  def addOauthParams(oauth: Oauth): Xhr = js.native
  def onError(error: ApiError, callBack: js.Function1[/* error */ ApiError, Unit]): Unit = js.native
  def onReadyStateChange(): Unit = js.native
  def onXdrError(): Unit = js.native
  def onXdrLoad(): Unit = js.native
  def prepare(): Xhr = js.native
  def reportResponseHeaders(): Xhr = js.native
  def send(
    callback: js.Function3[/* err */ ApiError, /* responseType */ String, /* metadataHeader */ js.Object, Unit]
  ): Xhr = js.native
  def setBody(body: String): Xhr = js.native
  def setBody(body: js.typedarray.ArrayBuffer): Xhr = js.native
  def setBody(body: Blob): Xhr = js.native
  def setCallback(
    callback: js.Function4[
      /* err */ ApiError, 
      /* responseType */ String, 
      /* metadataHeader */ js.Object, 
      /* headers */ js.Object, 
      Unit
    ]
  ): Xhr = js.native
  def setFileField(fieldName: String, fileName: String, fileData: String): Unit = js.native
  def setFileField(fieldName: String, fileName: String, fileData: String, contentType: String): Unit = js.native
  def setFileField(fieldName: String, fileName: String, fileData: Blob): Unit = js.native
  def setFileField(fieldName: String, fileName: String, fileData: Blob, contentType: String): Unit = js.native
  def setFileField(fieldName: String, fileName: String, fileData: File): Unit = js.native
  def setFileField(fieldName: String, fileName: String, fileData: File, contentType: String): Unit = js.native
  def setHeader(headerName: String, value: String): Xhr = js.native
  def setParams(params: QueryParams): Xhr = js.native
  def setResponseType(responseType: String): Xhr = js.native
  def signWithOauth(oauth: Oauth, cacheFriendly: Boolean): Xhr = js.native
}

