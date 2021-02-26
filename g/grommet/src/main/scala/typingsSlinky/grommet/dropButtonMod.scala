package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Bottom
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.dropMod.DropProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/DropButton", "DropButton")
  @js.native
  class DropButton protected ()
    extends Component[
          DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ])) = this()
    def this(
      props: DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/DropButton", "DropButton")
  @js.native
  val DropButton: ReactComponentClass[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.native
  
  @js.native
  trait DropButtonProps extends StObject {
    
    var dropAlign: js.UndefOr[Bottom] = js.native
    
    var dropContent: ReactElement = js.native
    
    var dropProps: js.UndefOr[DropProps] = js.native
    
    var dropTarget: js.UndefOr[js.Object] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
  }
  object DropButtonProps {
    
    @scala.inline
    def apply(dropContent: ReactElement): DropButtonProps = {
      val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropButtonProps]
    }
    
    @scala.inline
    implicit class DropButtonPropsMutableBuilder[Self <: DropButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      @scala.inline
      def setDropContent(value: ReactElement): Self = StObject.set(x, "dropContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      @scala.inline
      def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
