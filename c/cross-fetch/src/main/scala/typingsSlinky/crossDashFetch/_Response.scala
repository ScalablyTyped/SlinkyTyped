package typingsSlinky.crossDashFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseInit
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.BodyInit
import typingsSlinky.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_Response")
@js.native
class _Response () extends Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: Boolean = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val ok: Boolean = js.native
  /* CompleteClass */
  override val redirected: Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[Headers] = js.native
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  /* CompleteClass */
  override val url: String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[String] = js.native
}

@JSGlobal("_Response")
@js.native
object _Response
  extends Instantiable1[/* body */ BodyInit, Response]
     with Instantiable0[Response]
     with Instantiable2[
      (/* body */ BodyInit) | (/* body */ Null), 
      /* init */ typingsSlinky.std.ResponseInit, 
      Response
    ] {
  def error(): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
}

