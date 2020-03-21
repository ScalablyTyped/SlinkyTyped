package typingsSlinky.oracleOraclejet.ojfilmstripMod

import typingsSlinky.oracleOraclejet.AnonId
import typingsSlinky.oracleOraclejet.AnonLabelAccArrowNextPage
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
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

trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  var arrowPlacement: adjacent | overlay
  var arrowVisibility: visible | hidden | hover | auto
  var currentItem: AnonId
  var looping: off | page
  var maxItemsPerPage: Double
  var orientation: horizontal | vertical
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: AnonLabelAccArrowNextPage
}

object ojFilmStripSettableProperties {
  @scala.inline
  def apply(
    arrowPlacement: adjacent | overlay,
    arrowVisibility: visible | hidden | hover | auto,
    currentItem: AnonId,
    looping: off | page,
    maxItemsPerPage: Double,
    orientation: horizontal | vertical,
    translations: AnonLabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
}

