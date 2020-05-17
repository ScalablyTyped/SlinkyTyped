package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowFieldDragging extends js.Object {
  var allowFieldDragging: js.UndefOr[Boolean] = js.native
  var showColumnFields: js.UndefOr[Boolean] = js.native
  var showDataFields: js.UndefOr[Boolean] = js.native
  var showFilterFields: js.UndefOr[Boolean] = js.native
  var showRowFields: js.UndefOr[Boolean] = js.native
  var texts: js.UndefOr[ColumnFieldArea] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AllowFieldDragging {
  @scala.inline
  def apply(): AllowFieldDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowFieldDragging]
  }
  @scala.inline
  implicit class AllowFieldDraggingOps[Self <: AllowFieldDragging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFieldDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFieldDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFieldDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFieldDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDataFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilterFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilterFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowFields")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: ColumnFieldArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

