package typingsSlinky.deepDiff.mod

import typingsSlinky.deepDiff.deepDiffStrings.A
import typingsSlinky.deepDiff.deepDiffStrings.D
import typingsSlinky.deepDiff.deepDiffStrings.E
import typingsSlinky.deepDiff.deepDiffStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deepDiff.mod.DiffNew[RHS]
  - typingsSlinky.deepDiff.mod.DiffDeleted[LHS]
  - typingsSlinky.deepDiff.mod.DiffEdit[LHS, RHS]
  - typingsSlinky.deepDiff.mod.DiffArray[LHS, RHS]
*/
trait Diff_[LHS, RHS] extends js.Object
object Diff_ {
  
  @scala.inline
  def DiffNew[LHS, RHS](kind: N, rhs: RHS): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  
  @scala.inline
  def DiffDeleted[LHS, RHS](kind: D, lhs: LHS): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  
  @scala.inline
  def DiffEdit[LHS, RHS](kind: E, lhs: LHS, rhs: RHS): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  
  @scala.inline
  def DiffArray[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
}
