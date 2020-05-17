package typingsSlinky.oracleOraclejet.ojnavigationlistMod

import typingsSlinky.oracleOraclejet.anon.DefaultRootLabel
import typingsSlinky.oracleOraclejet.anon.Selectable
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.collapsible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.popup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sliding
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNavigationListSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String = js.native
  var currentItem: K = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var drillMode: none | collapsible | sliding = js.native
  var edge: top | start = js.native
  var expanded: KeySet[K] = js.native
  var hierarchyMenuThreshold: Double = js.native
  var item: Selectable[K, D] = js.native
  var overflow: popup | hidden = js.native
  var rootLabel: String | Null = js.native
  var selection: K = js.native
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: DefaultRootLabel = js.native
}

object ojNavigationListSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    display: all | icons,
    drillMode: none | collapsible | sliding,
    edge: top | start,
    expanded: KeySet[K],
    hierarchyMenuThreshold: Double,
    item: Selectable[K, D],
    overflow: popup | hidden,
    selection: K,
    translations: DefaultRootLabel
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hierarchyMenuThreshold = hierarchyMenuThreshold.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojNavigationListSettablePropertiesOps[Self[k, d] <: ojNavigationListSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentItem(value: K): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: all | icons): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillMode(value: none | collapsible | sliding): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: top | start): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyMenuThreshold(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyMenuThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Selectable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: popup | hidden): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: K): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: DefaultRootLabel): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withRootLabel(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootLabelNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootLabel")(null)
        ret
    }
  }
  
}

