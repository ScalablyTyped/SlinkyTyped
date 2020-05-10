package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "SettingsLegacy"
//#region "ext internal"
@js.native
trait ExtSettings extends js.Object {
  var aTypes: js.Array[_] = js.native
  var afnFiltering: js.Array[_] = js.native
  var afnSortData: js.Object = js.native
  var aoFeatures: js.Array[_] = js.native
  var builder: String = js.native
  var classes: ExtClassesSettings = js.native
  var errMode: String = js.native
  var feature: js.Array[_] = js.native
  var iApiIndex: Double = js.native
  var internal: js.Object = js.native
  var legacy: js.Object = js.native
  var oApi: js.Object = js.native
  var oJUIClasses: js.Object = js.native
  var oPagination: js.Object = js.native
  var oSort: js.Object = js.native
  var oStdClasses: ExtClassesSettings = js.native
  var ofnSearch: js.Object = js.native
  var order: js.Object = js.native
  var pager: js.Object = js.native
  var renderer: js.Object = js.native
  var sVersion: String = js.native
  var search: js.Array[_] = js.native
  var selector: js.Object = js.native
  /**
    * Type based plug-ins.
    */
  var `type`: ExtTypeSettings = js.native
  def fnVersionCheck(version: String): String = js.native
}

object ExtSettings {
  @scala.inline
  def apply(
    aTypes: js.Array[_],
    afnFiltering: js.Array[_],
    afnSortData: js.Object,
    aoFeatures: js.Array[_],
    builder: String,
    classes: ExtClassesSettings,
    errMode: String,
    feature: js.Array[_],
    fnVersionCheck: String => String,
    iApiIndex: Double,
    internal: js.Object,
    legacy: js.Object,
    oApi: js.Object,
    oJUIClasses: js.Object,
    oPagination: js.Object,
    oSort: js.Object,
    oStdClasses: ExtClassesSettings,
    ofnSearch: js.Object,
    order: js.Object,
    pager: js.Object,
    renderer: js.Object,
    sVersion: String,
    search: js.Array[_],
    selector: js.Object,
    `type`: ExtTypeSettings
  ): ExtSettings = {
    val __obj = js.Dynamic.literal(aTypes = aTypes.asInstanceOf[js.Any], afnFiltering = afnFiltering.asInstanceOf[js.Any], afnSortData = afnSortData.asInstanceOf[js.Any], aoFeatures = aoFeatures.asInstanceOf[js.Any], builder = builder.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], errMode = errMode.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], fnVersionCheck = js.Any.fromFunction1(fnVersionCheck), iApiIndex = iApiIndex.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], legacy = legacy.asInstanceOf[js.Any], oApi = oApi.asInstanceOf[js.Any], oJUIClasses = oJUIClasses.asInstanceOf[js.Any], oPagination = oPagination.asInstanceOf[js.Any], oSort = oSort.asInstanceOf[js.Any], oStdClasses = oStdClasses.asInstanceOf[js.Any], ofnSearch = ofnSearch.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pager = pager.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], sVersion = sVersion.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtSettings]
  }
  @scala.inline
  implicit class ExtSettingsOps[Self <: ExtSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withATypes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfnFiltering(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afnFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfnSortData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afnSortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAoFeatures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuilder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: ExtClassesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeature(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFnVersionCheck(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnVersionCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIApiIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iApiIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegacy(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOApi(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOJUIClasses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oJUIClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPagination(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOSort(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOStdClasses(value: ExtClassesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oStdClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfnSearch(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofnSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPager(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExtTypeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

