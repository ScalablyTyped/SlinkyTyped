package typingsSlinky.pDashSome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashSomeMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary

  type AggregateError = AggregateError_
  type AggregateErrorConstructor = Instantiable1[
    /* errors */ js.Array[js.Error | StringDictionary[js.Any] | String], 
    typingsSlinky.aggregateDashError.aggregateDashErrorMod.^
  ]
  type AggregateError_ = typingsSlinky.aggregateDashError.aggregateDashErrorMod.^
  type CancelablePromise[ValueType] = typingsSlinky.pDashCancelable.pDashCancelableMod.^[ValueType]
  type Value[T] = T | js.Thenable[T]
}
