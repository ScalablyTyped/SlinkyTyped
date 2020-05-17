package typingsSlinky.gun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Gun {
  type AckCallback = js.Function1[/* ack */ typingsSlinky.gun.anon.Err | typingsSlinky.gun.anon.Ok, scala.Unit]
  /** These types cannot be stored on Gun */
  type AlwaysDisallowedType[T] = typingsSlinky.gun.mod.Gun.AccessObject[T]
  type ArrayOf[T] = js.Any
  type DisallowArray[T] = T
  /** These types cannot be stored on Gun's root level */
  type DisallowPrimitives[Open, T] = T
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
}
