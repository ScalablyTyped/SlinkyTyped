package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionAlignment extends js.Object

/**
  * Lists values specifying how a floating object is vertically aligned relative to the specified element.
  */
@JSGlobal("FloatingObjectVerticalPositionAlignment")
@js.native
object FloatingObjectVerticalPositionAlignment extends js.Object {
  /**
    * The shape is aligned to the bottom relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Bottom extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is centered relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Center extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned inside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Inside extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is not vertically aligned.
    */
  @js.native
  sealed trait None extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned outside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Outside extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is top aligned relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Top extends FloatingObjectVerticalPositionAlignment
  
  /* 3 */ val Bottom: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Bottom with Double = js.native
  /* 2 */ val Center: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Center with Double = js.native
  /* 4 */ val Inside: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Inside with Double = js.native
  /* 0 */ val None: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.None with Double = js.native
  /* 5 */ val Outside: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Outside with Double = js.native
  /* 1 */ val Top: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionAlignment with Double] = js.native
}

