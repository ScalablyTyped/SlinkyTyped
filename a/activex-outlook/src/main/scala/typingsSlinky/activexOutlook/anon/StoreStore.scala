package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreStore extends js.Object {
  val Store: typingsSlinky.activexOutlook.Outlook.Store = js.native
}

object StoreStore {
  @scala.inline
  def apply(Store: typingsSlinky.activexOutlook.Outlook.Store): StoreStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreStore]
  }
  @scala.inline
  implicit class StoreStoreOps[Self <: StoreStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStore(value: typingsSlinky.activexOutlook.Outlook.Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

