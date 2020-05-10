package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStoreStore extends js.Object {
  val Store: typingsSlinky.activexOutlook.Outlook.Store = js.native
}

object AnonStoreStore {
  @scala.inline
  def apply(Store: Store): AnonStoreStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStoreStore]
  }
  @scala.inline
  implicit class AnonStoreStoreOps[Self <: AnonStoreStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

