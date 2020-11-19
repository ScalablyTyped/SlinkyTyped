package typingsSlinky.gulpNodemon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter
  extends typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter {
  
  def addListener(event: String, listener: js.Function): this.type = js.native
  def addListener(event: String, tasks: js.Array[String]): this.type = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: String, tasks: js.Array[String]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  def once(event: String, tasks: js.Array[String]): this.type = js.native
}
