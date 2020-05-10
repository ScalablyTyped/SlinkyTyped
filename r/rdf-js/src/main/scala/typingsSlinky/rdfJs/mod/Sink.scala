package typingsSlinky.rdfJs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends js.Object {
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def `import`(stream: InputStream): OutputStream = js.native
}

object Sink {
  @scala.inline
  def apply[InputStream, OutputStream](`import`: InputStream => OutputStream): Sink[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Sink[InputStream, OutputStream]]
  }
  @scala.inline
  implicit class SinkOps[Self[inputstream, outputstream] <: Sink[inputstream, outputstream], InputStream, OutputStream] (val x: Self[InputStream, OutputStream]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InputStream, OutputStream] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InputStream, OutputStream]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InputStream, OutputStream]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InputStream, OutputStream]) with Other]
    @scala.inline
    def withImport(value: InputStream => OutputStream): Self[InputStream, OutputStream] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

