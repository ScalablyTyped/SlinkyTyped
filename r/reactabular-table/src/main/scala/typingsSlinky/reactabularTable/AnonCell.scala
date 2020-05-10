package typingsSlinky.reactabularTable

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactabularTable.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCell extends js.Object {
  var cell: js.UndefOr[
    String | (js.Function2[/* props */ js.Any, /* column */ Column, ReactElement]) | (js.Function1[/* props */ js.Any, ReactInstance])
  ] = js.native
  var row: js.UndefOr[String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])] = js.native
  var wrapper: js.UndefOr[String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])] = js.native
}

object AnonCell {
  @scala.inline
  def apply(): AnonCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCell]
  }
  @scala.inline
  implicit class AnonCellOps[Self <: AnonCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellFunction2(value: (/* props */ js.Any, /* column */ Column) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCellFunction1(value: /* props */ js.Any => ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCell(
      value: String | (js.Function2[/* props */ js.Any, /* column */ Column, ReactElement]) | (js.Function1[/* props */ js.Any, ReactInstance])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFunction1(value: /* props */ js.Any => ReactElement | ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRow(value: String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])): Self = {
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
    def withWrapperFunction1(value: /* props */ js.Any => ReactElement | ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrapper(value: String | (js.Function1[/* props */ js.Any, ReactElement | ReactInstance])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

