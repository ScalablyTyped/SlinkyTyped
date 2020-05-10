package typingsSlinky.expressUrlrewrite

import typingsSlinky.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-urlrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(s: String): Handler = js.native
  def apply(s: String, t: String): Handler = js.native
  def apply(s: js.RegExp, t: String): Handler = js.native
}

