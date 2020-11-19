package typingsSlinky.openlayers.mod.interaction

import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.olx.interaction.KeyboardZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Allows the user to zoom the map using keyboard + and -.
  * Note that, although this interaction is by default included in maps,
  * the keys can only be used when browser focus is on the element to which
  * the keyboard events are attached. By default, this is the map div,
  * though you can change this with the `keyboardEventTarget` in
  * {@link ol.Map}. `document` never loses focus but, for any other element,
  * focus will have to be on, and returned to, this element if the keys are to
  * function.
  * See also {@link ol.interaction.KeyboardPan}.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.KeyboardZoom")
@js.native
/**
  * @classdesc
  * Allows the user to zoom the map using keyboard + and -.
  * Note that, although this interaction is by default included in maps,
  * the keys can only be used when browser focus is on the element to which
  * the keyboard events are attached. By default, this is the map div,
  * though you can change this with the `keyboardEventTarget` in
  * {@link ol.Map}. `document` never loses focus but, for any other element,
  * focus will have to be on, and returned to, this element if the keys are to
  * function.
  * See also {@link ol.interaction.KeyboardPan}.
  *
  * @param opt_options Options.
  * @api stable
  */
class KeyboardZoom () extends Interaction {
  def this(opt_options: KeyboardZoomOptions) = this()
}
/* static members */
@JSImport("openlayers", "interaction.KeyboardZoom")
@js.native
object KeyboardZoom extends js.Object {
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
    * `KeyEvent`, and decides whether to zoom in or out (depending on whether the
    * key pressed was '+' or '-').
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = js.native
}
