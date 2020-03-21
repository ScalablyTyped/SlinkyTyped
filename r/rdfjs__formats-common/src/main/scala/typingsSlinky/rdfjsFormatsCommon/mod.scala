package typingsSlinky.rdfjsFormatsCommon

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/formats-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
}

