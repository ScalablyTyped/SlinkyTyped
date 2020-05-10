package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A table range represents a reference to a subset of a table.  It&#39;s
  * important to note that the cells specified by a table range do not
  * necessarily form a rectangle. For example, let&#39;s say we have a 3 x 3
  * table where all the cells of the last row are merged together. The table
  * looks like this:                      [             ]  A table range with
  * location = (0, 0), row span = 3 and column span = 2 specifies the following
  * cells:        x     x       [ x    x    x ]
  */
@js.native
trait SchemaTableRange extends js.Object {
  /**
    * The column span of the table range.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The starting location of the table range.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The row span of the table range.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}

object SchemaTableRange {
  @scala.inline
  def apply(): SchemaTableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRange]
  }
  @scala.inline
  implicit class SchemaTableRangeOps[Self <: SchemaTableRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SchemaTableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
  }
  
}

