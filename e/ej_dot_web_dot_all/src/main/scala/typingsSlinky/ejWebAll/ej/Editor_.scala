package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor_ extends Widget_ {
  
  var defaults: typingsSlinky.ejWebAll.ej.Editor.Model = js.native
  
  /** To disable the corresponding Editors
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the corresponding Editors
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To get value from corresponding Editors
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_Editor_ : typingsSlinky.ejWebAll.ej.Editor.Model = js.native
}
