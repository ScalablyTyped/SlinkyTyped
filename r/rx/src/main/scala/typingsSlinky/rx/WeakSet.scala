package typingsSlinky.rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakSet[T] extends js.Object {
  
  def add(value: T): WeakSet[T] = js.native
  
  def clear(): Unit = js.native
  
  def delete(value: T): Boolean = js.native
  
  def has(value: T): Boolean = js.native
  
  @JSName(js.Symbol.toStringTag)
  var toStringTag: String = js.native
}
