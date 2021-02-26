package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.openseadragon.anon.Buttons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "ButtonGroup")
@js.native
class ButtonGroup protected () extends StObject {
  def this(options: Buttons) = this()
  
  var buttons: js.Array[Button] = js.native
  
  var element: Element = js.native
  
  var tracker: MouseTracker = js.native
}
