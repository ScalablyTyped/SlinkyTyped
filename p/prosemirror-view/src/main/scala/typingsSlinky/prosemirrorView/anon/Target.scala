package typingsSlinky.prosemirrorView.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.prosemirrorView.prosemirrorViewStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var target: Element
  var `type`: selection
}

object Target {
  @scala.inline
  def apply(target: Element, `type`: selection): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

