package typingsSlinky.ngTable.publicInterfacesMod

import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableInputAttributes extends IAttributes {
  var disableFilter: js.UndefOr[String] = js.native
  var ngTable: js.UndefOr[String] = js.native
  var ngTableDynamic: js.UndefOr[String] = js.native
  var showFilter: js.UndefOr[String] = js.native
  var showGroup: js.UndefOr[String] = js.native
  var templateHeader: js.UndefOr[String] = js.native
  var templatePagination: js.UndefOr[String] = js.native
}

object ITableInputAttributes {
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit
  ): ITableInputAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
    __obj.asInstanceOf[ITableInputAttributes]
  }
  @scala.inline
  implicit class ITableInputAttributesOps[Self <: ITableInputAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNgTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngTable")(js.undefined)
        ret
    }
    @scala.inline
    def withNgTableDynamic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngTableDynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgTableDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngTableDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplatePagination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatePagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatePagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatePagination")(js.undefined)
        ret
    }
  }
  
}

