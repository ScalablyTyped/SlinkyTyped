package typingsSlinky.atOracleOraclejet.ojnavigationlistMod

import typingsSlinky.atOracleOraclejet.Anon_AccessibleReorderAfterItem
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererSelectableBoolean
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icons
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.popup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.progressive
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: js.Any
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var edge: top | bottom | start | end
  var item: Anon_ContextRendererSelectableBoolean[K, D]
  var overflow: popup | hidden
  var reorderable: enabled | disabled
  var selection: js.Any
  @JSName("translations")
  var translations_ojTabBarSettableProperties: Anon_AccessibleReorderAfterItem
  var truncation: none | progressive
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: js.Any,
    display: all | icons,
    edge: top | bottom | start | end,
    item: Anon_ContextRendererSelectableBoolean[K, D],
    overflow: popup | hidden,
    reorderable: enabled | disabled,
    selection: js.Any,
    translations: Anon_AccessibleReorderAfterItem,
    truncation: none | progressive,
    data: DataProvider[K, D] = null
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], truncation = truncation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
}

