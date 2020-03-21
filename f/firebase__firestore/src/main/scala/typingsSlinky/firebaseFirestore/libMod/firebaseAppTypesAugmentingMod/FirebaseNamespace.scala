package typingsSlinky.firebaseFirestore.libMod.firebaseAppTypesAugmentingMod

import typingsSlinky.firebaseFirestore.AnonCollectionReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[AnonCollectionReference] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: AnonCollectionReference = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

