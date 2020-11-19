package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar_ extends Widget_ {
  
  var defaults: typingsSlinky.ejWebAll.ej.ProgressBar.Model = js.native
  
  /** Disables the progressbar control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the progressbar control
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Returns the current progress value in percent.
    * @returns {number}
    */
  def getPercentage(): Double = js.native
  
  /** Returns the current progress value
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_ProgressBar_ : typingsSlinky.ejWebAll.ej.ProgressBar.Model = js.native
}
