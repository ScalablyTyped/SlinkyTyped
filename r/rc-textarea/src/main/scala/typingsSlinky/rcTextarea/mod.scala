package typingsSlinky.rcTextarea

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcTextarea.anon.Height
import typingsSlinky.rcTextarea.anon.Value
import typingsSlinky.rcTextarea.resizableTextAreaMod.AutoSizeType
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.TextareaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-textarea", JSImport.Default)
  @js.native
  class default protected () extends TextArea {
    def this(props: TextAreaProps) = this()
  }
  object default {
    
    /* static member */
    @JSImport("rc-textarea", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: TextAreaProps): Value = js.native
  }
  
  @JSImport("rc-textarea", "ResizableTextArea")
  @js.native
  class ResizableTextArea protected ()
    extends typingsSlinky.rcTextarea.resizableTextAreaMod.default {
    def this(props: TextAreaProps) = this()
  }
  
  type HTMLTextareaProps = TextareaHTMLAttributes[HTMLTextAreaElement]
  
  @js.native
  trait TextArea
    extends Component[TextAreaProps, TextAreaState, js.Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    def handleKeyDown(e: SyntheticKeyboardEvent[HTMLTextAreaElement]): Unit = js.native
    
    var resizableTextArea: typingsSlinky.rcTextarea.resizableTextAreaMod.default = js.native
    
    def saveTextArea(resizableTextArea: typingsSlinky.rcTextarea.resizableTextAreaMod.default): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object TextAreaProps {
    
    @scala.inline
    def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    @scala.inline
    implicit class TextAreaPropsMutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setOnPressEnter(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* size */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait TextAreaState extends StObject {
    
    var value: js.Any = js.native
  }
  object TextAreaState {
    
    @scala.inline
    def apply(value: js.Any): TextAreaState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAreaState]
    }
    
    @scala.inline
    implicit class TextAreaStateMutableBuilder[Self <: TextAreaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
