package typingsSlinky.knex.mod

import typingsSlinky.knex.mod.DeferredKeySelection.ReplaceBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T2
  - js.Array[T2]
*/
trait ArrayIfAlready[T1, T2]
  extends ReplaceBase[T1, js.Any]

object ArrayIfAlready {
  @scala.inline
  implicit def apply[T1, T2](value: js.Array[T2]): ArrayIfAlready[T1, T2] = value.asInstanceOf[ArrayIfAlready[T1, T2]]
  @scala.inline
  implicit def apply[T1, T2](value: T2): ArrayIfAlready[T1, T2] = value.asInstanceOf[ArrayIfAlready[T1, T2]]
}

