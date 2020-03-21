package typingsSlinky.firebaseFirestore.inputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.undefined
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`object`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.function
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.boolean
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.number
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.string
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`non-empty string`
*/
trait ValidationType extends js.Object

object ValidationType {
  @scala.inline
  def boolean: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.function = this.cast("function")
  @scala.inline
  def `non-empty string`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`non-empty string` = this.cast("non-empty string")
  @scala.inline
  def number: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.string = this.cast("string")
  @scala.inline
  def undefined: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.undefined = this.cast("undefined")
}

