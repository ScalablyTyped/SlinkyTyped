package typingsSlinky.atomKeymap.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTarget extends js.Object {
  var defaultTarget: js.UndefOr[HTMLElement] = js.undefined
}

object DefaultTarget {
  @scala.inline
  def apply(defaultTarget: HTMLElement = null): DefaultTarget = {
    val __obj = js.Dynamic.literal()
    if (defaultTarget != null) __obj.updateDynamic("defaultTarget")(defaultTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTarget]
  }
}

