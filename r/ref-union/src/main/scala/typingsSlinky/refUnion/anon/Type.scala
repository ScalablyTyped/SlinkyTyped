package typingsSlinky.refUnion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: typingsSlinky.ref.mod.Type
}

object Type {
  @scala.inline
  def apply(`type`: typingsSlinky.ref.mod.Type): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

