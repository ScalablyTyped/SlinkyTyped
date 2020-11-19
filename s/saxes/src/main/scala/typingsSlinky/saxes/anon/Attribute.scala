package typingsSlinky.saxes.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute[O] extends js.Object {
  
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
