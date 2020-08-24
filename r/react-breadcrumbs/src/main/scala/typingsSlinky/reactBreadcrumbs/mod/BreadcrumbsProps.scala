package typingsSlinky.reactBreadcrumbs.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[ReactElement] = js.native
  var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, ReactElement]] = js.native
  var wrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
}

object BreadcrumbsProps {
  @scala.inline
  def apply(): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbsProps]
  }
  @scala.inline
  implicit class BreadcrumbsPropsOps[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setSeparatorReactElement(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSetCrumbs(value: /* crumbs */ Crumbs => ReactElement): Self = this.set("setCrumbs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCrumbs: Self = this.set("setCrumbs", js.undefined)
    @scala.inline
    def setWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ReactComponentClass[js.Object]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

