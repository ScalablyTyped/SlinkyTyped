package typingsSlinky.prosemirrorView

import org.scalajs.dom.raw.Element
import typingsSlinky.prosemirrorView.prosemirrorViewStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: Element
  var `type`: selection
}

object AnonTarget {
  @scala.inline
  def apply(target: Element, `type`: selection): AnonTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

