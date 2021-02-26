package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlHelperMod {
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "CR")
  @js.native
  class CR () extends Text {
    def this(ws: Double) = this()
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "Declaration")
  @js.native
  class Declaration protected () extends Node {
    def this(unescapedAttrs: StringDictionary[String]) = this()
    
    var attrs: StringDictionary[String] = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "Doctype")
  @js.native
  class Doctype protected () extends Node {
    def this(rootTag: String, dtd: String) = this()
    
    var dtd: String = js.native
    
    var rootTag: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "Tag")
  @js.native
  class Tag protected () extends Node {
    def this(name: String) = this()
    def this(name: String, unescapedAttrs: StringDictionary[String]) = this()
    def this(name: String, unescapedAttrs: js.UndefOr[scala.Nothing], children: js.Array[Node]) = this()
    def this(name: String, unescapedAttrs: StringDictionary[String], children: js.Array[Node]) = this()
    
    var attrs: StringDictionary[String] = js.native
    
    var children: js.Array[Node] = js.native
    
    var name: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "Text")
  @js.native
  class Text protected () extends Node {
    def this(unescapedValue: String) = this()
    
    var value: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "escapeXml")
  @js.native
  def escapeXml(text: String): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/serializers/xml_helper", "serialize")
  @js.native
  def serialize(nodes: js.Array[Node]): String = js.native
  
  @js.native
  trait IVisitor extends StObject {
    
    def visitDeclaration(decl: Declaration): js.Any = js.native
    
    def visitDoctype(doctype: Doctype): js.Any = js.native
    
    def visitTag(tag: Tag): js.Any = js.native
    
    def visitText(text: Text): js.Any = js.native
  }
  object IVisitor {
    
    @scala.inline
    def apply(
      visitDeclaration: Declaration => js.Any,
      visitDoctype: Doctype => js.Any,
      visitTag: Tag => js.Any,
      visitText: Text => js.Any
    ): IVisitor = {
      val __obj = js.Dynamic.literal(visitDeclaration = js.Any.fromFunction1(visitDeclaration), visitDoctype = js.Any.fromFunction1(visitDoctype), visitTag = js.Any.fromFunction1(visitTag), visitText = js.Any.fromFunction1(visitText))
      __obj.asInstanceOf[IVisitor]
    }
    
    @scala.inline
    implicit class IVisitorMutableBuilder[Self <: IVisitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisitDeclaration(value: Declaration => js.Any): Self = StObject.set(x, "visitDeclaration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitDoctype(value: Doctype => js.Any): Self = StObject.set(x, "visitDoctype", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitTag(value: Tag => js.Any): Self = StObject.set(x, "visitTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitText(value: Text => js.Any): Self = StObject.set(x, "visitText", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    def visit(visitor: IVisitor): js.Any = js.native
  }
  object Node {
    
    @scala.inline
    def apply(visit: IVisitor => js.Any): Node = {
      val __obj = js.Dynamic.literal(visit = js.Any.fromFunction1(visit))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisit(value: IVisitor => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
    }
  }
}
