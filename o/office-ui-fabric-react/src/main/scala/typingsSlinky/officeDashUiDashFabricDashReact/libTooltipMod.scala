package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.ITooltipProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`0`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`10`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`11`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`12`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`13`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`1`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`2`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`3`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`4`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`5`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`6`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`7`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`8`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`9`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Tooltip", JSImport.Namespace)
@js.native
object libTooltipMod extends js.Object {
  @js.native
  class TooltipBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipMod.TooltipBase
  
  @js.native
  class TooltipHostBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipMod.TooltipHostBase {
    def this(props: ITooltipHostProps) = this()
  }
  
  val Tooltip: ReactComponentClass[ITooltipProps] = js.native
  val TooltipHost: ReactComponentClass[ITooltipHostProps] = js.native
  @js.native
  object DirectionalHint extends js.Object {
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var bottomAutoEdge: `7` = js.native
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    var bottomCenter: `5` = js.native
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    var bottomLeftEdge: `4` = js.native
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    var bottomRightEdge: `6` = js.native
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    var leftBottomEdge: `10` = js.native
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    var leftCenter: `9` = js.native
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    var leftTopEdge: `8` = js.native
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    var rightBottomEdge: `13` = js.native
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    var rightCenter: `12` = js.native
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    var rightTopEdge: `11` = js.native
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var topAutoEdge: `3` = js.native
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    var topCenter: `1` = js.native
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    var topLeftEdge: `0` = js.native
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    var topRightEdge: `2` = js.native
  }
  
  /* static members */
  @js.native
  object TooltipBase extends js.Object {
    var defaultProps: Partial[ITooltipProps] = js.native
  }
  
  @js.native
  object TooltipDelay extends js.Object {
    /* 2 */ val long: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.long with Double = js.native
    /* 1 */ val medium: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.medium with Double = js.native
    /* 0 */ val zero: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay.zero with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TooltipHostBase extends js.Object {
    var _currentVisibleTooltip: js.Any = js.native
    var defaultProps: Anon_Delay = js.native
  }
  
  @js.native
  object TooltipOverflowMode extends js.Object {
    /* 0 */ val Parent: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Parent with Double = js.native
    /* 1 */ val Self: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode.Self with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.TooltipOverflowMode with Double
      ] = js.native
  }
  
}

