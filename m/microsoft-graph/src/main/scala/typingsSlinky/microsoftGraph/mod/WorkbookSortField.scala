package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSortField extends js.Object {
  // Represents whether the sorting is done in an ascending fashion.
  var ascending: js.UndefOr[Boolean] = js.native
  // Represents the color that is the target of the condition if the sorting is on font or cell color.
  var color: js.UndefOr[String] = js.native
  // Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
  var dataOption: js.UndefOr[String] = js.native
  // Represents the icon that is the target of the condition if the sorting is on the cell's icon.
  var icon: js.UndefOr[WorkbookIcon] = js.native
  /**
    * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset
    * from the first column (or row).
    */
  var key: js.UndefOr[Double] = js.native
  // Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
  var sortOn: js.UndefOr[String] = js.native
}

object WorkbookSortField {
  @scala.inline
  def apply(): WorkbookSortField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSortField]
  }
  @scala.inline
  implicit class WorkbookSortFieldOps[Self <: WorkbookSortField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOption")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: WorkbookIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOn")(js.undefined)
        ret
    }
  }
  
}

