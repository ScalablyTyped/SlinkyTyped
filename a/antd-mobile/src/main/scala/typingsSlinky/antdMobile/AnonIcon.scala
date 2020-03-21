package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: ReactElement
  var mode: String
  var prefixCls: String
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(icon: ReactElement, mode: String, onClick: () => Unit, prefixCls: String): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIcon]
  }
}

