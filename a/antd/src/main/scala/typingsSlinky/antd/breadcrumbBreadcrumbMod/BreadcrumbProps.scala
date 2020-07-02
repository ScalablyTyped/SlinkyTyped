package typingsSlinky.antd.breadcrumbBreadcrumbMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactElement
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var separator: js.UndefOr[ReactElement] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbProps]
  }
  @scala.inline
  implicit class BreadcrumbPropsOps[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
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
    def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactElement
    ): Self = this.set("itemRender", js.Any.fromFunction4(value))
    @scala.inline
    def deleteItemRender: Self = this.set("itemRender", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRoutes(value: js.Array[Route]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setSeparatorReactElement(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

