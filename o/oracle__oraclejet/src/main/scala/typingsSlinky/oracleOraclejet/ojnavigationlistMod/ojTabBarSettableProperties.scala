package typingsSlinky.oracleOraclejet.ojnavigationlistMod

import typingsSlinky.oracleOraclejet.anon.AccessibleReorderAfterItem
import typingsSlinky.oracleOraclejet.anon.RendererSelectable
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.popup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.progressive
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String = js.native
  var currentItem: js.Any = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var edge: top | bottom | start | end = js.native
  var item: RendererSelectable[K, D] = js.native
  var overflow: popup | hidden = js.native
  var reorderable: enabled | disabled = js.native
  var selection: js.Any = js.native
  @JSName("translations")
  var translations_ojTabBarSettableProperties: AccessibleReorderAfterItem = js.native
  var truncation: none | progressive = js.native
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: js.Any,
    display: all | icons,
    edge: top | bottom | start | end,
    item: RendererSelectable[K, D],
    overflow: popup | hidden,
    reorderable: enabled | disabled,
    selection: js.Any,
    translations: AccessibleReorderAfterItem,
    truncation: none | progressive
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], truncation = truncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojTabBarSettablePropertiesOps[Self[k, d] <: ojTabBarSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withCurrentItem(value: js.Any): Self[K, D] = {
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
    def withEdge(value: top | bottom | start | end): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: RendererSelectable[K, D]): Self[K, D] = {
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
    def withReorderable(value: enabled | disabled): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Any): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AccessibleReorderAfterItem): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncation(value: none | progressive): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncation")(value.asInstanceOf[js.Any])
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
  }
  
}

