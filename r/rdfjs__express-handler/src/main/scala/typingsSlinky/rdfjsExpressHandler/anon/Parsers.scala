package typingsSlinky.rdfjsExpressHandler.anon

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parsers extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
}

object Parsers {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Parsers = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsers]
  }
  @scala.inline
  implicit class ParsersOps[Self <: Parsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializers(value: SinkMap[Stream[Quad], EventEmitter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

