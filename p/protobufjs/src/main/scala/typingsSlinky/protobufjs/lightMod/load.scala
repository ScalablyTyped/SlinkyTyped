package typingsSlinky.protobufjs.lightMod

import typingsSlinky.protobufjs.mod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/light", "load")
@js.native
object load extends js.Object {
  
  def apply(filename: String): js.Promise[typingsSlinky.protobufjs.mod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typingsSlinky.protobufjs.mod.Root): js.Promise[typingsSlinky.protobufjs.mod.Root] = js.native
  def apply(filename: String, root: typingsSlinky.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typingsSlinky.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typingsSlinky.protobufjs.mod.Root): js.Promise[typingsSlinky.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], root: typingsSlinky.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
}
