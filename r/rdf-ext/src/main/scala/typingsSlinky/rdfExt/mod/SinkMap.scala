package typingsSlinky.rdfExt.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
  def find(mediaType: String): Sink[InputStream, OutputStream] = js.native
  def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any = js.native
  def list(): js.Array[String] = js.native
}

object SinkMap {
  @scala.inline
  def apply[InputStream, OutputStream](
    find: String => Sink[InputStream, OutputStream],
    `import`: (String, js.Any, js.Any) => js.Any,
    list: () => js.Array[String]
  ): SinkMap[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
    __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
    __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
  }
  @scala.inline
  implicit class SinkMapOps[Self[inputstream, outputstream] <: SinkMap[inputstream, outputstream], InputStream, OutputStream] (val x: Self[InputStream, OutputStream]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InputStream, OutputStream] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InputStream, OutputStream]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InputStream, OutputStream]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InputStream, OutputStream]) with Other]
    @scala.inline
    def withFind(value: String => Sink[InputStream, OutputStream]): Self[InputStream, OutputStream] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: (String, js.Any, js.Any) => js.Any): Self[InputStream, OutputStream] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withList(value: () => js.Array[String]): Self[InputStream, OutputStream] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

