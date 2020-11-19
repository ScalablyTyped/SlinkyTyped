package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sparkline_ extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Sparkline_ : Model = js.native
  
  /** Redraws the entire sparkline. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
