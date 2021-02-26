package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Markdown", "Markdown")
  @js.native
  class Markdown protected ()
    extends Component[
          MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Markdown", "Markdown")
  @js.native
  val Markdown: ReactComponentClass[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait MarkdownProps extends StObject {
    
    var components: js.UndefOr[js.Object] = js.native
  }
  object MarkdownProps {
    
    @scala.inline
    def apply(): MarkdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownProps]
    }
    
    @scala.inline
    implicit class MarkdownPropsMutableBuilder[Self <: MarkdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
}
