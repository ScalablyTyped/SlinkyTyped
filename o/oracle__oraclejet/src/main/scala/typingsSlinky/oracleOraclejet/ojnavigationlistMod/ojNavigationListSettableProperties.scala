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

trait ojNavigationListSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: K
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var drillMode: none | collapsible | sliding
  var edge: top | start
  var expanded: KeySet[K]
  var hierarchyMenuThreshold: Double
  var item: Selectable[K, D]
  var overflow: popup | hidden
  var rootLabel: String | Null
  var selection: K
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: DefaultRootLabel
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
    translations: DefaultRootLabel,
    data: DataProvider[K, D] = null,
    rootLabel: String = null
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hierarchyMenuThreshold = hierarchyMenuThreshold.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rootLabel = rootLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
}

