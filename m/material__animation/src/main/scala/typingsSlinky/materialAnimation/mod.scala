package typingsSlinky.materialAnimation

import org.scalajs.dom.raw.Window
import typingsSlinky.materialAnimation.typesMod.PrefixedCssPropertyName
import typingsSlinky.materialAnimation.typesMod.PrefixedJsEventType
import typingsSlinky.materialAnimation.typesMod.StandardCssPropertyName
import typingsSlinky.materialAnimation.typesMod.StandardJsEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/animation", "AnimationFrame")
  @js.native
  class AnimationFrame ()
    extends typingsSlinky.materialAnimation.animationframeMod.AnimationFrame
  
  @JSImport("@material/animation", "getCorrectEventName")
  @js.native
  def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = js.native
  
  @JSImport("@material/animation", "getCorrectPropertyName")
  @js.native
  def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = js.native
  
  object util {
    
    @JSImport("@material/animation", "util.getCorrectEventName")
    @js.native
    def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = js.native
    
    @JSImport("@material/animation", "util.getCorrectPropertyName")
    @js.native
    def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = js.native
  }
}
