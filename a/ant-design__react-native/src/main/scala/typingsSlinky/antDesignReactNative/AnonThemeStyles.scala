package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThemeStyles extends js.Object {
  def themeStyles(): Unit = js.native
}

object AnonThemeStyles {
  @scala.inline
  def apply(themeStyles: () => Unit): AnonThemeStyles = {
    val __obj = js.Dynamic.literal(themeStyles = js.Any.fromFunction0(themeStyles))
    __obj.asInstanceOf[AnonThemeStyles]
  }
  @scala.inline
  implicit class AnonThemeStylesOps[Self <: AnonThemeStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThemeStyles(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeStyles")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

