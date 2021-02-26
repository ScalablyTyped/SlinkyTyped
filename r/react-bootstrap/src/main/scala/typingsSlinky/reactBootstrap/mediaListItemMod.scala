package typingsSlinky.reactBootstrap

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaListItemMod {
  
  @JSImport("react-bootstrap/lib/MediaListItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaListItemProps, js.Object, js.Any]
  
  @js.native
  trait MediaListItem
    extends Component[MediaListItemProps, js.Object, js.Any]
  
  @js.native
  trait MediaListItemProps extends HTMLProps[MediaListItem] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object MediaListItemProps {
    
    @scala.inline
    def apply(): MediaListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListItemProps]
    }
    
    @scala.inline
    implicit class MediaListItemPropsMutableBuilder[Self <: MediaListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
