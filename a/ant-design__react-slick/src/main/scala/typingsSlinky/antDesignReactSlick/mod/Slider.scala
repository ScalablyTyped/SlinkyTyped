package typingsSlinky.antDesignReactSlick.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider
  extends Component[Settings, scala.Nothing, js.Any] {
  
  def slickGoTo(slideNumber: Double): Unit = js.native
  def slickGoTo(slideNumber: Double, dontAnimate: Boolean): Unit = js.native
  
  def slickNext(): Unit = js.native
  
  def slickPause(): Unit = js.native
  
  def slickPlay(): Unit = js.native
  
  def slickPrev(): Unit = js.native
}
