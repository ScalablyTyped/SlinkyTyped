package typingsSlinky.nodePdftk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.nodePdftk.anon.PartialRecordLetterstring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pdftk", "input")
@js.native
object input extends js.Object {
  
  def apply(file: String): PDFTK = js.native
  def apply(file: js.Array[Buffer]): PDFTK = js.native
  def apply(file: Buffer): PDFTK = js.native
  def apply(file: PartialRecordLetterstring): PDFTK = js.native
}
