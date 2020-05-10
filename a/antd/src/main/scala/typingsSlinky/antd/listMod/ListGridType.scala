package typingsSlinky.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGridType extends js.Object {
  var column: js.UndefOr[ColumnCount] = js.native
  var gutter: js.UndefOr[Double] = js.native
  var lg: js.UndefOr[ColumnCount] = js.native
  var md: js.UndefOr[ColumnCount] = js.native
  var sm: js.UndefOr[ColumnCount] = js.native
  var xl: js.UndefOr[ColumnCount] = js.native
  var xs: js.UndefOr[ColumnCount] = js.native
  var xxl: js.UndefOr[ColumnCount] = js.native
}

object ListGridType {
  @scala.inline
  def apply(): ListGridType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGridType]
  }
  @scala.inline
  implicit class ListGridTypeOps[Self <: ListGridType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withLg(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withSm(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(js.undefined)
        ret
    }
    @scala.inline
    def withXl(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
    @scala.inline
    def withXxl(value: ColumnCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(js.undefined)
        ret
    }
  }
  
}

