package typingsSlinky.materialAnimation

import org.scalajs.dom.raw.Window
import typingsSlinky.materialAnimation.typesMod.PrefixedCssPropertyName
import typingsSlinky.materialAnimation.typesMod.PrefixedJsEventType
import typingsSlinky.materialAnimation.typesMod.StandardCssPropertyName
import typingsSlinky.materialAnimation.typesMod.StandardJsEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/animation/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = js.native
  
  def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = js.native
}
