package typingsSlinky.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData extends js.Object {
  var Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any = js.native
  var DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any = js.native
  var Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any = js.native
  var Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any = js.native
  var Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any = js.native
  var Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any = js.native
  var Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any = js.native
}

object AnonData {
  @scala.inline
  def apply(
    Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any,
    DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any,
    Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any,
    Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any,
    Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any,
    Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any,
    Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any
  ): AnonData = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DraggableHeader = DraggableHeader.asInstanceOf[js.Any], Editors = Editors.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Formatters = Formatters.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
  @scala.inline
  implicit class AnonDataOps[Self <: AnonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggableHeader(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DraggableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditors(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Editors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

