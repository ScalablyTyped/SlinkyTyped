package typingsSlinky.pAny

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregateError = typingsSlinky.pSome.mod.AggregateError
  type CancelablePromise[ValueType] = typingsSlinky.pCancelable.mod.^[ValueType]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}
