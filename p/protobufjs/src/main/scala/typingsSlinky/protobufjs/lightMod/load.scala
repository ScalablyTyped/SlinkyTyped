package typingsSlinky.protobufjs.lightMod

import typingsSlinky.protobufjs.protobufjsMod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "load")
@js.native
object load extends js.Object {
  def apply(filename: String): js.Promise[typingsSlinky.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typingsSlinky.protobufjs.protobufjsMod.Root): js.Promise[typingsSlinky.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: String, root: typingsSlinky.protobufjs.protobufjsMod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typingsSlinky.protobufjs.protobufjsMod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typingsSlinky.protobufjs.protobufjsMod.Root): js.Promise[typingsSlinky.protobufjs.protobufjsMod.Root] = js.native
  def apply(
    filename: js.Array[String],
    root: typingsSlinky.protobufjs.protobufjsMod.Root,
    callback: LoadCallback
  ): Unit = js.native
}

