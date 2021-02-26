package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.grommetStrings.title
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Tab", "Tab")
  @js.native
  class Tab protected ()
    extends Component[
          TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ])) = this()
    def this(
      props: TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Tab", "Tab")
  @js.native
  val Tab: ReactComponentClass[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ] = js.native
  
  @js.native
  trait TabProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
