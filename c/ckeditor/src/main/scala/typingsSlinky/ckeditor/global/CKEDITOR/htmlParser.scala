package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.filterRulesDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser")
@js.native
object htmlParser extends js.Object {
  @js.native
  class basicWriter ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.basicWriter {
    /* CompleteClass */
    override def attribute(attName: String, attValue: String): Unit = js.native
    /* CompleteClass */
    override def closeTag(tagName: String): Unit = js.native
    /* CompleteClass */
    override def comment(comment: String): Unit = js.native
    /* CompleteClass */
    override def getHtml(reset: Boolean): String = js.native
    /* CompleteClass */
    override def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
    /* CompleteClass */
    override def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
    /* CompleteClass */
    override def reset(): Unit = js.native
    /* CompleteClass */
    override def text(text: String): Unit = js.native
    /* CompleteClass */
    override def write(data: String): Unit = js.native
  }
  
  @js.native
  class cdata protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.cdata {
    def this(value: String) = this()
  }
  
  @js.native
  class comment protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.comment {
    def this(value: String) = this()
  }
  
  @js.native
  class cssStyle protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.cssStyle {
    def this(elementOrStyleText: String) = this()
    def this(elementOrStyleText: typingsSlinky.ckeditor.CKEDITOR.htmlParser.element) = this()
  }
  
  @js.native
  class element protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.element {
    def this(name: String, attributes: StringDictionary[String]) = this()
  }
  
  @js.native
  class filter ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter {
    def this(rules: filterRulesDefinition) = this()
  }
  
  @js.native
  class filterRulesGroup ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.filterRulesGroup
  
  @js.native
  class fragment ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment
  
  @js.native
  class node ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.node
  
  @js.native
  class text protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.htmlParser.text {
    def this(value: String) = this()
  }
  
  /* static members */
  @js.native
  object fragment extends js.Object {
    def fromBBCode(source: String): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment = js.native
    def fromHtml(fragmentHtml: String): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(fragmentHtml: String, parent: String): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(fragmentHtml: String, parent: String, fixingBlock: String): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(fragmentHtml: String, parent: String, fixingBlock: Boolean): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(fragmentHtml: String, parent: typingsSlinky.ckeditor.CKEDITOR.htmlParser.element): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(
      fragmentHtml: String,
      parent: typingsSlinky.ckeditor.CKEDITOR.htmlParser.element,
      fixingBlock: String
    ): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
    def fromHtml(
      fragmentHtml: String,
      parent: typingsSlinky.ckeditor.CKEDITOR.htmlParser.element,
      fixingBlock: Boolean
    ): typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | typingsSlinky.ckeditor.CKEDITOR.htmlParser.element = js.native
  }
  
}

