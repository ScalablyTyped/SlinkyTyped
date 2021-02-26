package typingsSlinky.reactFileInput

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FileInputProps, js.Object, js.Any]
  
  type FileInput = ReactComponentClass[FileInputProps]
  
  @js.native
  trait FileInputProps extends StObject {
    
    var accept: String = js.native
    
    var className: String = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    def onChange(event: SyntheticEvent[Event, _]): Unit = js.native
    
    var placeholder: String = js.native
  }
  object FileInputProps {
    
    @scala.inline
    def apply(
      accept: String,
      className: String,
      name: String,
      onChange: SyntheticEvent[Event, _] => Unit,
      placeholder: String
    ): FileInputProps = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInputProps]
    }
    
    @scala.inline
    implicit class FileInputPropsMutableBuilder[Self <: FileInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[Event, _] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
