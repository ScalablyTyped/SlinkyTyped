package typingsSlinky.firebaseFirestore.mod

import typingsSlinky.firebaseFirestoreTypes.mod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirestore(value: () => FirebaseFirestore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firestore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFirestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firestore")(js.undefined)
        ret
    }
  }
  
}

