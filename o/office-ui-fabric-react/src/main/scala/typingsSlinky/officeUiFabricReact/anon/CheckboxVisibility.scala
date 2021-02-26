package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxVisibility extends StObject {
  
  var checkboxVisibility: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility = js.native
  
  var compact: Boolean = js.native
  
  var constrainMode: ConstrainMode = js.native
  
  var isHeaderVisible: Boolean = js.native
  
  var layoutMode: DetailsListLayoutMode = js.native
  
  var selectionMode: SelectionMode = js.native
  
  var useFastIcons: Boolean = js.native
}
object CheckboxVisibility {
  
  @scala.inline
  def apply(
    checkboxVisibility: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): CheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxVisibility]
  }
  
  @scala.inline
  implicit class CheckboxVisibilityMutableBuilder[Self <: CheckboxVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckboxVisibility(value: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainMode(value: ConstrainMode): Self = StObject.set(x, "constrainMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMode(value: DetailsListLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
  }
}
