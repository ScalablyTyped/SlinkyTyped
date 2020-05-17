package typingsSlinky.immer.mod

import typingsSlinky.std.Map
import typingsSlinky.std.Number
import typingsSlinky.std.Set
import typingsSlinky.std.WeakMap
import typingsSlinky.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function
  - typingsSlinky.std.Map[js.Any, js.Any]
  - typingsSlinky.std.WeakMap[js.Any, js.Any]
  - typingsSlinky.std.Set[js.Any]
  - typingsSlinky.std.WeakSet[js.Any]
  - js.Promise[js.Any]
  - typingsSlinky.std.Date
  - typingsSlinky.std.RegExp
  - scala.Boolean
  - typingsSlinky.std.Number
  - java.lang.String
*/
trait AtomicObject extends js.Object

object AtomicObject {
  @scala.inline
  implicit def apply(value: Boolean): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: js.Date): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: js.Function): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: Map[js.Any, js.Any]): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: Number): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: js.Promise[js.Any]): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: js.RegExp): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: Set[js.Any]): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: String): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: WeakMap[js.Any, js.Any]): AtomicObject = value.asInstanceOf[AtomicObject]
  @scala.inline
  implicit def apply(value: WeakSet[js.Any]): AtomicObject = value.asInstanceOf[AtomicObject]
}

