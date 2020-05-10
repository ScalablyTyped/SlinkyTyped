package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a grid.
  */
@js.native
trait SchemaGridProperties extends js.Object {
  /**
    * The number of columns in the grid.
    */
  var columnCount: js.UndefOr[Double] = js.native
  /**
    * True if the column grouping control toggle is shown after the group.
    */
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.native
  /**
    * The number of columns that are frozen in the grid.
    */
  var frozenColumnCount: js.UndefOr[Double] = js.native
  /**
    * The number of rows that are frozen in the grid.
    */
  var frozenRowCount: js.UndefOr[Double] = js.native
  /**
    * True if the grid isn&#39;t showing gridlines in the UI.
    */
  var hideGridlines: js.UndefOr[Boolean] = js.native
  /**
    * The number of rows in the grid.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * True if the row grouping control toggle is shown after the group.
    */
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.native
}

object SchemaGridProperties {
  @scala.inline
  def apply(): SchemaGridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridProperties]
  }
  @scala.inline
  implicit class SchemaGridPropertiesOps[Self <: SchemaGridProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGroupControlAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroupControlAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroupControlAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroupControlAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHideGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupControlAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupControlAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupControlAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupControlAfter")(js.undefined)
        ret
    }
  }
  
}

