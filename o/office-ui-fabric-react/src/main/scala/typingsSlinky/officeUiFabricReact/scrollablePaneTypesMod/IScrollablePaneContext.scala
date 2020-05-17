package typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod

import typingsSlinky.officeUiFabricReact.anon.AddSticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneContext extends js.Object {
  var scrollablePane: js.UndefOr[AddSticky] = js.native
}

object IScrollablePaneContext {
  @scala.inline
  def apply(): IScrollablePaneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollablePaneContext]
  }
  @scala.inline
  implicit class IScrollablePaneContextOps[Self <: IScrollablePaneContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollablePane(value: AddSticky): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollablePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollablePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollablePane")(js.undefined)
        ret
    }
  }
  
}

