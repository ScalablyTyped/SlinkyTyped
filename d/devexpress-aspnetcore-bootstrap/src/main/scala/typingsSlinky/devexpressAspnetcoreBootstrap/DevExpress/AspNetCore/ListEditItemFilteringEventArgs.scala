package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEditItemFilteringEventArgs extends EventArgs {
  val filter: String = js.native
  var isFit: Boolean = js.native
  val item: BootstrapListBoxItem = js.native
}

object ListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: BootstrapListBoxItem, sender: Control): ListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemFilteringEventArgs]
  }
  @scala.inline
  implicit class ListEditItemFilteringEventArgsOps[Self <: ListEditItemFilteringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: BootstrapListBoxItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

