package typingsSlinky.antd.anon

import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  var bordered: Boolean = js.native
  var dataSource: js.Array[scala.Nothing] = js.native
  var loading: Boolean = js.native
  var pagination: js.UndefOr[`false` | PaginationConfig] = js.native
  var split: Boolean = js.native
}

object DataSource {
  @scala.inline
  def apply(bordered: Boolean, dataSource: js.Array[scala.Nothing], loading: Boolean, split: Boolean): DataSource = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: `false` | PaginationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
  }
  
}

