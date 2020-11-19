package typingsSlinky.officeUiFabricReact.panelTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PanelType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.types", "PanelType")
@js.native
object PanelType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PanelType with Double] = js.native
  
  /**
    * Renders the Panel in `custom` size using `customWidth`, anchored to the far side (right in LTR mode).
    * - Has a fixed width provided by the `customWidth` prop
    * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
    * taking up 100% of the viewport width
    */
  @js.native
  sealed trait custom extends PanelType
  /* 7 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /**
    * Renders the Panel in `custom` size using `customWidth`, anchored to the near side (left in LTR mode).
    * - Has a fixed width provided by the `customWidth` prop
    * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
    * taking up 100% of the viewport width
    */
  @js.native
  sealed trait customNear extends PanelType
  /* 8 */ @js.native
  object customNear extends TopLevel[customNear with Double]
  
  /**
    * Renders the Panel in `extra large` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): adapts to `PanelType.large` at this breakpoint
    * - XXLarge (1366-1919): 176px fixed left margin, fluid width, 40px left/right padding
    * - XXXLarge (1920-up): 176px fixed left margin, fluid width, 40px left/right padding
    */
  @js.native
  sealed trait extraLarge extends PanelType
  /* 6 */ @js.native
  object extraLarge extends TopLevel[extraLarge with Double]
  
  /**
    * Renders the Panel in `large` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639):  adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
    * - XXLarge (1366-up): 428px fixed left margin, fluid width, 40px left/right padding
    */
  @js.native
  sealed trait large extends PanelType
  /* 4 */ @js.native
  object large extends TopLevel[large with Double]
  
  /**
    * Renders the Panel in `large` size, anchored to the far side (right in LTR mode), with a fixed width at
    * XX-Large breakpoint.
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
    * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
    * - XXLarge (1366-up): 940px width, 40px left/right padding
    */
  @js.native
  sealed trait largeFixed extends PanelType
  /* 5 */ @js.native
  object largeFixed extends TopLevel[largeFixed with Double]
  
  /**
    * Renders the Panel in `medium` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
    * - Large (640-1023): 592px width, 32px left/right padding
    * - XLarge (1024-1365): 644px width, 32px left/right padding
    * - XXLarge (1366-up): 644px width, 40px left/right padding
    */
  @js.native
  sealed trait medium extends PanelType
  /* 3 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /**
    * Renders the Panel in fixed-width `small` size, anchored to the far side (right in LTR mode).
    * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
    * - Medium (480-639): 340px width, 16px left/right padding
    * - Large (640-1023): 340px width, 32px left/right padding
    * - XLarge (1024-1365): 340px width, 32px left/right padding
    * - XXLarge (1366-up): 340px width, 40px left/right padding
    */
  @js.native
  sealed trait smallFixedFar extends PanelType
  /* 1 */ @js.native
  object smallFixedFar extends TopLevel[smallFixedFar with Double]
  
  /**
    * Renders the Panel in fixed-width `small` size, anchored to the near side (left in LTR mode).
    * - Small (320-479): 272px width, 16px left/right padding
    * - Medium (480-639): 272px width, 16px left/right padding
    * - Large (640-1023): 272px width, 32px left/right padding
    * - XLarge (1024-1365): 272px width, 32px left/right padding
    * - XXLarge (1366-up): 272px width, 40px left/right padding
    */
  @js.native
  sealed trait smallFixedNear extends PanelType
  /* 2 */ @js.native
  object smallFixedNear extends TopLevel[smallFixedNear with Double]
  
  /**
    * Renders the Panel with a `fluid` (full screen) width.
    * Recommended for use on small screen breakpoints.
    * - Small (320-479): full screen width, 16px left/right padding
    * - Medium (480-639): full screen width, 16px left/right padding
    * - Large (640-1023): full screen width, 32px left/right padding
    * - XLarge (1024-1365): full screen width, 32px left/right padding
    * - XXLarge (1366-up): full screen width, 40px left/right padding
    */
  @js.native
  sealed trait smallFluid extends PanelType
  /* 0 */ @js.native
  object smallFluid extends TopLevel[smallFluid with Double]
}
