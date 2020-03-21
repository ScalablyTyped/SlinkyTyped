package typingsSlinky.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", "tokenizer")
@js.native
object tokenizer extends js.Object {
  val defaultSeperator: js.RegExp = js.native
  val seperator: js.RegExp = js.native
  def apply(): js.Array[String] = js.native
  def apply(str: String): js.Array[String] = js.native
  def getSeperator(): js.RegExp = js.native
  def resetSeperator(): Unit = js.native
  def setSeperator(sep: js.RegExp): Unit = js.native
}

