package typingsSlinky.levelup.mod

import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelUpChain[K, V] extends js.Object {
  
  def clear(): this.type = js.native
  
  def del(key: K): this.type = js.native
  
  val length: Double = js.native
  
  def put(key: K, value: V): this.type = js.native
  
  def write(): js.Promise[this.type] = js.native
  def write(callback: ErrorCallback): this.type = js.native
}
