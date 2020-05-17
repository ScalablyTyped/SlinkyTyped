package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
@js.native
trait ASPxClientGridViewCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double = js.native
}

object ASPxClientGridViewCellInfo {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, key: js.Any, rowVisibleIndex: Double): ASPxClientGridViewCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCellInfo]
  }
  @scala.inline
  implicit class ASPxClientGridViewCellInfoOps[Self <: ASPxClientGridViewCellInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ASPxClientGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVisibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

