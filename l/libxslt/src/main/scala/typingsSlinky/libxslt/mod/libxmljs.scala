package typingsSlinky.libxslt.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.libxmljs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljs extends js.Object {
  
  val libxml_parser_version: String = js.native
  
  val libxml_version: String = js.native
  
  def memoryUsage(): Double = js.native
  
  def nodeCount(): Double = js.native
  
  def parseHtml(source: String): typingsSlinky.libxmljs.mod.Document = js.native
  def parseHtml(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
  
  def parseHtmlFragment(source: String): typingsSlinky.libxmljs.mod.Document = js.native
  def parseHtmlFragment(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
  
  def parseHtmlString(source: String): typingsSlinky.libxmljs.mod.Document = js.native
  def parseHtmlString(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
  
  def parseXml(source: String): typingsSlinky.libxmljs.mod.Document = js.native
  def parseXml(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
  
  def parseXmlString(source: String): typingsSlinky.libxmljs.mod.Document = js.native
  def parseXmlString(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
  
  val version: String = js.native
  
  @js.native
  class Attribute ()
    extends typingsSlinky.libxmljs.mod.Attribute
  @js.native
  object Attribute
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.Attribute]]
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends typingsSlinky.libxmljs.mod.Document
  @js.native
  object Document
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.Document]]
  
  @js.native
  class Element protected ()
    extends typingsSlinky.libxmljs.mod.Element {
    def this(doc: typingsSlinky.libxmljs.mod.Document, name: String) = this()
  }
  @js.native
  object Element
    extends TopLevel[
          Instantiable2[
            /* doc */ typingsSlinky.libxmljs.mod.Document, 
            /* name */ String, 
            typingsSlinky.libxmljs.mod.Element
          ]
        ]
  
  @js.native
  class Namespace ()
    extends typingsSlinky.libxmljs.mod.Namespace
  @js.native
  object Namespace
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.Namespace]]
  
  @js.native
  class Node ()
    extends typingsSlinky.libxmljs.mod.Node
  @js.native
  object Node
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.Node]]
  
  @js.native
  class SaxParser ()
    extends typingsSlinky.libxmljs.mod.SaxParser
  @js.native
  object SaxParser
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.SaxParser]]
  
  @js.native
  class SaxPushParser ()
    extends typingsSlinky.libxmljs.mod.SaxPushParser
  @js.native
  object SaxPushParser
    extends TopLevel[Instantiable0[typingsSlinky.libxmljs.mod.SaxPushParser]]
}
