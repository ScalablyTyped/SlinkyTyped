package typingsSlinky.jsoneditor

import typingsSlinky.jsoneditor.jsoneditorStrings.EqualssignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.ExclamationmarkEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.Greaterthansign
import typingsSlinky.jsoneditor.jsoneditorStrings.GreaterthansignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.Lessthansign
import typingsSlinky.jsoneditor.jsoneditorStrings.LessthansignEqualssign
import typingsSlinky.jsoneditor.jsoneditorStrings.`@`
import typingsSlinky.jsoneditor.jsoneditorStrings.asc
import typingsSlinky.jsoneditor.jsoneditorStrings.desc
import typingsSlinky.jsoneditor.mod.JSONPath
import typingsSlinky.jsoneditor.mod.SelectionPosition
import typingsSlinky.jsoneditor.mod.SerializableNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Direction extends StObject {
    
    var direction: asc | desc = js.native
    
    var field: String | `@` = js.native
  }
  object Direction {
    
    @scala.inline
    def apply(direction: asc | desc, field: String | `@`): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: SerializableNode = js.native
    
    var start: SerializableNode = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: SerializableNode, start: SerializableNode): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: SerializableNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: SerializableNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Field extends StObject {
    
    var field: String | `@` = js.native
    
    var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign = js.native
    
    var value: String = js.native
  }
  object Field {
    
    @scala.inline
    def apply(
      field: String | `@`,
      relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
      value: String
    ): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelation(
        value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
      ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    var fields: js.Array[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: js.Array[String] = js.native
    
    var startFrom: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(options: js.Array[String], startFrom: Double): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setStartFrom(value: Double): Self = StObject.set(x, "startFrom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var field: String = js.native
    
    var path: js.Array[String] = js.native
    
    var value: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(field: String, path: js.Array[String], value: String): Path = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathJSONPath extends StObject {
    
    var path: JSONPath = js.native
  }
  object PathJSONPath {
    
    @scala.inline
    def apply(path: JSONPath): PathJSONPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathJSONPath]
    }
    
    @scala.inline
    implicit class PathJSONPathMutableBuilder[Self <: PathJSONPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Start extends StObject {
    
    var end: SelectionPosition = js.native
    
    var start: SelectionPosition = js.native
    
    var text: String = js.native
  }
  object Start {
    
    @scala.inline
    def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: SelectionPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: SelectionPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
