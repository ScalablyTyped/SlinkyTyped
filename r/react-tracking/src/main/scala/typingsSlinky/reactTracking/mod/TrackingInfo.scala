package typingsSlinky.reactTracking.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Function3[
/ * props * / P, 
/ * state * / S, 
/ * import warning: importer.ImportType#apply Failed type conversion: any[any] * / / * args * / js.Any, 
T | typingsSlinky.reactTracking.mod.Falsy]
*/
trait TrackingInfo[T, P, S] extends js.Object

object TrackingInfo {
  @scala.inline
  implicit def apply[T, P, S](
    value: js.Function3[
      /* props */ P, 
      /* state */ S, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[any] */ /* args */ js.Any, 
      T | Falsy
    ]
  ): TrackingInfo[T, P, S] = value.asInstanceOf[TrackingInfo[T, P, S]]
  @scala.inline
  implicit def apply[T, P, S](value: T): TrackingInfo[T, P, S] = value.asInstanceOf[TrackingInfo[T, P, S]]
}

