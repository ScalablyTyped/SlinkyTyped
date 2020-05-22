package typingsSlinky.node.anon

import typingsSlinky.node.nodeStrings.pkcs1
import typingsSlinky.node.nodeStrings.pkcs8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: pkcs1 | pkcs8
}

object Type {
  @scala.inline
  def apply(`type`: pkcs1 | pkcs8): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

