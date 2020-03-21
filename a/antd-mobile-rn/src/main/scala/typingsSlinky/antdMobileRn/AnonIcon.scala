package typingsSlinky.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: ReactElement
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(
    icon: ReactElement,
    mode: String,
    onClick: () => Unit,
    styles: StringDictionary[RegisteredStyle[_]]
  ): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIcon]
  }
}

