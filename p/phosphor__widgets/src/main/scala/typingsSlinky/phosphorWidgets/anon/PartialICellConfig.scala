package typingsSlinky.phosphorWidgets.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@phosphor/widgets.@phosphor/widgets/lib/gridlayout.GridLayout.ICellConfig> */
@js.native
trait PartialICellConfig extends js.Object {
  var column: js.UndefOr[Double] = js.native
  var columnSpan: js.UndefOr[Double] = js.native
  var row: js.UndefOr[Double] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
}

object PartialICellConfig {
  @scala.inline
  def apply(): PartialICellConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICellConfig]
  }
  @scala.inline
  implicit class PartialICellConfigOps[Self <: PartialICellConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
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
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
  }
  
}

