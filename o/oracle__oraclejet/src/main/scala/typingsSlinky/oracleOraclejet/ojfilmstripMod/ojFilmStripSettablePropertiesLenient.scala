package typingsSlinky.oracleOraclejet.ojfilmstripMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonId
import typingsSlinky.oracleOraclejet.AnonLabelAccArrowNextPage
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.adjacent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.page
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilmstrip.ojFilmStripSettableProperties> */
trait ojFilmStripSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var arrowPlacement: js.UndefOr[adjacent | overlay] = js.undefined
  var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.undefined
  var currentItem: js.UndefOr[AnonId] = js.undefined
  var looping: js.UndefOr[off | page] = js.undefined
  var maxItemsPerPage: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var translations: js.UndefOr[AnonLabelAccArrowNextPage] = js.undefined
}

object ojFilmStripSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    arrowPlacement: adjacent | overlay = null,
    arrowVisibility: visible | hidden | hover | auto = null,
    currentItem: AnonId = null,
    looping: off | page = null,
    maxItemsPerPage: Int | Double = null,
    orientation: horizontal | vertical = null,
    translations: AnonLabelAccArrowNextPage = null
  ): ojFilmStripSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrowPlacement != null) __obj.updateDynamic("arrowPlacement")(arrowPlacement.asInstanceOf[js.Any])
    if (arrowVisibility != null) __obj.updateDynamic("arrowVisibility")(arrowVisibility.asInstanceOf[js.Any])
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    if (looping != null) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (maxItemsPerPage != null) __obj.updateDynamic("maxItemsPerPage")(maxItemsPerPage.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilmStripSettablePropertiesLenient]
  }
}

