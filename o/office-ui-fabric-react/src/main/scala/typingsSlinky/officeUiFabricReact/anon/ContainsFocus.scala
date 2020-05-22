package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsFocus extends js.Object {
  var containsFocus: Boolean
  var originalElement: js.UndefOr[HTMLElement | Window] = js.undefined
}

object ContainsFocus {
  @scala.inline
  def apply(containsFocus: Boolean, originalElement: HTMLElement | Window = null): ContainsFocus = {
    val __obj = js.Dynamic.literal(containsFocus = containsFocus.asInstanceOf[js.Any])
    if (originalElement != null) __obj.updateDynamic("originalElement")(originalElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsFocus]
  }
}

