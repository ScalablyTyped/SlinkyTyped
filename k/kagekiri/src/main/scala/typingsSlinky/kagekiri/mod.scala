package typingsSlinky.kagekiri

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kagekiri", "querySelector")
  @js.native
  def querySelector(selector: String): HTMLElement | Null = js.native
  @JSImport("kagekiri", "querySelector")
  @js.native
  def querySelector(selector: String, context: Node): HTMLElement | Null = js.native
  
  @JSImport("kagekiri", "querySelectorAll")
  @js.native
  def querySelectorAll(selector: String): NodeList = js.native
  @JSImport("kagekiri", "querySelectorAll")
  @js.native
  def querySelectorAll(selector: String, context: Node): NodeList = js.native
}
