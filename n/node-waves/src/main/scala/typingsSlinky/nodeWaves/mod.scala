package typingsSlinky.nodeWaves

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeWaves.anon.Delay
import typingsSlinky.nodeWaves.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-waves", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def attach(elements: ElementSelector): Unit = js.native
  def attach(elements: ElementSelector, classes: String): Unit = js.native
  def attach(elements: ElementSelector, classes: js.Array[String]): Unit = js.native
  
  def calm(elements: ElementSelector): Unit = js.native
  
  def init(): Unit = js.native
  def init(config: Delay): Unit = js.native
  
  def ripple(elements: ElementSelector): Unit = js.native
  def ripple(elements: ElementSelector, option: Position): Unit = js.native
  
  type ElementSelector = String | HTMLElement | js.Array[HTMLElement]
}
