package typingsSlinky.ol

import typingsSlinky.ol.formatXMLMod.XML
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/XML", JSImport.Namespace)
@js.native
object formatXMLMod extends js.Object {
  @js.native
  trait XML extends js.Object {
    def read(source: String): js.Any = js.native
    def read(source: Document): js.Any = js.native
    def read(source: Element): js.Any = js.native
    def readFromDocument(doc: org.scalajs.dom.raw.Document): js.Any = js.native
    def readFromNode(node: org.scalajs.dom.raw.Element): js.Any = js.native
  }
  
  @js.native
  class default () extends XML
  
}

