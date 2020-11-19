package typingsSlinky.jui.mod

import typingsSlinky.jui.anon.Animated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIProgress extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Animated): this.type = js.native
  
  def getValue(): Double = js.native
  
  def setAnimated(isAnimated: Boolean): Unit = js.native
  
  def setStriped(isStriped: Boolean): Unit = js.native
  
  def setValue(v: Double): Unit = js.native
}
