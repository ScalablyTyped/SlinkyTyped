package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyExpr extends js.Object {
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.native
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  var predecessorIdExpr: js.UndefOr[String | js.Function] = js.native
  var successorIdExpr: js.UndefOr[String | js.Function] = js.native
  var typeExpr: js.UndefOr[String | js.Function] = js.native
}

object AnonKeyExpr {
  @scala.inline
  def apply(): AnonKeyExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKeyExpr]
  }
  @scala.inline
  implicit class AnonKeyExprOps[Self <: AnonKeyExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions): Self = {
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
    def withPredecessorIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredecessorIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessorIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessorIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpr")(js.undefined)
        ret
    }
  }
  
}

