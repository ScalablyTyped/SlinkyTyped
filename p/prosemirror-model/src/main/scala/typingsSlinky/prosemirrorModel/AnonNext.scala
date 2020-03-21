package typingsSlinky.prosemirrorModel

import typingsSlinky.prosemirrorModel.mod.ContentMatch
import typingsSlinky.prosemirrorModel.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: ContentMatch[_]
  var `type`: NodeType[_]
}

object AnonNext {
  @scala.inline
  def apply(next: ContentMatch[_], `type`: NodeType[_]): AnonNext = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNext]
  }
}

