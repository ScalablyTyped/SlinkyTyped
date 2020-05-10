package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnFieldArea extends js.Object {
  var columnFieldArea: js.UndefOr[String] = js.native
  var dataFieldArea: js.UndefOr[String] = js.native
  var filterFieldArea: js.UndefOr[String] = js.native
  var rowFieldArea: js.UndefOr[String] = js.native
}

object AnonColumnFieldArea {
  @scala.inline
  def apply(): AnonColumnFieldArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColumnFieldArea]
  }
  @scala.inline
  implicit class AnonColumnFieldAreaOps[Self <: AnonColumnFieldArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFieldArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFieldArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFieldArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFieldArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFieldArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFieldArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldArea")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFieldArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFieldArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFieldArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFieldArea")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFieldArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFieldArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldArea")(js.undefined)
        ret
    }
  }
  
}

