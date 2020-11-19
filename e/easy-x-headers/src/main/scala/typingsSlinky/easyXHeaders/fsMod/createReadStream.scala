package typingsSlinky.easyXHeaders.fsMod

import typingsSlinky.easyXHeaders.anon.BufferSize
import typingsSlinky.easyXHeaders.anon.Fd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  
  def apply(path: String): ReadStream = js.native
  def apply(path: String, options: BufferSize): ReadStream = js.native
  def apply(path: String, options: Fd): ReadStream = js.native
}
