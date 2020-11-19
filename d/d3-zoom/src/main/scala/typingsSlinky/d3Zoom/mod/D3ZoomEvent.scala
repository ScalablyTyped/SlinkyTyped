package typingsSlinky.d3Zoom.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Zoom.d3ZoomStrings.end
import typingsSlinky.d3Zoom.d3ZoomStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D3ZoomEvent[ZoomRefElement /* <: Element */, Datum] extends js.Object {
  
  /**
    * The underlying input event, such as mousemove or touchmove.
    */
  var sourceEvent: js.Any = js.native
  
  /**
    * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
    * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
    * and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
    *
    * @param selection A D3 selection of elements.
    * @param args Optional arguments to be passed in.
    */
  /**
    * The ZoomBehavior associated with the event
    */
  def target(selection: Selection_[ZoomRefElement, Datum, _, _], args: js.Any*): Unit = js.native
  /**
    * The ZoomBehavior associated with the event
    */
  @JSName("target")
  var target_Original: ZoomBehavior[ZoomRefElement, Datum] = js.native
  
   // Leave failsafe string type for cases like 'zoom.foo'
  /**
    * The current zoom transform
    */
  var transform: ZoomTransform_ = js.native
  
  /**
    * The event type for the zoom event
    */
  var `type`: start | typingsSlinky.d3Zoom.d3ZoomStrings.zoom | end | String = js.native
}
