package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlPosition extends StObject
/**
  * Identifiers used to specify the placement of controls on the map. Controls
  * are positioned relative to other controls in the same layout position.
  * Controls that are added first are positioned closer to the edge of the map.
  */
@JSGlobal("google.maps.ControlPosition")
@js.native
object ControlPosition extends StObject {
  
  /** Elements are positioned in the center of the bottom row. */
  @js.native
  sealed trait BOTTOM_CENTER extends ControlPosition
  
  /**
    * Elements are positioned in the bottom left and flow towards the middle.
    * Elements are positioned to the right of the Google logo.
    */
  @js.native
  sealed trait BOTTOM_LEFT extends ControlPosition
  
  /**
    * Elements are positioned in the bottom right and flow towards the middle.
    * Elements are positioned to the left of the copyrights.
    */
  @js.native
  sealed trait BOTTOM_RIGHT extends ControlPosition
  
  /**
    * Elements are positioned on the left, above bottom-left elements, and flow
    * upwards.
    */
  @js.native
  sealed trait LEFT_BOTTOM extends ControlPosition
  
  /** Elements are positioned in the center of the left side. */
  @js.native
  sealed trait LEFT_CENTER extends ControlPosition
  
  /**
    * Elements are positioned on the left, below top-left elements, and flow
    * downwards.
    */
  @js.native
  sealed trait LEFT_TOP extends ControlPosition
  
  /**
    * Elements are positioned on the right, above bottom-right elements, and
    * flow upwards.
    */
  @js.native
  sealed trait RIGHT_BOTTOM extends ControlPosition
  
  /** Elements are positioned in the center of the right side. */
  @js.native
  sealed trait RIGHT_CENTER extends ControlPosition
  
  /** Elements are positioned on the right, below top-right elements, and flow downwards. */
  @js.native
  sealed trait RIGHT_TOP extends ControlPosition
  
  /** Elements are positioned in the center of the top row. */
  @js.native
  sealed trait TOP_CENTER extends ControlPosition
  
  /** Elements are positioned in the top right and flow towards the middle. */
  @js.native
  sealed trait TOP_LEFT extends ControlPosition
  
  /** Elements are positioned in the top right and flow towards the middle. */
  @js.native
  sealed trait TOP_RIGHT extends ControlPosition
}
