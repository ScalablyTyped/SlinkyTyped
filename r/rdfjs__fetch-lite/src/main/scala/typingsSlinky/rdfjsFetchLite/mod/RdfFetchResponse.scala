package typingsSlinky.rdfjsFetchLite.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdfFetchResponse[Q /* <: BaseQuad */] extends Response {
  def quadStream(): js.Promise[Stream[Q]]
}

object RdfFetchResponse {
  @scala.inline
  def apply[Q /* <: BaseQuad */](
    arrayBuffer: () => js.Promise[scala.scalajs.js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    quadStream: () => js.Promise[Stream[Q]],
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String,
    body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] = null
  ): RdfFetchResponse[Q] = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdfFetchResponse[Q]]
  }
}

