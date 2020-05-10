package typingsSlinky.ionicCore.tabBarInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarChangedEventDetail extends js.Object {
  var tab: js.UndefOr[String] = js.native
}

object TabBarChangedEventDetail {
  @scala.inline
  def apply(): TabBarChangedEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarChangedEventDetail]
  }
  @scala.inline
  implicit class TabBarChangedEventDetailOps[Self <: TabBarChangedEventDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
  }
  
}

