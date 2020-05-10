package typingsSlinky.rbx.tableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableModifierProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var fullwidth: js.UndefOr[Boolean] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var narrow: js.UndefOr[Boolean] = js.native
  var striped: js.UndefOr[Boolean] = js.native
}

object TableModifierProps {
  @scala.inline
  def apply(): TableModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableModifierProps]
  }
  @scala.inline
  implicit class TableModifierPropsOps[Self <: TableModifierProps] (val x: Self) extends AnyVal {
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
    def withoutBordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withFullwidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withNarrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
        ret
    }
  }
  
}

