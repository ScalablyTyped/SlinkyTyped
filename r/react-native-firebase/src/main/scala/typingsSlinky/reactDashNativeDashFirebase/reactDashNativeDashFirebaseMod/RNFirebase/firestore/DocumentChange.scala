package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.added
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.modified
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  val doc: DocumentSnapshot
  val newIndex: Double
  val oldIndex: Double
  val `type`: added | modified | removed
}

object DocumentChange {
  @scala.inline
  def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
}

