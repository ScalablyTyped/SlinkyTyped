package typingsSlinky.sax.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sax.anon.Body
import typingsSlinky.sax.anon.Name
import typingsSlinky.sax.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXParser")
@js.native
class SAXParser () extends js.Object {
  def this(strict: Boolean) = this()
  def this(strict: js.UndefOr[scala.Nothing], opt: SAXOptions) = this()
  def this(strict: Boolean, opt: SAXOptions) = this()
  var ENTITIES: StringDictionary[String] = js.native
  var closed: Boolean = js.native
  var column: Double = js.native
  var error: js.Error = js.native
  // Members
  var line: Double = js.native
  var opt: SAXOptions = js.native
  var position: Double = js.native
  var startTagPosition: Double = js.native
  var strict: Boolean = js.native
  var tag: Tag = js.native
  def close(): SAXParser = js.native
  // Methods
  def end(): Unit = js.native
  def flush(): Unit = js.native
  def onattribute(attr: Name): Unit = js.native
  def oncdata(cdata: String): Unit = js.native
  def onclosecdata(): Unit = js.native
  def onclosenamespace(ns: Prefix): Unit = js.native
  def onclosetag(tagName: String): Unit = js.native
  def oncomment(comment: String): Unit = js.native
  def ondoctype(doctype: String): Unit = js.native
  def onend(): Unit = js.native
  // Events
  def onerror(e: js.Error): Unit = js.native
  def onopencdata(): Unit = js.native
  def onopennamespace(ns: Prefix): Unit = js.native
  def onopentag(tag: QualifiedTag): Unit = js.native
  def onopentag(tag: Tag): Unit = js.native
  def onprocessinginstruction(node: Body): Unit = js.native
  def onready(): Unit = js.native
  def onscript(script: String): Unit = js.native
  def ontext(t: String): Unit = js.native
  def resume(): SAXParser = js.native
  def write(s: String): SAXParser = js.native
}

