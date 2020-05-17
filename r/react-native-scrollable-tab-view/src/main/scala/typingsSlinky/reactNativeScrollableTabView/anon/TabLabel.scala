package typingsSlinky.reactNativeScrollableTabView.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabLabel extends js.Object {
  var tabLabel: ReactChild = js.native
}

object TabLabel {
  @scala.inline
  def apply(tabLabel: ReactChild): TabLabel = {
    val __obj = js.Dynamic.literal(tabLabel = tabLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabLabel]
  }
  @scala.inline
  implicit class TabLabelOps[Self <: TabLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabLabel(value: ReactChild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

