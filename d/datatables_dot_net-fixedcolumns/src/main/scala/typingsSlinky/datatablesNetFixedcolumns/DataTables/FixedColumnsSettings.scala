package typingsSlinky.datatablesNetFixedcolumns.DataTables

import typingsSlinky.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.auto
import typingsSlinky.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.none
import typingsSlinky.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.semiauto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedColumnsSettings extends js.Object {
  /*
    * Row height matching algorithm to use
    *
    * The algorithm to use. This can be one of (see below for full description):
    * 'none' | 'semiauto' | 'auto'
    */
  var heightMatch: js.UndefOr[none | semiauto | auto] = js.native
  /*
    * The number of columns on the left hand side of the table to fix in place.
    */
  var leftColumns: js.UndefOr[Double] = js.native
  /*
    * The number of columns on the right hand side of the table to fix in place.
    */
  var rightColumns: js.UndefOr[Double] = js.native
}

object FixedColumnsSettings {
  @scala.inline
  def apply(): FixedColumnsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedColumnsSettings]
  }
  @scala.inline
  implicit class FixedColumnsSettingsOps[Self <: FixedColumnsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightMatch(value: none | semiauto | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withRightColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightColumns")(js.undefined)
        ret
    }
  }
  
}

