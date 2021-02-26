package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.basicWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait htmlWriter extends basicWriter {
  
  def indentation(): Unit = js.native
  
  var indentationChars: String = js.native
  
  def lineBreak(): Unit = js.native
  
  var lineBreakChars: String = js.native
  
  var selfClosingEnd: String = js.native
  
  def setRules(tagName: String, rules: StringDictionary[js.Any]): Unit = js.native
}
object htmlWriter {
  
  @scala.inline
  def apply(
    attribute: (String, String) => Unit,
    closeTag: String => Unit,
    comment: String => Unit,
    getHtml: Boolean => String,
    indentation: () => Unit,
    indentationChars: String,
    lineBreak: () => Unit,
    lineBreakChars: String,
    openTag: (String, StringDictionary[String]) => Unit,
    openTagClose: (String, Boolean) => Unit,
    reset: () => Unit,
    selfClosingEnd: String,
    setRules: (String, StringDictionary[js.Any]) => Unit,
    text: String => Unit,
    write: String => Unit
  ): htmlWriter = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), closeTag = js.Any.fromFunction1(closeTag), comment = js.Any.fromFunction1(comment), getHtml = js.Any.fromFunction1(getHtml), indentation = js.Any.fromFunction0(indentation), indentationChars = indentationChars.asInstanceOf[js.Any], lineBreak = js.Any.fromFunction0(lineBreak), lineBreakChars = lineBreakChars.asInstanceOf[js.Any], openTag = js.Any.fromFunction2(openTag), openTagClose = js.Any.fromFunction2(openTagClose), reset = js.Any.fromFunction0(reset), selfClosingEnd = selfClosingEnd.asInstanceOf[js.Any], setRules = js.Any.fromFunction2(setRules), text = js.Any.fromFunction1(text), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[htmlWriter]
  }
  
  @scala.inline
  implicit class htmlWriterMutableBuilder[Self <: htmlWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndentation(value: () => Unit): Self = StObject.set(x, "indentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentationChars(value: String): Self = StObject.set(x, "indentationChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreak(value: () => Unit): Self = StObject.set(x, "lineBreak", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineBreakChars(value: String): Self = StObject.set(x, "lineBreakChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingEnd(value: String): Self = StObject.set(x, "selfClosingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRules(value: (String, StringDictionary[js.Any]) => Unit): Self = StObject.set(x, "setRules", js.Any.fromFunction2(value))
  }
}
