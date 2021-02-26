package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapsibleMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Collapsible", "Collapsible")
  @js.native
  class Collapsible protected ()
    extends Component[
          CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Collapsible", "Collapsible")
  @js.native
  val Collapsible: ReactComponentClass[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait CollapsibleProps extends StObject {
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
  }
  object CollapsibleProps {
    
    @scala.inline
    def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    @scala.inline
    implicit class CollapsiblePropsMutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
