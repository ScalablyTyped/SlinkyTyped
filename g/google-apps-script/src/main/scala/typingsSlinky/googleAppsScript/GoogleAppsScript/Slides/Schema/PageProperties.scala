package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageProperties extends js.Object {
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.native
}

object PageProperties {
  @scala.inline
  def apply(): PageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageProperties]
  }
  @scala.inline
  implicit class PagePropertiesOps[Self <: PageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorScheme(value: ColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBackgroundFill(value: PageBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBackgroundFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBackgroundFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBackgroundFill")(js.undefined)
        ret
    }
  }
  
}

