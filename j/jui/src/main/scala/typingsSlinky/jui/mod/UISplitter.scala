package typingsSlinky.jui.mod

import typingsSlinky.jui.anon.BarSize
import typingsSlinky.jui.juiStrings.horizontal
import typingsSlinky.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UISplitter extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: BarSize): this.type = js.native
  
  @JSName("setDirection")
  def setDirection_horizontal(d: horizontal): Unit = js.native
  @JSName("setDirection")
  def setDirection_vertical(d: vertical): Unit = js.native
  
  def setHide(index: Double): Unit = js.native
  
  def setInitSize(size: Double): Unit = js.native
  
  def setShow(index: Double): Unit = js.native
  
  def toggle(index: Double): Unit = js.native
}
