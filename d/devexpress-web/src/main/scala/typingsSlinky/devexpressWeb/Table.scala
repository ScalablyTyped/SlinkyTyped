package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table in the document.
  */
@js.native
trait Table extends js.Object {
  /**
    * Gets an index of the table.
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current table element.
    */
  val interval: Interval = js.native
  /**
    * Gets the table length in characters.
    */
  val length: Double = js.native
  /**
    * Provides access to a collection of table rows.
    */
  val rows: js.Array[TableRow] = js.native
  /**
    * Gets the table's start position in the document.
    */
  val start: Double = js.native
  /**
    * Gets the name of the style applied to the table (see StyleBase.name).
    */
  val styleName: String = js.native
}

object Table {
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    rows: js.Array[TableRow],
    start: Double,
    styleName: String
  ): Table = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[TableRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

