package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.native
  var taskIdExpr: js.UndefOr[String | js.Function] = js.native
}

object ResourceIdExpr {
  @scala.inline
  def apply(): ResourceIdExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdExpr]
  }
  @scala.inline
  implicit class ResourceIdExprOps[Self <: ResourceIdExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskIdExpr")(js.undefined)
        ret
    }
  }
  
}

