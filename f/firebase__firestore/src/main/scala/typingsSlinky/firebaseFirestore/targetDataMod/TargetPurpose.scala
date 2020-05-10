package typingsSlinky.firebaseFirestore.targetDataMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`0`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`1`
  - typingsSlinky.firebaseFirestore.firebaseFirestoreNumbers.`2`
*/
trait TargetPurpose extends js.Object

object TargetPurpose {
  /**
    * The query target was used to refill a query after an existence filter mismatch.
    */
  @scala.inline
  def ExistenceFilterMismatch: `1` = 1.asInstanceOf[`1`]
  /** The query target was used to resolve a limbo document. */
  @scala.inline
  def LimboResolution: `2` = 2.asInstanceOf[`2`]
  /** A regular, normal query target. */
  @scala.inline
  def Listen: `0` = 0.asInstanceOf[`0`]
}

