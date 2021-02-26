package typingsSlinky.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactJsonschemaForm.mod.AjvError
import typingsSlinky.reactJsonschemaForm.mod.Field
import typingsSlinky.reactJsonschemaForm.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Blob extends StObject {
    
    var blob: org.scalajs.dom.raw.Blob = js.native
    
    var name: String = js.native
  }
  object Blob {
    
    @scala.inline
    def apply(blob: org.scalajs.dom.raw.Blob, name: String): Blob = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blob]
    }
    
    @scala.inline
    implicit class BlobMutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlob(value: org.scalajs.dom.raw.Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var disabled: Boolean = js.native
    
    var hasMoveDown: Boolean = js.native
    
    var hasMoveUp: Boolean = js.native
    
    var hasRemove: Boolean = js.native
    
    var hasToolbar: Boolean = js.native
    
    var index: Double = js.native
    
    var key: String = js.native
    
    def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit] = js.native
    
    def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit] = js.native
    
    var readonly: Boolean = js.native
  }
  object Children {
    
    @scala.inline
    def apply(
      children: ReactElement,
      className: String,
      disabled: Boolean,
      hasMoveDown: Boolean,
      hasMoveUp: Boolean,
      hasRemove: Boolean,
      hasToolbar: Boolean,
      index: Double,
      key: String,
      onDropIndexClick: Double => js.Function1[/* event */ js.Any, Unit],
      onReorderClick: (Double, Double) => js.Function1[/* event */ js.Any, Unit],
      readonly: Boolean
    ): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoveDown(value: Boolean): Self = StObject.set(x, "hasMoveDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoveUp(value: Boolean): Self = StObject.set(x, "hasMoveUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasRemove(value: Boolean): Self = StObject.set(x, "hasRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasToolbar(value: Boolean): Self = StObject.set(x, "hasToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropIndexClick(value: Double => js.Function1[/* event */ js.Any, Unit]): Self = StObject.set(x, "onDropIndexClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReorderClick(value: (Double, Double) => js.Function1[/* event */ js.Any, Unit]): Self = StObject.set(x, "onReorderClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: ReactElement = js.native
    
    var disabled: Boolean = js.native
    
    var name: String = js.native
    
    var readonly: Boolean = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: ReactElement, disabled: Boolean, name: String, readonly: Boolean): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Definitions extends StObject {
    
    var definitions: StringDictionary[js.Any] = js.native
    
    var fields: StringDictionary[Field] = js.native
    
    var formContext: js.Any = js.native
    
    var widgets: StringDictionary[Widget] = js.native
  }
  object Definitions {
    
    @scala.inline
    def apply(
      definitions: StringDictionary[js.Any],
      fields: StringDictionary[Field],
      formContext: js.Any,
      widgets: StringDictionary[Widget]
    ): Definitions = {
      val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definitions]
    }
    
    @scala.inline
    implicit class DefinitionsMutableBuilder[Self <: Definitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinitions(value: StringDictionary[js.Any]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: StringDictionary[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgets(value: StringDictionary[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: String | ReactElement = js.native
    
    var id: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: String | ReactElement, id: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String | ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorSchema extends StObject {
    
    var errorSchema: typingsSlinky.reactJsonschemaForm.mod.ErrorSchema = js.native
    
    var errors: js.Array[AjvError] = js.native
  }
  object ErrorSchema {
    
    @scala.inline
    def apply(errorSchema: typingsSlinky.reactJsonschemaForm.mod.ErrorSchema, errors: js.Array[AjvError]): ErrorSchema = {
      val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorSchema]
    }
    
    @scala.inline
    implicit class ErrorSchemaMutableBuilder[Self <: ErrorSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorSchema(value: typingsSlinky.reactJsonschemaForm.mod.ErrorSchema): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[AjvError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: AjvError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var required: Boolean = js.native
    
    var title: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, required: Boolean, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var value: String = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
