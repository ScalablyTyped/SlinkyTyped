package typingsSlinky.saxes

import typingsSlinky.saxes.mod.AttributeEventForOptions
import typingsSlinky.saxes.mod.AttributeHandler
import typingsSlinky.saxes.mod.CDataHandler
import typingsSlinky.saxes.mod.CloseTagHandler
import typingsSlinky.saxes.mod.CommentHandler
import typingsSlinky.saxes.mod.DoctypeHandler
import typingsSlinky.saxes.mod.EndHandler
import typingsSlinky.saxes.mod.ErrorHandler
import typingsSlinky.saxes.mod.OpenTagHandler
import typingsSlinky.saxes.mod.OpenTagStartHandler
import typingsSlinky.saxes.mod.PIHandler
import typingsSlinky.saxes.mod.ReadyHandler
import typingsSlinky.saxes.mod.StartTagForOptions
import typingsSlinky.saxes.mod.TagForOptions
import typingsSlinky.saxes.mod.TextHandler
import typingsSlinky.saxes.mod.XMLDecl
import typingsSlinky.saxes.mod.XMLDeclHandler
import typingsSlinky.saxes.saxesBooleans.`false`
import typingsSlinky.saxes.saxesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var xmlns: js.UndefOr[`false`] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmlns(value: `false`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  @js.native
  trait Attribute[O] extends StObject {
    
    def attribute(attribute: AttributeEventForOptions[O]): Unit = js.native
    @JSName("attribute")
    var attribute_Original: AttributeHandler[O] = js.native
    
    def cdata(cdata: String): Unit = js.native
    @JSName("cdata")
    var cdata_Original: CDataHandler = js.native
    
    def closetag(tag: TagForOptions[O]): Unit = js.native
    @JSName("closetag")
    var closetag_Original: CloseTagHandler[O] = js.native
    
    def comment(comment: String): Unit = js.native
    @JSName("comment")
    var comment_Original: CommentHandler = js.native
    
    def doctype(doctype: String): Unit = js.native
    @JSName("doctype")
    var doctype_Original: DoctypeHandler = js.native
    
    def end(): Unit = js.native
    @JSName("end")
    var end_Original: EndHandler = js.native
    
    def error(err: js.Error): Unit = js.native
    @JSName("error")
    var error_Original: ErrorHandler = js.native
    
    def opentag(tag: TagForOptions[O]): Unit = js.native
    @JSName("opentag")
    var opentag_Original: OpenTagHandler[O] = js.native
    
    def opentagstart(tag: StartTagForOptions[O]): Unit = js.native
    @JSName("opentagstart")
    var opentagstart_Original: OpenTagStartHandler[O] = js.native
    
    def processinginstruction(data: Body): Unit = js.native
    @JSName("processinginstruction")
    var processinginstruction_Original: PIHandler = js.native
    
    def ready(): Unit = js.native
    @JSName("ready")
    var ready_Original: ReadyHandler = js.native
    
    def text(text: String): Unit = js.native
    @JSName("text")
    var text_Original: TextHandler = js.native
    
    def xmldecl(decl: XMLDecl): Unit = js.native
    @JSName("xmldecl")
    var xmldecl_Original: XMLDeclHandler = js.native
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var target: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: String, target: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Xmlns extends StObject {
    
    var xmlns: `true` = js.native
  }
  object Xmlns {
    
    @scala.inline
    def apply(xmlns: `true`): Xmlns = {
      val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xmlns]
    }
    
    @scala.inline
    implicit class XmlnsMutableBuilder[Self <: Xmlns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmlns(value: `true`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    }
  }
}
