package typingsSlinky.glaze.styleInjectorMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/StyleInjector", "VirtualStyleInjector")
@js.native
class VirtualStyleInjector () extends StyleInjector {
  
  var cssTexts: js.Any = js.native
  
  def getStyleElement(): ReactElement = js.native
  
  def nullifyRule(): Unit = js.native
}
