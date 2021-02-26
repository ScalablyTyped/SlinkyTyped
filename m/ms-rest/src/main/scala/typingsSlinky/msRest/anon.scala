package typingsSlinky.msRest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.MapperType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
    
    var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.native
    
    var name: MapperType = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, name: MapperType): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelProperties(value: StringDictionary[Mapper]): Self = StObject.set(x, "modelProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelPropertiesUndefined: Self = StObject.set(x, "modelProperties", js.undefined)
      
      @scala.inline
      def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    var element: Mapper = js.native
    
    var name: MapperType = js.native
  }
  object Element {
    
    @scala.inline
    def apply(element: Mapper, name: MapperType): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Mapper): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var name: MapperType = js.native
    
    var value: Mapper = js.native
  }
  object Value {
    
    @scala.inline
    def apply(name: MapperType, value: Mapper): Value = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Mapper): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
