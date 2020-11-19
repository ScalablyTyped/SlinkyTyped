package typingsSlinky.libnpmsearch.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libnpmsearch", "stream")
@js.native
object stream extends js.Object {
  
  def apply(query: String): ReadWriteStream = js.native
  def apply(query: String, opts: Options): ReadWriteStream = js.native
  def apply(query: js.Array[String]): ReadWriteStream = js.native
  def apply(query: js.Array[String], opts: Options): ReadWriteStream = js.native
}
