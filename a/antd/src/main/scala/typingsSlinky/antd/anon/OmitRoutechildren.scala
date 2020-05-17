package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/breadcrumb/Breadcrumb.Route, 'children'> */
@js.native
trait OmitRoutechildren extends js.Object {
  var breadcrumbName: String = js.native
  var path: String = js.native
}

object OmitRoutechildren {
  @scala.inline
  def apply(breadcrumbName: String, path: String): OmitRoutechildren = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRoutechildren]
  }
  @scala.inline
  implicit class OmitRoutechildrenOps[Self <: OmitRoutechildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadcrumbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

