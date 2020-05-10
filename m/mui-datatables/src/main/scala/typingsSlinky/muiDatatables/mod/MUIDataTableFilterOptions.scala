package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFilterOptions extends js.Object {
  var display: js.UndefOr[
    js.Function4[
      /* filterList */ js.Array[String], 
      /* onChange */ js.Any, 
      /* index */ Double, 
      /* column */ js.Any, 
      Unit
    ]
  ] = js.native
  var logic: js.UndefOr[js.Function2[/* prop */ String, /* filterValue */ js.Array[_], Boolean]] = js.native
  var names: js.UndefOr[js.Array[String]] = js.native
}

object MUIDataTableFilterOptions {
  @scala.inline
  def apply(): MUIDataTableFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFilterOptions]
  }
  @scala.inline
  implicit class MUIDataTableFilterOptionsOps[Self <: MUIDataTableFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(
      value: (/* filterList */ js.Array[String], /* onChange */ js.Any, /* index */ Double, /* column */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withLogic(value: (/* prop */ String, /* filterValue */ js.Array[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
  }
  
}

