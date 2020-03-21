package typingsSlinky.n3.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typingsSlinky.rdfJs.mod.BaseQuad */]
  extends ReadableStream
     with WritableStream
     with Sink[Stream[Q], EventEmitter]

