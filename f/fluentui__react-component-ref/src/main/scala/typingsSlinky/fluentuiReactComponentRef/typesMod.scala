package typingsSlinky.fluentuiReactComponentRef

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/types", "refPropType")
  @js.native
  val refPropType: Requireable[Ref[js.Any]] = js.native
  
  @js.native
  trait RefProps extends StObject {
    
    var children: ReactElement = js.native
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param node - Referred node.
      */
    var innerRef: Ref[HTMLElement] = js.native
  }
  object RefProps {
    
    @scala.inline
    def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefProps]
    }
    
    @scala.inline
    implicit class RefPropsMutableBuilder[Self <: RefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    }
  }
}
