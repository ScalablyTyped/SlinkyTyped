package typingsSlinky.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceColumn extends js.Object {
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.native
  /** Allows the user to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.native
}

object DataSourceColumn {
  @scala.inline
  def apply(): DataSourceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceColumn]
  }
  @scala.inline
  implicit class DataSourceColumnOps[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
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
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterItems(value: DataSourceColumnsFilterItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterItems")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNamedSets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNamedSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNamedSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNamedSets")(js.undefined)
        ret
    }
  }
  
}

