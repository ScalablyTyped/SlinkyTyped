package typingsSlinky.nodeForge.mod.hmac

import typingsSlinky.node.Buffer
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HMAC extends js.Object {
  
  def digest(): ByteBuffer = js.native
  
  def getMact(): ByteBuffer = js.native
  
  def start(md: Algorithm): Unit = js.native
  def start(md: Algorithm, key: String): Unit = js.native
  def start(md: Algorithm, key: ByteBuffer): Unit = js.native
  
  def update(bytes: String): Unit = js.native
  def update(bytes: Buffer): Unit = js.native
  def update(bytes: ByteBuffer): Unit = js.native
}
