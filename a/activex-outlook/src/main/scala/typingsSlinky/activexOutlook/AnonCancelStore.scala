package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelStore extends js.Object {
  var Cancel: Boolean = js.native
  val Store: typingsSlinky.activexOutlook.Outlook.Store = js.native
}

object AnonCancelStore {
  @scala.inline
  def apply(Cancel: Boolean, Store: Store): AnonCancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelStore]
  }
  @scala.inline
  implicit class AnonCancelStoreOps[Self <: AnonCancelStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

