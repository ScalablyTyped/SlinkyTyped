package typingsSlinky.easyXapiSupertest.fsMod

import typingsSlinky.easyXapiSupertest.anon.BufferSize
import typingsSlinky.easyXapiSupertest.anon.Fd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: String): ReadStream = js.native
  def apply(path: String, options: BufferSize): ReadStream = js.native
  def apply(path: String, options: Fd): ReadStream = js.native
}

