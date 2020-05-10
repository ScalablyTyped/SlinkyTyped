package typingsSlinky.antDesignProLayout.themeColorMod

import typingsSlinky.antDesignProLayout.AnonColor
import typingsSlinky.antDesignProLayout.AnonDefaultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColorProps extends js.Object {
  var colors: js.UndefOr[js.Array[AnonColor]] = js.native
  var title: js.UndefOr[String] = js.native
  var value: String = js.native
  def formatMessage(data: AnonDefaultMessage): String = js.native
  def onChange(color: String): Unit = js.native
}

object ThemeColorProps {
  @scala.inline
  def apply(formatMessage: AnonDefaultMessage => String, onChange: String => Unit, value: String): ThemeColorProps = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorProps]
  }
  @scala.inline
  implicit class ThemeColorPropsOps[Self <: ThemeColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatMessage(value: AnonDefaultMessage => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: js.Array[AnonColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

