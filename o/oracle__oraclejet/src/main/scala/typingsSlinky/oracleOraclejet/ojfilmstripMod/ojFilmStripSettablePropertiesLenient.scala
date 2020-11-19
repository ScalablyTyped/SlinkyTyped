package typingsSlinky.oracleOraclejet.ojfilmstripMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.Id
import typingsSlinky.oracleOraclejet.anon.LabelAccArrowNextPage
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilmstrip.ojFilmStripSettableProperties> */
@js.native
trait ojFilmStripSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var arrowPlacement: js.UndefOr[adjacent | overlay] = js.native
  
  var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.native
  
  var currentItem: js.UndefOr[Id] = js.native
  
  var looping: js.UndefOr[off | page] = js.native
  
  var maxItemsPerPage: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var translations: js.UndefOr[LabelAccArrowNextPage] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowPlacement(value: adjacent | overlay): Self = this.set("arrowPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowPlacement: Self = this.set("arrowPlacement", js.undefined)
    
    @scala.inline
    def setArrowVisibility(value: visible | hidden | hover | auto): Self = this.set("arrowVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowVisibility: Self = this.set("arrowVisibility", js.undefined)
    
    @scala.inline
    def setCurrentItem(value: Id): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentItem: Self = this.set("currentItem", js.undefined)
    
    @scala.inline
    def setLooping(value: off | page): Self = this.set("looping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    
    @scala.inline
    def setMaxItemsPerPage(value: Double): Self = this.set("maxItemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemsPerPage: Self = this.set("maxItemsPerPage", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelAccArrowNextPage): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
