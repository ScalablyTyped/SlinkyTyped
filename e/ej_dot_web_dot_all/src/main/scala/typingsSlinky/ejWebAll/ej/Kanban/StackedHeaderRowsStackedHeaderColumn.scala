package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedHeaderRowsStackedHeaderColumn extends js.Object {
  /** Gets or sets a value that indicates the column for the particular stacked header column.
    * @Default {null}
    */
  var column: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the headerText for the particular stacked header column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
}

object StackedHeaderRowsStackedHeaderColumn {
  @scala.inline
  def apply(): StackedHeaderRowsStackedHeaderColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
  }
  @scala.inline
  implicit class StackedHeaderRowsStackedHeaderColumnOps[Self <: StackedHeaderRowsStackedHeaderColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
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
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
  }
  
}

