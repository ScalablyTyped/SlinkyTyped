package typingsSlinky.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.Opacity
import typingsSlinky.oracleOraclejet.anon.`6`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.connected
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disjoint
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramNodeSettableProperties> */
@js.native
trait ojDiagramNodeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.native
  
  var icon: js.UndefOr[Opacity] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[js.Object | Null] = js.native
  
  var overview: js.UndefOr[`6`] = js.native
  
  var selectable: js.UndefOr[auto | off] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var showDisclosure: js.UndefOr[on | off] = js.native
}
object ojDiagramNodeSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojDiagramNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramNodeSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojDiagramNodeSettablePropertiesLenientOps[Self <: ojDiagramNodeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setDescendantsConnectivity(value: connected | disjoint | unknown): Self = this.set("descendantsConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescendantsConnectivity: Self = this.set("descendantsConnectivity", js.undefined)
    
    @scala.inline
    def setIcon(value: Opacity): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    
    @scala.inline
    def setOverview(value: `6`): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setSelectable(value: auto | off): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    
    @scala.inline
    def setShowDisclosure(value: on | off): Self = this.set("showDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDisclosure: Self = this.set("showDisclosure", js.undefined)
  }
}
