package typingsSlinky.jsonMl.mod

import typingsSlinky.cheerio.Cheerio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json_ml", "stringify")
@js.native
object stringify extends js.Object {
  def apply(`object`: js.Array[Node]): String = js.native
  def apply(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _]): String = js.native
  def apply(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _], indent: Double): String = js.native
  def apply(`object`: js.Array[Node], replacer: Null, indent: Double): String = js.native
}

