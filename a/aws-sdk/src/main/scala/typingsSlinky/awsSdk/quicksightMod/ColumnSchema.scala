package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSchema extends js.Object {
  /**
    * The data type of the column schema.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * The geographic role of the column schema.
    */
  var GeographicRole: js.UndefOr[String] = js.native
  /**
    * The name of the column schema.
    */
  var Name: js.UndefOr[String] = js.native
}

object ColumnSchema {
  @scala.inline
  def apply(): ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSchema]
  }
  @scala.inline
  implicit class ColumnSchemaOps[Self <: ColumnSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(js.undefined)
        ret
    }
    @scala.inline
    def withGeographicRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeographicRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeographicRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeographicRole")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

