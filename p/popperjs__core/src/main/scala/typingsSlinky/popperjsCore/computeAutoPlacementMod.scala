package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.anon.PartialStateAttributes
import typingsSlinky.popperjsCore.enumsMod.Boundary
import typingsSlinky.popperjsCore.enumsMod.ComputedPlacement
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.enumsMod.RootBoundary
import typingsSlinky.popperjsCore.typesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeAutoPlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/computeAutoPlacement", JSImport.Default)
  @js.native
  def default(state: PartialStateAttributes): js.Array[ComputedPlacement] = js.native
  @JSImport("@popperjs/core/lib/utils/computeAutoPlacement", JSImport.Default)
  @js.native
  def default(state: PartialStateAttributes, options: Options): js.Array[ComputedPlacement] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowedAutoPlacements: js.UndefOr[js.Array[Placement]] = js.native
    
    var boundary: Boundary = js.native
    
    var flipVariations: Boolean = js.native
    
    var padding: Padding = js.native
    
    var placement: Placement = js.native
    
    var rootBoundary: RootBoundary = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      boundary: Boundary,
      flipVariations: Boolean,
      padding: Padding,
      placement: Placement,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], flipVariations = flipVariations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedAutoPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
      
      @scala.inline
      def setAllowedAutoPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value :_*))
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryHTMLElement(value: HTMLElement): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
      
      @scala.inline
      def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
