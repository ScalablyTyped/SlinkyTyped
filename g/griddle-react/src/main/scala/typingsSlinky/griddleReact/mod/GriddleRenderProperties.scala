package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleRenderProperties extends js.Object {
  var columnProperties: js.UndefOr[PropertyBag[ColumnRenderProperties]] = js.native
  var rowProperties: js.UndefOr[RowRenderProperties] = js.native
}

object GriddleRenderProperties {
  @scala.inline
  def apply(): GriddleRenderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleRenderProperties]
  }
  @scala.inline
  implicit class GriddleRenderPropertiesOps[Self <: GriddleRenderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnProperties(value: PropertyBag[ColumnRenderProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRowProperties(value: RowRenderProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProperties")(js.undefined)
        ret
    }
  }
  
}

