package typingsSlinky.curriable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TN
  - typingsSlinky.curriable.mod.Append[
/ * import warning: importer.ImportType#apply Failed type conversion: T2[curriable.curriable.Pos<I>] * / js.Any, 
TN]
*/
trait GapOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] extends js.Object

object GapOf {
  @scala.inline
  implicit def apply[T1, T2, TN, I](
    value: Append[
      /* import warning: importer.ImportType#apply Failed type conversion: T2[curriable.curriable.Pos<I>] */ js.Any, 
      TN
    ]
  ): GapOf[T1, T2, TN, I] = value.asInstanceOf[GapOf[T1, T2, TN, I]]
  @scala.inline
  implicit def apply[T1, T2, TN, I](value: TN): GapOf[T1, T2, TN, I] = value.asInstanceOf[GapOf[T1, T2, TN, I]]
}

