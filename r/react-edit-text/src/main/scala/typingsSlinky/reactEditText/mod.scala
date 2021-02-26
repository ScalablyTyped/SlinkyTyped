package typingsSlinky.reactEditText

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-edit-text", "EditText")
  @js.native
  class EditText protected ()
    extends Component[EditTextProps, js.Object, js.Any] {
    def this(props: EditTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextProps, context: js.Any) = this()
  }
  
  @JSImport("react-edit-text", "EditTextarea")
  @js.native
  class EditTextarea protected ()
    extends Component[EditTextareaProps, js.Object, js.Any] {
    def this(props: EditTextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextareaProps, context: js.Any) = this()
  }
  
  @js.native
  trait EditTextProps extends SharedProps {
    
    /**
      * Sets the element display to inline when set to true,
      * default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * type attribute set for input element,
      * default: 'text'
      */
    var `type`: js.UndefOr[inputTextType] = js.native
  }
  object EditTextProps {
    
    @scala.inline
    def apply(): EditTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextProps]
    }
    
    @scala.inline
    implicit class EditTextPropsMutableBuilder[Self <: EditTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setType(value: inputTextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait EditTextareaProps extends SharedProps {
    
    /**
      * the number of visible rows,
      * default: 3
      */
    var rows: js.UndefOr[Double] = js.native
  }
  object EditTextareaProps {
    
    @scala.inline
    def apply(): EditTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextareaProps]
    }
    
    @scala.inline
    implicit class EditTextareaPropsMutableBuilder[Self <: EditTextareaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  @js.native
  trait SharedProps extends StObject {
    
    /**
      * className attribute set for both input and div element
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * id attribute set for both input and div element
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * name attribute set for input element
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * onSave is called when the input blur event is triggered or enter key is pressed
      * returns an object: {name, value} which correspond to the input name and value
      */
    var onSave: js.UndefOr[js.Function1[/* hasNameValue */ onSaveProps, Unit]] = js.native
    
    /**
      * placeholder is displayed in the div element when value is empty
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Displays only the view element when set to true,
      * default: false
      */
    var readonly: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the css styling for both input and div elements
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * value sets the defaultValue for input element and display text of div element
      */
    var value: js.UndefOr[String] = js.native
  }
  object SharedProps {
    
    @scala.inline
    def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit class SharedPropsMutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnSave(value: /* hasNameValue */ onSaveProps => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactEditText.reactEditTextStrings.date
    - typingsSlinky.reactEditText.reactEditTextStrings.`datetime-local`
    - typingsSlinky.reactEditText.reactEditTextStrings.email
    - typingsSlinky.reactEditText.reactEditTextStrings.month
    - typingsSlinky.reactEditText.reactEditTextStrings.number
    - typingsSlinky.reactEditText.reactEditTextStrings.password
    - typingsSlinky.reactEditText.reactEditTextStrings.search
    - typingsSlinky.reactEditText.reactEditTextStrings.tel
    - typingsSlinky.reactEditText.reactEditTextStrings.text
    - typingsSlinky.reactEditText.reactEditTextStrings.url
    - typingsSlinky.reactEditText.reactEditTextStrings.week
  */
  trait inputTextType extends StObject
  object inputTextType {
    
    @scala.inline
    def date: typingsSlinky.reactEditText.reactEditTextStrings.date = "date".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.date]
    
    @scala.inline
    def `datetime-local`: typingsSlinky.reactEditText.reactEditTextStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.`datetime-local`]
    
    @scala.inline
    def email: typingsSlinky.reactEditText.reactEditTextStrings.email = "email".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.email]
    
    @scala.inline
    def month: typingsSlinky.reactEditText.reactEditTextStrings.month = "month".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.month]
    
    @scala.inline
    def number: typingsSlinky.reactEditText.reactEditTextStrings.number = "number".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.number]
    
    @scala.inline
    def password: typingsSlinky.reactEditText.reactEditTextStrings.password = "password".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.password]
    
    @scala.inline
    def search: typingsSlinky.reactEditText.reactEditTextStrings.search = "search".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.search]
    
    @scala.inline
    def tel: typingsSlinky.reactEditText.reactEditTextStrings.tel = "tel".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.tel]
    
    @scala.inline
    def text: typingsSlinky.reactEditText.reactEditTextStrings.text = "text".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.text]
    
    @scala.inline
    def url: typingsSlinky.reactEditText.reactEditTextStrings.url = "url".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.url]
    
    @scala.inline
    def week: typingsSlinky.reactEditText.reactEditTextStrings.week = "week".asInstanceOf[typingsSlinky.reactEditText.reactEditTextStrings.week]
  }
  
  @js.native
  trait onSaveProps extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object onSaveProps {
    
    @scala.inline
    def apply(name: String, value: String): onSaveProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[onSaveProps]
    }
    
    @scala.inline
    implicit class onSavePropsMutableBuilder[Self <: onSaveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
