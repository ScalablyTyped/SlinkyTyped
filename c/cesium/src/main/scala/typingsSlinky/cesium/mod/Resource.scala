package typingsSlinky.cesium.mod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.raw.Blob
import typingsSlinky.cesium.anon.Headers
import typingsSlinky.cesium.anon.OverrideMimeType
import typingsSlinky.cesium.anon.PreferBlob
import typingsSlinky.cesium.anon.QueryParameters
import typingsSlinky.cesium.anon.ResponseType
import typingsSlinky.cesium.anon.RetryAttempts
import typingsSlinky.cesium.anon.TemplateValues
import typingsSlinky.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Resource")
@js.native
class Resource () extends js.Object {
  def this(options: RetryAttempts) = this()
  val extension: String = js.native
  var hasHeaders: Boolean = js.native
  var headers: js.Any = js.native
  var isBlobUri: Boolean = js.native
  var isCrossOriginUrl: Boolean = js.native
  var isDataUri: Boolean = js.native
  var proxy: DefaultProxy = js.native
  val queryParameters: js.Any = js.native
  var request: Request = js.native
  var retryAttempts: Double = js.native
  val templateValues: js.Any = js.native
  var url: String = js.native
  def addQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  def addTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
  def appendForwardSlash(): Unit = js.native
  def appendQueryParameters(params: js.Any): Unit = js.native
  def clone(result: Resource): Resource = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchImage(preferBlob: Boolean): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(callbackParameterName: String): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def getBaseUri(includeQuery: Boolean): String = js.native
  def getDerivedResource(options: TemplateValues): Resource = js.native
  def getUrlComponent(query: Boolean, proxy: Boolean): String = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any, options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any, options: ResponseType): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any, options: Headers): js.UndefOr[js.Promise[_]] = js.native
  def retryCallback(): Unit = js.native
  def setQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  def setTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
}

/* static members */
@JSImport("cesium", "Resource")
@js.native
object Resource extends js.Object {
  var DEFAULT: Resource = js.native
  val isBlobSupported: Boolean = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: OverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: QueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = js.native
  def fetchArrayBuffer(options: RetryAttempts): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchBlob(options: RetryAttempts): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  def fetchImage(options: PreferBlob): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(options: RetryAttempts): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(options: typingsSlinky.cesium.anon.RetryCallback): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  def fetchText(options: RetryAttempts): js.UndefOr[js.Promise[String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def fetchXml(options: RetryAttempts): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: QueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: QueryParameters): js.UndefOr[js.Promise[_]] = js.native
  def patch(): js.UndefOr[js.Promise[_]] = js.native
  def patch(options: OverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def post(): js.UndefOr[js.Promise[_]] = js.native
  def post(options: OverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def put(): js.UndefOr[js.Promise[_]] = js.native
  def put(options: OverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ js.Error, Unit]
}

