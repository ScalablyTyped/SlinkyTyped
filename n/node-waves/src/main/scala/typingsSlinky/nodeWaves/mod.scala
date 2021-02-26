package typingsSlinky.nodeWaves

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeWaves.anon.Delay
import typingsSlinky.nodeWaves.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-waves", "attach")
  @js.native
  def attach(elements: ElementSelector): Unit = js.native
  @JSImport("node-waves", "attach")
  @js.native
  def attach(elements: ElementSelector, classes: String): Unit = js.native
  @JSImport("node-waves", "attach")
  @js.native
  def attach(elements: ElementSelector, classes: js.Array[String]): Unit = js.native
  
  @JSImport("node-waves", "calm")
  @js.native
  def calm(elements: ElementSelector): Unit = js.native
  
  @JSImport("node-waves", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("node-waves", "init")
  @js.native
  def init(config: Delay): Unit = js.native
  
  @JSImport("node-waves", "ripple")
  @js.native
  def ripple(elements: ElementSelector): Unit = js.native
  @JSImport("node-waves", "ripple")
  @js.native
  def ripple(elements: ElementSelector, option: Position): Unit = js.native
  
  type ElementSelector = String | HTMLElement | js.Array[HTMLElement]
}
