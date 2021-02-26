package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseAllVisibility extends StObject {
  
  var collapseAllVisibility: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility = js.native
  
  var selectAllVisibility: SelectAllVisibility = js.native
  
  var useFastIcons: Boolean = js.native
}
object CollapseAllVisibility {
  
  @scala.inline
  def apply(
    collapseAllVisibility: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): CollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseAllVisibility]
  }
  
  @scala.inline
  implicit class CollapseAllVisibilityMutableBuilder[Self <: CollapseAllVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseAllVisibility(value: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllVisibility(value: SelectAllVisibility): Self = StObject.set(x, "selectAllVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
  }
}
