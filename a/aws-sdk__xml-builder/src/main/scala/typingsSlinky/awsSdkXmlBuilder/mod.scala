package typingsSlinky.awsSdkXmlBuilder

import typingsSlinky.awsSdkXmlBuilder.stringableMod.Stringable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/xml-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XmlNode protected ()
    extends typingsSlinky.awsSdkXmlBuilder.xmlNodeMod.XmlNode {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
  }
  
  @js.native
  class XmlText protected ()
    extends typingsSlinky.awsSdkXmlBuilder.xmlTextMod.XmlText {
    def this(value: String) = this()
  }
  
}

