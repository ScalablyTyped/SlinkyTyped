package typingsSlinky.rdfjsFetchLite.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends RdfFetchResponse[OutQuad] {
  def dataset(): js.Promise[D] = js.native
}

object DatasetResponse {
  @scala.inline
  def apply[D, OutQuad, InQuad](
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    dataset: () => js.Promise[D],
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    quadStream: () => js.Promise[Stream[OutQuad]],
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String
  ): DatasetResponse[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = js.Any.fromFunction0(dataset), formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
  }
  @scala.inline
  implicit class DatasetResponseOps[Self[d, outquad, inquad] <: DatasetResponse[d, outquad, inquad], D, OutQuad, InQuad] (val x: Self[D, OutQuad, InQuad]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, OutQuad, InQuad] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, OutQuad, InQuad]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, OutQuad, InQuad]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, OutQuad, InQuad]) with Other]
    @scala.inline
    def withDataset(value: () => js.Promise[D]): Self[D, OutQuad, InQuad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

