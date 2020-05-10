package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarativeTableColumn extends js.Object {
  var categoryValues: js.UndefOr[js.Array[CategoryValue]] = js.native
  var displayName: String = js.native
  var isReadOnly: Boolean = js.native
  var valueType: DeclarativeDataType = js.native
  var width: Double | String = js.native
}

object DeclarativeTableColumn {
  @scala.inline
  def apply(displayName: String, isReadOnly: Boolean, valueType: DeclarativeDataType, width: Double | String): DeclarativeTableColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableColumn]
  }
  @scala.inline
  implicit class DeclarativeTableColumnOps[Self <: DeclarativeTableColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: DeclarativeDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryValues(value: js.Array[CategoryValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryValues")(js.undefined)
        ret
    }
  }
  
}

