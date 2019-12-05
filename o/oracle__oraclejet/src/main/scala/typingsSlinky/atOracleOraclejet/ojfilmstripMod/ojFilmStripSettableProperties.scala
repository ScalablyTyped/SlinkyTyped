package typingsSlinky.atOracleOraclejet.ojfilmstripMod

import typingsSlinky.atOracleOraclejet.Anon_Id
import typingsSlinky.atOracleOraclejet.Anon_LabelAccArrowNextPage
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.adjacent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hover
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.overlay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.page
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  var arrowPlacement: adjacent | overlay
  var arrowVisibility: visible | hidden | hover | auto
  var currentItem: Anon_Id
  var looping: off | page
  var maxItemsPerPage: Double
  var orientation: horizontal | vertical
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: Anon_LabelAccArrowNextPage
}

object ojFilmStripSettableProperties {
  @scala.inline
  def apply(
    arrowPlacement: adjacent | overlay,
    arrowVisibility: visible | hidden | hover | auto,
    currentItem: Anon_Id,
    looping: off | page,
    maxItemsPerPage: Double,
    orientation: horizontal | vertical,
    translations: Anon_LabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
}

