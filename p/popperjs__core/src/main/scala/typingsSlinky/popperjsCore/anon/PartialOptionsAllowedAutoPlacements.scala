package typingsSlinky.popperjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.enumsMod.Boundary
import typingsSlinky.popperjsCore.enumsMod.RootBoundary
import typingsSlinky.popperjsCore.typesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/flip.Options> */
@js.native
trait PartialOptionsAllowedAutoPlacements extends StObject {
  
  var allowedAutoPlacements: js.UndefOr[js.Array[typingsSlinky.popperjsCore.enumsMod.Placement]] = js.native
  
  var altAxis: js.UndefOr[Boolean] = js.native
  
  var altBoundary: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[Boundary] = js.native
  
  var fallbackPlacements: js.UndefOr[js.Array[typingsSlinky.popperjsCore.enumsMod.Placement]] = js.native
  
  var flipVariations: js.UndefOr[Boolean] = js.native
  
  var mainAxis: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.native
}
object PartialOptionsAllowedAutoPlacements {
  
  @scala.inline
  def apply(): PartialOptionsAllowedAutoPlacements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAllowedAutoPlacements]
  }
  
  @scala.inline
  implicit class PartialOptionsAllowedAutoPlacementsMutableBuilder[Self <: PartialOptionsAllowedAutoPlacements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedAutoPlacements(value: js.Array[typingsSlinky.popperjsCore.enumsMod.Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
    
    @scala.inline
    def setAllowedAutoPlacementsVarargs(value: typingsSlinky.popperjsCore.enumsMod.Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value :_*))
    
    @scala.inline
    def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltAxisUndefined: Self = StObject.set(x, "altAxis", js.undefined)
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    @scala.inline
    def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryHTMLElement(value: HTMLElement): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPlacements(value: js.Array[typingsSlinky.popperjsCore.enumsMod.Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackPlacementsUndefined: Self = StObject.set(x, "fallbackPlacements", js.undefined)
    
    @scala.inline
    def setFallbackPlacementsVarargs(value: typingsSlinky.popperjsCore.enumsMod.Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value :_*))
    
    @scala.inline
    def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipVariationsUndefined: Self = StObject.set(x, "flipVariations", js.undefined)
    
    @scala.inline
    def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
