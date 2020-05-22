package typingsSlinky.inboxsdk.mod.Compose

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.mod.Common.SimpleElementView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarView extends SimpleElementView {
  def setHeight(height: Double): Unit
}

object StatusBarView {
  @scala.inline
  def apply(
    destroy: () => Unit,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Unit,
    setHeight: Double => Unit
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), setHeight = js.Any.fromFunction1(setHeight))
    __obj.asInstanceOf[StatusBarView]
  }
}

