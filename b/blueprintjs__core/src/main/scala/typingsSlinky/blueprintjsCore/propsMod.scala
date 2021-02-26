package typingsSlinky.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.refsMod.IRef
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", "DISPLAYNAME_PREFIX")
  @js.native
  val DISPLAYNAME_PREFIX: /* "Blueprint3" */ String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/props", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.UndefOr[scala.Nothing], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/props", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String]): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/props", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  
  type HTMLDivProps = HTMLAttributes[HTMLDivElement]
  
  type HTMLInputProps = InputHTMLAttributes[HTMLInputElement]
  
  @js.native
  trait IActionProps
    extends IIntentProps
       with IProps {
    
    /** Whether this action is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /** Click event handler. */
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    /** Action text. Can be any single React renderable. */
    var text: js.UndefOr[ReactElement] = js.native
  }
  object IActionProps {
    
    @scala.inline
    def apply(): IActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionProps]
    }
    
    @scala.inline
    implicit class IActionPropsMutableBuilder[Self <: IActionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait IControlledProps extends StObject {
    
    /** Initial value of the input, for uncontrolled usage. */
    var defaultValue: js.UndefOr[String] = js.native
    
    /** Change event handler. Use `event.target.value` for new value. */
    var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
    
    /** Form value of the input, for controlled usage. */
    var value: js.UndefOr[String] = js.native
  }
  object IControlledProps {
    
    @scala.inline
    def apply(): IControlledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledProps]
    }
    
    @scala.inline
    implicit class IControlledPropsMutableBuilder[Self <: IControlledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IElementRefProps[E /* <: HTMLElement */] extends StObject {
    
    /** A ref handler or a ref object that receives the native HTML element rendered by this component. */
    var elementRef: js.UndefOr[IRef[E]] = js.native
  }
  object IElementRefProps {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementRefProps[E]]
    }
    
    @scala.inline
    implicit class IElementRefPropsMutableBuilder[Self <: IElementRefProps[_], E /* <: HTMLElement */] (val x: Self with IElementRefProps[E]) extends AnyVal {
      
      @scala.inline
      def setElementRef(value: IRef[E]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementRefFunction1(value: /* ref */ E | Null => js.Any): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    }
  }
  
  @js.native
  trait IIntentProps extends StObject {
    
    /** Visual intent color to apply to element. */
    var intent: js.UndefOr[Intent] = js.native
  }
  object IIntentProps {
    
    @scala.inline
    def apply(): IIntentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIntentProps]
    }
    
    @scala.inline
    implicit class IIntentPropsMutableBuilder[Self <: IIntentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    }
  }
  
  @js.native
  trait ILinkProps extends StObject {
    
    /** Link URL. */
    var href: js.UndefOr[String] = js.native
    
    /** Link target attribute. Use `"_blank"` to open in a new window. */
    var target: js.UndefOr[String] = js.native
  }
  object ILinkProps {
    
    @scala.inline
    def apply(): ILinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkProps]
    }
    
    @scala.inline
    implicit class ILinkPropsMutableBuilder[Self <: ILinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait IOptionProps extends IProps {
    
    /** Whether this option is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Label text for this option. If omitted, `value` is used as the label. */
    var label: js.UndefOr[String] = js.native
    
    /** Value of this option. */
    var value: String | Double = js.native
  }
  object IOptionProps {
    
    @scala.inline
    def apply(value: String | Double): IOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionProps]
    }
    
    @scala.inline
    implicit class IOptionPropsMutableBuilder[Self <: IOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProps extends StObject {
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.native
  }
  object IProps {
    
    @scala.inline
    def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type MaybeElement = js.UndefOr[ReactElement | `false` | Null]
}
