package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid column.
  */
@js.native
trait ASPxClientGridViewColumn extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String = js.native
  /** @deprecated Use the name property instead. */
  /**
    * Gets the column's unique identifier.
    */
  var id: String = js.native
  /**
    * Gets the column's position within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String = js.native
  /**
    * Gets whether the column is visible.
    */
  var visible: Boolean = js.native
}

object ASPxClientGridViewColumn {
  @scala.inline
  def apply(fieldName: String, id: String, index: Double, name: String, visible: Boolean): ASPxClientGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumn]
  }
  @scala.inline
  implicit class ASPxClientGridViewColumnOps[Self <: ASPxClientGridViewColumn] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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

