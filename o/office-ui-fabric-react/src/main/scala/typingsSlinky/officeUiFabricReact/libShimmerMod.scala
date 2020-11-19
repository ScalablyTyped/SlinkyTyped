package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import typingsSlinky.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typingsSlinky.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typingsSlinky.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import typingsSlinky.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Shimmer", JSImport.Namespace)
@js.native
object libShimmerMod extends js.Object {
  
  val Shimmer: ReactComponentClass[IShimmerProps] = js.native
  
  val ShimmerCircle: ReactComponentClass[IShimmerCircleProps] = js.native
  
  val ShimmerCircleBase: ReactComponentClass[IShimmerCircleProps] = js.native
  
  val ShimmerElementsGroup: ReactComponentClass[IShimmerElementsGroupProps] = js.native
  
  val ShimmerElementsGroupBase: ReactComponentClass[IShimmerElementsGroupProps] = js.native
  
  val ShimmerGap: ReactComponentClass[IShimmerGapProps] = js.native
  
  val ShimmerGapBase: ReactComponentClass[IShimmerGapProps] = js.native
  
  val ShimmerLine: ReactComponentClass[IShimmerLineProps] = js.native
  
  val ShimmerLineBase: ReactComponentClass[IShimmerLineProps] = js.native
  
  @js.native
  class ShimmerBase protected ()
    extends typingsSlinky.officeUiFabricReact.shimmerMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  /* static members */
  @js.native
  object ShimmerBase extends js.Object {
    
    var defaultProps: IShimmerProps = js.native
  }
  
  @js.native
  object ShimmerElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType with Double] = js.native
    
    /* 2 */ val circle: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle with Double = js.native
    
    /* 3 */ val gap: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap with Double = js.native
    
    /* 1 */ val line: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line with Double = js.native
  }
  
  @js.native
  object ShimmerElementsDefaultHeights extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights with Double
      ] = js.native
    
    /* 24 */ val circle: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    
    /* 16 */ val gap: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    
    /* 16 */ val line: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
  }
}
