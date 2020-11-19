package typingsSlinky.heremaps.H.map.render

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.heremaps.H.util.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
  * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
  * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
  * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
  */
@js.native
trait RenderEngine extends EventTarget {
  
  /**
    * This method adds a listener for a specific event.
    * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
    * @param type {string} - The name of the event
    * @param handler {!Function} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - An object defining the scope for the handler function
    */
  def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event, Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit], opt_capture: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event, Unit],
    opt_capture: Boolean,
    opt_scope: js.Object
  ): Unit = js.native
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method removes a previously added listener from the EventTarget instance.
    * @param type {string} - The name of the event
    * @param handler {!Function} - A previously added event handler
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {Object=} - An object defining the scope for the handler function
    */
  def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event, Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit], opt_capture: Boolean): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: js.Function1[/* evt */ Event, Unit],
    opt_capture: Boolean,
    opt_scope: js.Object
  ): Unit = js.native
}
@JSGlobal("H.map.render.RenderEngine")
@js.native
object RenderEngine extends js.Object {
  
  @js.native
  sealed trait InteractionModifiers extends js.Object
  /**
    * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
    */
  @js.native
  object InteractionModifiers extends js.Object {
    
    /** changes incline angle during the interaction */
    @js.native
    sealed trait COORD extends InteractionModifiers
    
    /** changes map center during the interaction */
    @js.native
    sealed trait HEADING extends InteractionModifiers
    
    /** changes tilt angle during the interaction */
    @js.native
    sealed trait INCLINE extends InteractionModifiers
    
    /** changes heading angle during the interaction */
    @js.native
    sealed trait TILT extends InteractionModifiers
    
    /** changes zoom level during the interaction */
    @js.native
    sealed trait ZOOM extends InteractionModifiers
  }
  
  /**
    * An object containing the render engine initialization options
    */
  type Options = StringDictionary[String]
}
