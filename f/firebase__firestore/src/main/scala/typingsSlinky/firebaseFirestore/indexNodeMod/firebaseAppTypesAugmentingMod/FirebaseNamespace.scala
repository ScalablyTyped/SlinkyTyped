package typingsSlinky.firebaseFirestore.indexNodeMod.firebaseAppTypesAugmentingMod

import typingsSlinky.firebaseFirestore.AnonBlob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[AnonBlob] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: AnonBlob = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

