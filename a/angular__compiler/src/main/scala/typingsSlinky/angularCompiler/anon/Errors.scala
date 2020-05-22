package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.r3AstMod.Node
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.UndefOr[js.Array[ParseError]] = js.undefined
  var nodes: js.Array[Node]
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
}

object Errors {
  @scala.inline
  def apply(
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String],
    errors: js.Array[ParseError] = null
  ): Errors = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

