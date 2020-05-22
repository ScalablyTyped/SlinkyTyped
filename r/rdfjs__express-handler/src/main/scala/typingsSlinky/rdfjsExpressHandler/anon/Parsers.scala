package typingsSlinky.rdfjsExpressHandler.anon

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsers extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]]
  var serializers: SinkMap[Stream[Quad], EventEmitter]
}

object Parsers {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Parsers = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsers]
  }
}

