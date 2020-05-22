package typingsSlinky.firebaseFirestore.queryMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.in_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.in_
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def ARRAY_CONTAINS: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def ARRAY_CONTAINS_ANY: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  @scala.inline
  def EQUAL: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  @scala.inline
  def GREATER_THAN: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GREATER_THAN_OR_EQUAL: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def IN: in_ = "in".asInstanceOf[in_]
  @scala.inline
  def LESS_THAN: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LESS_THAN_OR_EQUAL: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
}

