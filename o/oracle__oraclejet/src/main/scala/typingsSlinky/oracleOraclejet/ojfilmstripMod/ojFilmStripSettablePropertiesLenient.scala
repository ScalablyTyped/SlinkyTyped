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
@js.native
trait ojFilmStripSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var arrowPlacement: js.UndefOr[adjacent | overlay] = js.native
  var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.native
  var currentItem: js.UndefOr[AnonId] = js.native
  var looping: js.UndefOr[off | page] = js.native
  var maxItemsPerPage: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var translations: js.UndefOr[AnonLabelAccArrowNextPage] = js.native
}

object ojFilmStripSettablePropertiesLenient {
  @scala.inline
  def apply(): ojFilmStripSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojFilmStripSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojFilmStripSettablePropertiesLenientOps[Self <: ojFilmStripSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def withoutArrowPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowVisibility(value: visible | hidden | hover | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentItem(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLooping(value: off | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLooping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItemsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelAccArrowNextPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

