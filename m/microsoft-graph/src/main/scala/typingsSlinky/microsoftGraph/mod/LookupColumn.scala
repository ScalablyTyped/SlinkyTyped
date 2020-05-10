package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupColumn extends js.Object {
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleValues: js.UndefOr[Boolean] = js.native
  // Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
  var allowUnlimitedLength: js.UndefOr[Boolean] = js.native
  // The name of the lookup source column.
  var columnName: js.UndefOr[String] = js.native
  // The unique identifier of the lookup source list.
  var listId: js.UndefOr[String] = js.native
  /**
    * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the
    * primary lookup. Use the list item looked up by the primary as the source for the column named here.
    */
  var primaryLookupColumnId: js.UndefOr[String] = js.native
}

object LookupColumn {
  @scala.inline
  def apply(): LookupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupColumn]
  }
  @scala.inline
  implicit class LookupColumnOps[Self <: LookupColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleValues")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnlimitedLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnlimitedLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnlimitedLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnlimitedLength")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLookupColumnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLookupColumnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLookupColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLookupColumnId")(js.undefined)
        ret
    }
  }
  
}

