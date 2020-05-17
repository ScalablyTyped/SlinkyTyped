package typingsSlinky.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deepDiff.mod.DiffNew[RHS]
  - typingsSlinky.deepDiff.mod.DiffDeleted[LHS]
  - typingsSlinky.deepDiff.mod.DiffEdit[LHS, RHS]
  - typingsSlinky.deepDiff.mod.DiffArray[LHS, RHS]
*/
trait Diff_[LHS, RHS] extends js.Object

object Diff_ {
  @scala.inline
  implicit def apply[LHS, RHS](value: DiffArray[LHS, RHS]): Diff_[LHS, RHS] = value.asInstanceOf[Diff_[LHS, RHS]]
  @scala.inline
  implicit def apply[LHS, RHS](value: DiffDeleted[LHS]): Diff_[LHS, RHS] = value.asInstanceOf[Diff_[LHS, RHS]]
  @scala.inline
  implicit def apply[LHS, RHS](value: DiffEdit[LHS, RHS]): Diff_[LHS, RHS] = value.asInstanceOf[Diff_[LHS, RHS]]
  @scala.inline
  implicit def apply[LHS, RHS](value: DiffNew[RHS]): Diff_[LHS, RHS] = value.asInstanceOf[Diff_[LHS, RHS]]
}

