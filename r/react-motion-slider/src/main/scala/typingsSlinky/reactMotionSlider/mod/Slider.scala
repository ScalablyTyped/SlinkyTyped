package typingsSlinky.reactMotionSlider.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider
  extends Component[SliderProps, js.Object, js.Any] {
  
  /**
    * Moves to next slide
    */
  def next(): Unit = js.native
  
  /**
    * Move to previous slide
    */
  def prev(): Unit = js.native
}
