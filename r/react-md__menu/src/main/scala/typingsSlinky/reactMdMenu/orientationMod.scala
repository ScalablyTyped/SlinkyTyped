package typingsSlinky.reactMdMenu

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientationMod {
  
  @JSImport("@react-md/menu/types/Orientation", "OrientationProvider")
  @js.native
  val OrientationProvider: ReactComponentClass[OrientationProviderProps] = js.native
  
  @JSImport("@react-md/menu/types/Orientation", "useOrientation")
  @js.native
  def useOrientation(): MenuOrientation = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.horizontal
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.vertical
  */
  trait MenuOrientation extends StObject
  object MenuOrientation {
    
    @scala.inline
    def horizontal: typingsSlinky.reactMdMenu.reactMdMenuStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.reactMdMenu.reactMdMenuStrings.vertical = "vertical".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.vertical]
  }
  
  @js.native
  trait OrientationProviderProps extends StObject {
    
    var children: ReactElement = js.native
    
    var orientation: MenuOrientation = js.native
  }
  object OrientationProviderProps {
    
    @scala.inline
    def apply(orientation: MenuOrientation): OrientationProviderProps = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrientationProviderProps]
    }
    
    @scala.inline
    implicit class OrientationProviderPropsMutableBuilder[Self <: OrientationProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOrientation(value: MenuOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
}
