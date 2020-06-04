package typingsSlinky.emotionStyledBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeTheme[Theme /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object ThemeTheme {
  @scala.inline
  def apply[/* <: js.Object */ Theme](): ThemeTheme[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTheme[Theme]]
  }
  @scala.inline
  implicit class ThemeThemeOps[Self <: ThemeTheme[_], /* <: js.Object */ Theme] (val x: Self with ThemeTheme[Theme]) extends AnyVal {
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
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

