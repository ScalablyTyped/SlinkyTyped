package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jest.mod.jest.MockResultReturn[T]
  - typingsSlinky.jest.mod.jest.MockResultThrow
  - typingsSlinky.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends js.Object

object MockResult {
  @scala.inline
  implicit def apply[T](value: MockResultIncomplete): MockResult[T] = value.asInstanceOf[MockResult[T]]
  @scala.inline
  implicit def apply[T](value: MockResultReturn[T]): MockResult[T] = value.asInstanceOf[MockResult[T]]
  @scala.inline
  implicit def apply[T](value: MockResultThrow): MockResult[T] = value.asInstanceOf[MockResult[T]]
}

