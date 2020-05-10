package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSelectorModifier extends js.Object {
  /**
    * The order modifier provides the ability to control which order the rows are processed in.
    * Values: 'current', 'applied', 'index',  'original'
    */
  var order: js.UndefOr[String] = js.native
  /**
    * The page modifier allows you to control if the selector should consider all data in the table, regardless of paging, or if only the rows in the currently disabled page should be used.
    * Values: 'all', 'current'
    */
  var page: js.UndefOr[String] = js.native
  /**
    * The search modifier provides the ability to govern which rows are used by the selector using the search options that are applied to the table.
    * Values: 'none', 'applied', 'removed'
    */
  var search: js.UndefOr[String] = js.native
  /**
    * The searchPlaceholder modifier provides the ability to provide informational text for an input control when it has no value.
    */
  var searchPlaceholder: js.UndefOr[String] = js.native
}

object ObjectSelectorModifier {
  @scala.inline
  def apply(): ObjectSelectorModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSelectorModifier]
  }
  @scala.inline
  implicit class ObjectSelectorModifierOps[Self <: ObjectSelectorModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
  }
  
}

