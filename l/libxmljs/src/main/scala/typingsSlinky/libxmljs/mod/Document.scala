package typingsSlinky.libxmljs.mod

import typingsSlinky.libxmljs.anon.ExternalId
import typingsSlinky.libxmljs.libxmljsStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxmljs", "Document")
@js.native
/**
  * Create a new XML Document
  * @param version XML document version, defaults to 1.0
  * @param encoding Encoding, defaults to utf8
  */
class Document () extends js.Object {
  def this(version: Double) = this()
  def this(version: js.UndefOr[scala.Nothing], encoding: String) = this()
  def this(version: Double, encoding: String) = this()
  
  def child(idx: Double): Element | Null = js.native
  
  def childNodes(): js.Array[Element] = js.native
  
  def encoding(): String = js.native
  def encoding(enc: String): this.type = js.native
  
  var errors: js.Array[SyntaxError] = js.native
  
  def find(xpath: String): js.Array[Element] = js.native
  def find(xpath: String, namespaces: StringMap): js.Array[Element] = js.native
  def find(xpath: String, ns_uri: String): js.Array[Element] = js.native
  
  def get(xpath: String): Element | Null = js.native
  def get(xpath: String, namespaces: StringMap): Element | Null = js.native
  
  def getDtd(): ExternalId = js.native
  
  def node(name: String): Element = js.native
  def node(name: String, content: String): Element = js.native
  
  def root(): Element | Null = js.native
  def root(newRoot: Node): Node = js.native
  
  def setDtd(name: String, ext: String, sys: String): Unit = js.native
  
  def toString(formatted: Boolean): String = js.native
  
  def `type`(): document = js.native
  
  def validate(xsdDoc: Document): Boolean = js.native
  
  var validationErrors: js.Array[ValidationError] = js.native
  
  def version(): String = js.native
}
