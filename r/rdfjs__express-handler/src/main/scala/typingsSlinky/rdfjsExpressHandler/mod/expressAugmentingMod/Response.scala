package typingsSlinky.rdfjsExpressHandler.mod.expressAugmentingMod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  def dataset(dataset: DatasetCore[Quad, Quad]): js.Promise[Unit] = js.native
  def quadStream(stream: Stream[Quad]): js.Promise[Unit] = js.native
}

object Response {
  @scala.inline
  def apply(dataset: DatasetCore[Quad, Quad] => js.Promise[Unit], quadStream: Stream[Quad] => js.Promise[Unit]): Response = {
    val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction1(dataset), quadStream = js.Any.fromFunction1(quadStream))
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataset(value: DatasetCore[Quad, Quad] => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuadStream(value: Stream[Quad] => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadStream")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

