package typingsSlinky.firebaseFirestore.mod

import typingsSlinky.firebaseFirestore.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[Call] = js.native
}

object FirebaseNamespace {
  @scala.inline
  def apply(): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseNamespace]
  }
  @scala.inline
  implicit class FirebaseNamespaceOps[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirestore(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firestore")(value.asInstanceOf[js.Any])
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

