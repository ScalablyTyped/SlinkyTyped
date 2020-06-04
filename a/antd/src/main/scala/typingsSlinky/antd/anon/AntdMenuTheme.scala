package typingsSlinky.antd.anon

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdMenuTheme extends js.Object {
  var antdMenuTheme: Requireable[String]
}

object AntdMenuTheme {
  @scala.inline
  def apply(antdMenuTheme: Requireable[String]): AntdMenuTheme = {
    val __obj = js.Dynamic.literal(antdMenuTheme = antdMenuTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntdMenuTheme]
  }
  @scala.inline
  implicit class AntdMenuThemeOps[Self <: AntdMenuTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntdMenuTheme(value: Requireable[String]): Self = this.set("antdMenuTheme", value.asInstanceOf[js.Any])
  }
  
}

