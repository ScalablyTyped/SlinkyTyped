package typingsSlinky.nodeSsdp.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ssdp", "Base")
@js.native
abstract class Base () extends EventEmitter {
  def this(opts: SsdpOptions) = this()
  
  def addUSN(device: String): Unit = js.native
}
