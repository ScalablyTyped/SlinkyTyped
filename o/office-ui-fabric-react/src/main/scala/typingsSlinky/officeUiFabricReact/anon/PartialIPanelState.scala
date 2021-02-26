package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
@js.native
trait PartialIPanelState extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var isFooterSticky: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[PanelVisibilityState] = js.native
}
object PartialIPanelState {
  
  @scala.inline
  def apply(): PartialIPanelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPanelState]
  }
  
  @scala.inline
  implicit class PartialIPanelStateMutableBuilder[Self <: PartialIPanelState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
    
    @scala.inline
    def setVisibility(value: PanelVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
