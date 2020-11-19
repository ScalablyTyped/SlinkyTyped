package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakSet[T] extends js.Object {
  
  def add(value: T): this.type = js.native
  
  def delete(value: T): scala.Boolean = js.native
  
  def has(value: T): scala.Boolean = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typingsSlinky.minappEnv.minappEnvStrings.WeakSet = js.native
}
