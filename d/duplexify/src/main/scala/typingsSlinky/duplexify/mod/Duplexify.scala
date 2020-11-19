package typingsSlinky.duplexify.mod

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duplexify extends Duplex {
  
  def setReadable(readable: Readable): Unit = js.native
  
  def setWritable(writable: Writable): Unit = js.native
}
