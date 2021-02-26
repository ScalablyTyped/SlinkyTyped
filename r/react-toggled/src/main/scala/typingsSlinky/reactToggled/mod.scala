package typingsSlinky.reactToggled

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ReactToggledProps, js.Object, js.Any] {
    def this(props: ReactToggledProps) = this()
    def this(props: ReactToggledProps, context: js.Any) = this()
  }
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactToggledProps] = js.native
  
  type ChildrenFunction = js.Function1[/* options */ TogglerStateAndHelpers, ReactElement]
  
  type GetButtonPropsOptions = HTMLProps[HTMLButtonElement]
  
  type GetElementPropsOptions = HTMLProps[HTMLElement]
  
  type GetInputPropsOptions = HTMLProps[HTMLInputElement]
  
  type ReactToggledInterface = ReactComponentClass[ReactToggledProps]
  
  @js.native
  trait ReactToggledProps extends StObject {
    
    val children: ChildrenFunction = js.native
    
    val defaultOn: js.UndefOr[Boolean] = js.native
    
    val on: js.UndefOr[Boolean] = js.native
    
    val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.native
  }
  object ReactToggledProps {
    
    @scala.inline
    def apply(children: /* options */ TogglerStateAndHelpers => ReactElement): ReactToggledProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReactToggledProps]
    }
    
    @scala.inline
    implicit class ReactToggledPropsMutableBuilder[Self <: ReactToggledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* options */ TogglerStateAndHelpers => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultOn(value: Boolean): Self = StObject.set(x, "defaultOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOnUndefined: Self = StObject.set(x, "defaultOn", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    }
  }
  
  @js.native
  trait TogglerStateAndHelpers extends StObject {
    
    def getElementTogglerProps(): js.Any = js.native
    def getElementTogglerProps(options: GetElementPropsOptions): js.Any = js.native
    
    def getInputTogglerProps(): js.Any = js.native
    def getInputTogglerProps(options: GetButtonPropsOptions): js.Any = js.native
    
    def getTogglerProps(): js.Any = js.native
    def getTogglerProps(options: GetButtonPropsOptions): js.Any = js.native
    
    val on: Boolean = js.native
    
    def setOff(): Unit = js.native
    
    def setOn(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  type _To = ReactComponentClass[ReactToggledProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[ReactToggledProps] = default
}
