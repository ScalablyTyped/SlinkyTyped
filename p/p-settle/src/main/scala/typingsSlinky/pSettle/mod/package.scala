package typingsSlinky.pSettle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // TODO: Use the native version when TS supports it (should be in v4).
  type Awaited[T] = T
  type PromiseFulfilledResult[ValueType] = typingsSlinky.pReflect.mod.PromiseFulfilledResult[ValueType]
  type PromiseRejectedResult = typingsSlinky.pReflect.mod.PromiseRejectedResult
  type PromiseResult[ValueType] = typingsSlinky.pReflect.mod.PromiseResult[ValueType]
  type ReturnValue[T] = T | typingsSlinky.std.ReturnType[T]
}
