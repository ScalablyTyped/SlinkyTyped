package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The key in update() function for DocumentReference and WriteBatch. */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
*/
trait UpdateKey extends js.Object

object UpdateKey {
  @scala.inline
  implicit def apply(value: FieldPath): UpdateKey = value.asInstanceOf[UpdateKey]
  @scala.inline
  implicit def apply(value: String): UpdateKey = value.asInstanceOf[UpdateKey]
}

