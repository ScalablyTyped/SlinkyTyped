package typingsSlinky.ebml.mod

import typingsSlinky.ebml.anon.PickTagStackItemend
import typingsSlinky.ebml.mod.Encoder.TagStackItem
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ebml", "Encoder")
@js.native
class Encoder_ () extends Transform {
  var buffer: Buffer = js.native
  var corked: Boolean = js.native
  var stack: js.Array[TagStackItem] = js.native
  def endTag(): Unit = js.native
  /**
    * @param tagName The name of the tag to start
    * @param info an information object with an `end` parameter
    */
  @JSName("startTag")
  def startTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    info: PickTagStackItemend
  ): Unit = js.native
  @JSName("writeTag")
  def writeTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    tagData: Buffer
  ): Unit = js.native
}

