package typingsSlinky.antd

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntdMenuTheme extends js.Object {
  var antdMenuTheme: Requireable[String] = js.native
}

object AnonAntdMenuTheme {
  @scala.inline
  def apply(antdMenuTheme: Requireable[String]): AnonAntdMenuTheme = {
    val __obj = js.Dynamic.literal(antdMenuTheme = antdMenuTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntdMenuTheme]
  }
  @scala.inline
  implicit class AnonAntdMenuThemeOps[Self <: AnonAntdMenuTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntdMenuTheme(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antdMenuTheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

