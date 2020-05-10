package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var border: js.UndefOr[Boolean] = js.native
  var cascadeCheck: js.UndefOr[Boolean] = js.native
  var cascadeSelection: js.UndefOr[Boolean] = js.native
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String, _]
  ] = js.native
  var checkboxes: js.UndefOr[Boolean] = js.native
  var checkedField: js.UndefOr[String] = js.native
  var childrenField: js.UndefOr[String] = js.native
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var disabledField: js.UndefOr[String] = js.native
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var hasChildrenField: js.UndefOr[String] = js.native
  var icons: js.UndefOr[TreeIcons] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var imageCssClassField: js.UndefOr[String] = js.native
  var imageHtmlField: js.UndefOr[String] = js.native
  var imageUrlField: js.UndefOr[String] = js.native
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var lazyLoading: js.UndefOr[Boolean] = js.native
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, _]
  ] = js.native
  var paramNames: js.UndefOr[TreeParamNames] = js.native
  var primaryKey: js.UndefOr[String] = js.native
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var selectionType: js.UndefOr[String] = js.native
  var textField: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TreeSettings {
  @scala.inline
  def apply(): TreeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSettings]
  }
  @scala.inline
  implicit class TreeSettingsOps[Self <: TreeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxChange(value: (/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCheckboxChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxes")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedField")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenField")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: /* e */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroying(value: /* e */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroying")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildrenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildrenField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChildrenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildrenField")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: TreeIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsLibrary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCssClassField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCssClassField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCssClassField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCssClassField")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHtmlField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHtmlField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHtmlField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHtmlField")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrlField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrlField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlField")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialized(value: /* e */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDataBound(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDataBound")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNodeDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDrop(value: (/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDrop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutNodeDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withParamNames(value: TreeParamNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTextField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(js.undefined)
        ret
    }
    @scala.inline
    def withUiLibrary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

