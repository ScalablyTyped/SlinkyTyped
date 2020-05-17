package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid row.
  */
@js.native
trait ASPxClientVerticalGridRow extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current row.
    */
  var fieldName: String = js.native
  /**
    * Gets the row's position within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the row.
    */
  var name: String = js.native
  /**
    * Gets whether the row is visible.
    */
  var visible: Boolean = js.native
}

object ASPxClientVerticalGridRow {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientVerticalGridRow = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRow]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridRowOps[Self <: ASPxClientVerticalGridRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

