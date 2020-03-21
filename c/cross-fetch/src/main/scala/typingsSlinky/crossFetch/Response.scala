package typingsSlinky.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseInit
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_Response")
@js.native
class Response ()
  extends typingsSlinky.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: Boolean = js.native
  /* CompleteClass */
  override val headers: org.scalajs.dom.experimental.Headers = js.native
  /* CompleteClass */
  override val ok: Boolean = js.native
  /* CompleteClass */
  override val redirected: Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
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
object Response
  extends Instantiable0[typingsSlinky.std.Response]
     with Instantiable1[/* body */ BodyInit, typingsSlinky.std.Response]
     with Instantiable2[
      (/* body */ BodyInit) | (/* body */ Null), 
      /* init */ typingsSlinky.std.ResponseInit, 
      typingsSlinky.std.Response
    ] {
  def error(): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
}

