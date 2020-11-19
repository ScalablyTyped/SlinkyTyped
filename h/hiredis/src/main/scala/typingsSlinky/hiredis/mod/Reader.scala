package typingsSlinky.hiredis.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hiredis", "Reader")
@js.native
class Reader () extends js.Object {
  def this(config: Config) = this()
  
  def feed(reply: String): Unit = js.native
  def feed(reply: Buffer): Unit = js.native
  
  def get(): String | Buffer = js.native
}
