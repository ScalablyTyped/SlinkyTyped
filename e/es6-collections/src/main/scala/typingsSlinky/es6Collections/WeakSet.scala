package typingsSlinky.es6Collections

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T] = js.native
  def clear(): Unit = js.native
  def delete(value: T): Boolean = js.native
  def has(value: T): Boolean = js.native
}

@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

