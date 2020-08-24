package typingsSlinky.antDesignPro.chartCardMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.cardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartCardProps extends CardProps {
  var action: js.UndefOr[ReactElement] = js.native
  var avatar: js.UndefOr[ReactElement] = js.native
  var contentHeight: js.UndefOr[Double] = js.native
  var footer: js.UndefOr[ReactElement] = js.native
  @JSName("title")
  var title_IChartCardProps: ReactElement = js.native
  var total: js.UndefOr[ReactElement | Double | (js.Function0[ReactElement | Double])] = js.native
}

object IChartCardProps {
  @scala.inline
  def apply(): IChartCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartCardProps]
  }
  @scala.inline
  implicit class IChartCardPropsOps[Self <: IChartCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionReactElement(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAvatarReactElement(value: ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar(value: ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setContentHeight(value: Double): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotalReactElement(value: ReactElement): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalFunction0(value: () => ReactElement | Double): Self = this.set("total", js.Any.fromFunction0(value))
    @scala.inline
    def setTotal(value: ReactElement | Double | (js.Function0[ReactElement | Double])): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

