package typingsSlinky.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.Lessthansign
  - typings.firebase.firebaseStrings.LessthansignEqualssign
  - typings.firebase.firebaseStrings.EqualssignEqualssign
  - typings.firebase.firebaseStrings.GreaterthansignEqualssign
  - typings.firebase.firebaseStrings.Greaterthansign
  - typings.firebase.firebaseStrings.`array-contains`
  - typings.firebase.firebaseStrings.in
  - typings.firebase.firebaseStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typingsSlinky.firebase.firebaseStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typingsSlinky.firebase.firebaseStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.firebase.firebaseStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.firebase.firebaseStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.firebase.firebaseStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typingsSlinky.firebase.firebaseStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typingsSlinky.firebase.firebaseStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typingsSlinky.firebase.firebaseStrings.in = this.cast("in")
}

