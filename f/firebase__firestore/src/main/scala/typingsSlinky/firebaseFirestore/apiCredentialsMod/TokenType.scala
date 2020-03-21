package typingsSlinky.firebaseFirestore.apiCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OAuth
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.FirstParty
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def FirstParty: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.FirstParty = this.cast("FirstParty")
  @scala.inline
  def OAuth: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OAuth = this.cast("OAuth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

