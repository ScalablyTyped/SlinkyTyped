package typingsSlinky.officeUiFabricReact.breadcrumbTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbData extends js.Object {
  var props: IBreadcrumbProps = js.native
  var renderedItems: js.Array[IBreadcrumbItem] = js.native
  var renderedOverflowItems: js.Array[IBreadcrumbItem] = js.native
}

object IBreadcrumbData {
  @scala.inline
  def apply(
    props: IBreadcrumbProps,
    renderedItems: js.Array[IBreadcrumbItem],
    renderedOverflowItems: js.Array[IBreadcrumbItem]
  ): IBreadcrumbData = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], renderedItems = renderedItems.asInstanceOf[js.Any], renderedOverflowItems = renderedOverflowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbData]
  }
  @scala.inline
  implicit class IBreadcrumbDataOps[Self <: IBreadcrumbData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: IBreadcrumbProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedItems(value: js.Array[IBreadcrumbItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedOverflowItems(value: js.Array[IBreadcrumbItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedOverflowItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

