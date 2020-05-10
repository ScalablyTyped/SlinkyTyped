package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupSchema extends js.Object {
  /**
    * A structure containing the list of schemas for column group columns.
    */
  var ColumnGroupColumnSchemaList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ColumnGroupColumnSchemaList] = js.native
  /**
    * The name of the column group schema.
    */
  var Name: js.UndefOr[String] = js.native
}

object ColumnGroupSchema {
  @scala.inline
  def apply(): ColumnGroupSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupSchema]
  }
  @scala.inline
  implicit class ColumnGroupSchemaOps[Self <: ColumnGroupSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnGroupColumnSchemaList(value: ColumnGroupColumnSchemaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroupColumnSchemaList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroupColumnSchemaList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroupColumnSchemaList")(js.undefined)
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

