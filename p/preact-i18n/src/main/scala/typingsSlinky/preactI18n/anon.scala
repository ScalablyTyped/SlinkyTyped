package typingsSlinky.preactI18n

import typingsSlinky.preact.mod.ComponentChild
import typingsSlinky.preact.mod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: ComponentChildren = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Definition extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[js.Any] = js.native
  }
  object Definition {
    
    @scala.inline
    def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    var fields: js.UndefOr[js.Object] = js.native
    
    var id: String = js.native
    
    var plural: js.UndefOr[Double] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(id: String): Fields = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlural(value: Double): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
  
  @js.native
  trait Scope extends StObject {
    
    var definition: js.UndefOr[js.Object] = js.native
    
    var scope: js.UndefOr[js.Any] = js.native
  }
  object Scope {
    
    @scala.inline
    def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
