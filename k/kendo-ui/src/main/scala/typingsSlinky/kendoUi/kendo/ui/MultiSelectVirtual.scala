package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectVirtual extends js.Object {
  var itemHeight: js.UndefOr[Double] = js.native
  var mapValueTo: js.UndefOr[String] = js.native
  var valueMapper: js.UndefOr[js.Function] = js.native
}

object MultiSelectVirtual {
  @scala.inline
  def apply(): MultiSelectVirtual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectVirtual]
  }
  @scala.inline
  implicit class MultiSelectVirtualOps[Self <: MultiSelectVirtual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMapValueTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValueTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapValueTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValueTo")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMapper(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMapper")(js.undefined)
        ret
    }
  }
  
}

