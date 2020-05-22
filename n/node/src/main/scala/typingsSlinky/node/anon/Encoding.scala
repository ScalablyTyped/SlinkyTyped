package typingsSlinky.node.anon

import typingsSlinky.node.nodeBooleans.`false`
import typingsSlinky.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: buffer_
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: buffer_, withFileTypes: `false` = null): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

