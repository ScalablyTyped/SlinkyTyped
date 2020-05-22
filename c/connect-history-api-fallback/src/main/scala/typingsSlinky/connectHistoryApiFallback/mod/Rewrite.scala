package typingsSlinky.connectHistoryApiFallback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rewrite extends js.Object {
  var from: js.RegExp
  var to: String | js.RegExp | RewriteTo
}

object Rewrite {
  @scala.inline
  def apply(from: js.RegExp, to: String | js.RegExp | RewriteTo): Rewrite = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rewrite]
  }
}

