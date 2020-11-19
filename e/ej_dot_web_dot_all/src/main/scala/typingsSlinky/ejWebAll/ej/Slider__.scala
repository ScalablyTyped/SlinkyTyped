package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider__ extends Widget_ {
  
  var defaults: typingsSlinky.ejWebAll.ej.Slider_.Model = js.native
  
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_Slider__ : typingsSlinky.ejWebAll.ej.Slider_.Model = js.native
  
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}
