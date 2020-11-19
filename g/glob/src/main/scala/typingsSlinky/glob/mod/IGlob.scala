package typingsSlinky.glob.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlob
  extends EventEmitter
     with IGlobBase {
  
  def abort(): Unit = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
}
