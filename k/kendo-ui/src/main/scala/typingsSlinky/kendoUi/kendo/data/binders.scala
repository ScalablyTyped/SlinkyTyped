package typingsSlinky.kendoUi.kendo.data

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binders {
  
  type attr = Binder
  
  type css = Binder
  
  type disabled = Binder
  
  type enabled = Binder
  
  type events = Binder
  
  type html = Binder
  
  object input {
    
    @js.native
    trait checked extends TypedBinder {
      
      def change(): Unit = js.native
      
      def value(): js.Any = js.native
    }
  }
  
  type invisible = Binder
  
  type readonly = Binder
  
  object select {
    
    type source = typingsSlinky.kendoUi.kendo.data.binders.source
    
    @js.native
    trait value extends TypedBinder {
      
      def change(): Unit = js.native
    }
  }
  
  @js.native
  trait source extends Binder {
    
    def add(index: Number, items: js.Array[_]): Unit = js.native
    
    def container(): Element = js.native
    
    def remove(index: Number, items: js.Array[_]): Unit = js.native
    
    def render(): Unit = js.native
    
    def template(): String = js.native
  }
  
  type style = Binder
  
  type text = Binder
  
  @js.native
  trait value extends TypedBinder {
    
    def change(): Unit = js.native
  }
  
  type visible = Binder
  
  object widget {
    
    @js.native
    trait checked extends Binder {
      
      def change(): Unit = js.native
      
      def value(): js.Any = js.native
    }
    
    type disabled = Binder
    
    object dropdowntree {
      
      @js.native
      trait value extends Binder {
        
        def change(): Unit = js.native
      }
    }
    
    type enabled = Binder
    
    @js.native
    trait end extends Binder {
      
      def change(): Unit = js.native
    }
    
    type events = Binder
    
    type invisible = Binder
    
    object multiselect {
      
      @js.native
      trait value extends Binder {
        
        def change(): Unit = js.native
      }
    }
    
    @js.native
    trait start extends Binder {
      
      def change(): Unit = js.native
    }
    
    @js.native
    trait value extends Binder {
      
      def change(): Unit = js.native
    }
    
    type visible = Binder
  }
}
