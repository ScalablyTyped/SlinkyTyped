package typingsSlinky.reactabularTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactabularTable.anon.Cell
import typingsSlinky.reactabularTable.anon.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderers extends js.Object {
  var body: js.UndefOr[Row] = js.native
  var header: js.UndefOr[Cell] = js.native
  var table: js.UndefOr[String | js.Function0[ReactElement]] = js.native
}

object Renderers {
  @scala.inline
  def apply(): Renderers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Renderers]
  }
  @scala.inline
  implicit class RenderersOps[Self <: Renderers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withTableFunction0(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTable(value: String | js.Function0[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

