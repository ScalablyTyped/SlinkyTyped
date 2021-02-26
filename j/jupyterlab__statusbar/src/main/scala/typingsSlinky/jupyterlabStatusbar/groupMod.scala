package typingsSlinky.jupyterlabStatusbar

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components/group", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
    
    /**
      * Props for the GroupItem.
      */
    @js.native
    trait IProps extends StObject {
      
      /**
        * The items to arrange in a group.
        */
      var children: js.Array[ReactElement] = js.native
      
      /**
        * The spacing, in px, between the items in the goup.
        */
      var spacing: Double = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(children: js.Array[ReactElement], spacing: Double): IProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      }
    }
  }
}
