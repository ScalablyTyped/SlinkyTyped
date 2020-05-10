package typingsSlinky.multistream

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multistream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait FactoryStreamCallback extends js.Object {
    def apply(): js.Any = js.native
    def apply(err: Null, stream: ReadableStream): js.Any = js.native
    def apply(err: js.Error): js.Any = js.native
  }
  
  def apply(streams: Streams): ReadableStream = js.native
  def obj(streams: Streams): ReadableStream = js.native
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, Unit]
  type LazyStream = js.Function0[Stream]
  type Streams = (js.Array[LazyStream | ReadableStream]) | FactoryStream
}

