package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBox_ extends Widget_ {
  var defaults: typingsSlinky.ejWebAll.ej.CheckBox.Model = js.native
  @JSName("model")
  var model_CheckBox_ : typingsSlinky.ejWebAll.ej.CheckBox.Model = js.native
  /** Disable the CheckBox to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the CheckBox
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To Check the status of CheckBox
    * @returns {boolean}
    */
  def isChecked(): Boolean = js.native
}

