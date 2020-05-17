package typingsSlinky.firebaseStorage.mod.firebaseAppTypesAugmentingMod

import typingsSlinky.firebaseStorage.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  var storage: js.UndefOr[Call] = js.native
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
    def withStorage(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

