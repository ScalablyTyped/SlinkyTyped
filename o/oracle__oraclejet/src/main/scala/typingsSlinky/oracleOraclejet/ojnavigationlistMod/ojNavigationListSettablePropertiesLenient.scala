package typingsSlinky.oracleOraclejet.ojnavigationlistMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonDefaultRootLabel
import typingsSlinky.oracleOraclejet.AnonSelectable
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojNavigationListSettableProperties<K, D>> */
trait ojNavigationListSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.undefined
  var currentItem: js.UndefOr[K] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var display: js.UndefOr[all | icons] = js.undefined
  var drillMode: js.UndefOr[none | collapsible | sliding] = js.undefined
  var edge: js.UndefOr[top | start] = js.undefined
  var expanded: js.UndefOr[KeySet[K]] = js.undefined
  var hierarchyMenuThreshold: js.UndefOr[Double] = js.undefined
  var item: js.UndefOr[AnonSelectable[K, D]] = js.undefined
  var overflow: js.UndefOr[popup | hidden] = js.undefined
  var rootLabel: js.UndefOr[String] = js.undefined
  var selection: js.UndefOr[K] = js.undefined
  var translations: js.UndefOr[AnonDefaultRootLabel] = js.undefined
}

object ojNavigationListSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: String = null,
    currentItem: K = null,
    data: DataProvider[K, D] = null,
    display: all | icons = null,
    drillMode: none | collapsible | sliding = null,
    edge: top | start = null,
    expanded: KeySet[K] = null,
    hierarchyMenuThreshold: Int | Double = null,
    item: AnonSelectable[K, D] = null,
    overflow: popup | hidden = null,
    rootLabel: String = null,
    selection: K = null,
    translations: AnonDefaultRootLabel = null
  ): ojNavigationListSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (drillMode != null) __obj.updateDynamic("drillMode")(drillMode.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (hierarchyMenuThreshold != null) __obj.updateDynamic("hierarchyMenuThreshold")(hierarchyMenuThreshold.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (rootLabel != null) __obj.updateDynamic("rootLabel")(rootLabel.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettablePropertiesLenient[K, D]]
  }
}

