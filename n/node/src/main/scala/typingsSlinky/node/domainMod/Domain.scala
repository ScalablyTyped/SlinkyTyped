package typingsSlinky.node.domainMod

import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domain", "Domain")
@js.native
class Domain ()
  extends EventEmitter
     with typingsSlinky.node.domainMod.global.NodeJS.Domain {
  
  def enter(): Unit = js.native
  
  def exit(): Unit = js.native
  
  var members: js.Array[EventEmitter | Timer] = js.native
}
