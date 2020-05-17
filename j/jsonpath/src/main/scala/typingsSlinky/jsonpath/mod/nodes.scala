package typingsSlinky.jsonpath.mod

import typingsSlinky.jsonpath.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpath", "nodes")
@js.native
object nodes extends js.Object {
  def apply(obj: js.Any, pathExpression: String): js.Array[Path] = js.native
  def apply(obj: js.Any, pathExpression: String, count: Double): js.Array[Path] = js.native
}

