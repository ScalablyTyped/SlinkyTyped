package typingsSlinky.primereact

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("primereact/components/message/Message", "Message")
  @js.native
  class Message protected ()
    extends Component[MessageProps, js.Any, js.Any] {
    def this(props: MessageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MessageProps, context: js.Any) = this()
  }
  
  @js.native
  trait MessageProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var severity: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object MessageProps {
    
    @scala.inline
    def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
    
    @scala.inline
    implicit class MessagePropsMutableBuilder[Self <: MessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: /* props */ js.Object => _): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
