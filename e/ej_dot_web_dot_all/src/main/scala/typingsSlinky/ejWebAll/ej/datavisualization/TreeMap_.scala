package typingsSlinky.ejWebAll.ej.datavisualization

import typingsSlinky.ejWebAll.ej.Model
import typingsSlinky.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMap_ extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Method to drilldown the treemap.
    * @returns {void}
    */
  def drillDown(): Unit = js.native
  
  @JSName("model")
  var model_TreeMap_ : Model = js.native
  
  /** Method to reload treemap with updated values.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}
