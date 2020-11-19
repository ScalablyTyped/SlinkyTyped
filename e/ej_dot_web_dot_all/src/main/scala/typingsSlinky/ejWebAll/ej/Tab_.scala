package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab_ extends Widget_ {
  
  /** Add new tab items with given name, URL and given index position, if index null itâ€™s add last item.
    * @param {string} URL name / tab id.
    * @param {string} Tab Display name.
    * @param {number} Index position to placed , this is optional.
    * @param {string} specifies cssClass, this is optional.
    * @param {string} specifies id of tab, this is optional.
    * @returns {void}
    */
  def addItem(URL: String, displayLabel: String, index: Double, cssClass: String, id: String): Unit = js.native
  
  var defaults: typingsSlinky.ejWebAll.ej.Tab.Model = js.native
  
  /** To disable the tab control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the tab control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** This function get the number of tab rendered
    * @returns {number}
    */
  def getItemsCount(): Double = js.native
  
  /** This function hides the tab control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** This function hides the specified item tab in tab control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def hideItem(index: Double): Unit = js.native
  
  @JSName("model")
  var model_Tab_ : typingsSlinky.ejWebAll.ej.Tab.Model = js.native
  
  /** Remove the given index tab item.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
  
  /** This function is to show the tab control.
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** This function helps to show the specified hidden tab item in tab control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def showItem(index: Double): Unit = js.native
}
