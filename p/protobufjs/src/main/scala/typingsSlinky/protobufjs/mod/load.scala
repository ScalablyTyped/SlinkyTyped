package typingsSlinky.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs", "load")
@js.native
object load extends js.Object {
  
  def apply(filename: String): js.Promise[Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: Root): js.Promise[Root] = js.native
  def apply(filename: String, root: Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: Root): js.Promise[Root] = js.native
  def apply(filename: js.Array[String], root: Root, callback: LoadCallback): Unit = js.native
}
