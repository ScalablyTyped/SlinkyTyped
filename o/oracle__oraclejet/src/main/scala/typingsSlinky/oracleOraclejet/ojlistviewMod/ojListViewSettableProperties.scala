package typingsSlinky.oracleOraclejet.ojlistviewMod

import typingsSlinky.oracleOraclejet.AnonAccessibleNavigateSkipItems
import typingsSlinky.oracleOraclejet.AnonDragDrop
import typingsSlinky.oracleOraclejet.AnonFetchSize
import typingsSlinky.oracleOraclejet.AnonFocusable
import typingsSlinky.oracleOraclejet.AnonKey
import typingsSlinky.oracleOraclejet.AnonOffsetX
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.collapsible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.static
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojListViewSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String = js.native
  var currentItem: K = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: AnonDragDrop = js.native
  var drillMode: collapsible | none = js.native
  var expanded: KeySet[K] = js.native
  val firstSelectedItem: AnonKey[K, D] = js.native
  var groupHeaderPosition: static | sticky = js.native
  var item: AnonFocusable[K, D] = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: AnonFetchSize = js.native
  var scrollPosition: AnonOffsetX[K] = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojListViewSettableProperties: AnonAccessibleNavigateSkipItems = js.native
}

object ojListViewSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    data: DataProvider[K, D],
    dnd: AnonDragDrop,
    drillMode: collapsible | none,
    expanded: KeySet[K],
    firstSelectedItem: AnonKey[K, D],
    groupHeaderPosition: static | sticky,
    item: AnonFocusable[K, D],
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: AnonFetchSize,
    scrollPosition: AnonOffsetX[K],
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    selectionRequired: Boolean,
    translations: AnonAccessibleNavigateSkipItems
  ): ojListViewSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], firstSelectedItem = firstSelectedItem.asInstanceOf[js.Any], groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojListViewSettablePropertiesOps[Self[k, d] <: ojListViewSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: AnonDragDrop): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillMode(value: collapsible | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstSelectedItem(value: AnonKey[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupHeaderPosition(value: static | sticky): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: AnonFocusable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicy(value: auto | loadMoreOnScroll): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicyOptions(value: AnonFetchSize): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: AnonOffsetX[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | single | multiple): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionRequired(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonAccessibleNavigateSkipItems): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

