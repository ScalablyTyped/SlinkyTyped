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

@js.native
trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  var arrowPlacement: adjacent | overlay = js.native
  var arrowVisibility: visible | hidden | hover | auto = js.native
  var currentItem: AnonId = js.native
  var looping: off | page = js.native
  var maxItemsPerPage: Double = js.native
  var orientation: horizontal | vertical = js.native
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: AnonLabelAccArrowNextPage = js.native
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
  @scala.inline
  implicit class ojFilmStripSettablePropertiesOps[Self <: ojFilmStripSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowPlacement(value: adjacent | overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowVisibility(value: visible | hidden | hover | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentItem(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLooping(value: off | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxItemsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelAccArrowNextPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

