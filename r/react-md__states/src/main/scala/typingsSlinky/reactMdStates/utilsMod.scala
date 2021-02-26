package typingsSlinky.reactMdStates

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.anon.PickRippleEventHTMLElemen
import typingsSlinky.reactMdStates.anon.PickRippleEventHTMLElemenPageX
import typingsSlinky.reactMdStates.reactMdStatesStrings.currentTarget
import typingsSlinky.reactMdStates.reactMdStatesStrings.target
import typingsSlinky.reactMdStates.typesMod.RippleEvent
import typingsSlinky.reactMdStates.typesMod.RippleState
import typingsSlinky.reactMdStates.typesMod.RippleType
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/states/types/ripples/utils", "createRippleState")
  @js.native
  def createRippleState(event: RippleEvent[HTMLElement]): RippleState = js.native
  
  @JSImport("@react-md/states/types/ripples/utils", "getOrigin")
  @js.native
  def getOrigin(event: PickRippleEventHTMLElemenPageX, element: HTMLElement): Origin = js.native
  
  @JSImport("@react-md/states/types/ripples/utils", "getType")
  @js.native
  def getType(event: PickRippleEventHTMLElemen): RippleType = js.native
  
  @JSImport("@react-md/states/types/ripples/utils", "isBubbled")
  @js.native
  def isBubbled[E /* <: HTMLElement */](event: Pick[RippleEvent[E], currentTarget | target]): Boolean = js.native
  
  @JSImport("@react-md/states/types/ripples/utils", "isRippleable")
  @js.native
  def isRippleable(event: RippleEvent[HTMLElement], disableSpacebarClick: Boolean): Boolean = js.native
  
  @js.native
  trait Origin extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Origin {
    
    @scala.inline
    def apply(x: Double, y: Double): Origin = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origin]
    }
    
    @scala.inline
    implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
