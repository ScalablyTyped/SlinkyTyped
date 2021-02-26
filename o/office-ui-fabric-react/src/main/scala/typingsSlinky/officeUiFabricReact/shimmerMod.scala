package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import typingsSlinky.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typingsSlinky.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typingsSlinky.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import typingsSlinky.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "Shimmer")
  @js.native
  val Shimmer: ReactComponentClass[IShimmerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase")
  @js.native
  class ShimmerBase protected ()
    extends typingsSlinky.officeUiFabricReact.shimmerBaseMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  /* static members */
  object ShimmerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase.defaultProps")
    @js.native
    def defaultProps: IShimmerProps = js.native
    @scala.inline
    def defaultProps_=(x: IShimmerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerCircle")
  @js.native
  val ShimmerCircle: ReactComponentClass[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerCircleBase")
  @js.native
  val ShimmerCircleBase: ReactComponentClass[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementType")
  @js.native
  object ShimmerElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType with Double] = js.native
    
    /* 2 */ val circle: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle with Double = js.native
    
    /* 3 */ val gap: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap with Double = js.native
    
    /* 1 */ val line: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsDefaultHeights")
  @js.native
  object ShimmerElementsDefaultHeights extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights with Double
      ] = js.native
    
    /* 24 */ val circle: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    
    /* 16 */ val gap: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    
    /* 16 */ val line: typingsSlinky.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsGroup")
  @js.native
  val ShimmerElementsGroup: ReactComponentClass[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsGroupBase")
  @js.native
  val ShimmerElementsGroupBase: ReactComponentClass[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerGap")
  @js.native
  val ShimmerGap: ReactComponentClass[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerGapBase")
  @js.native
  val ShimmerGapBase: ReactComponentClass[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerLine")
  @js.native
  val ShimmerLine: ReactComponentClass[IShimmerLineProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerLineBase")
  @js.native
  val ShimmerLineBase: ReactComponentClass[IShimmerLineProps] = js.native
}
