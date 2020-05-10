package typingsSlinky.materialUiStyles.withThemeWithThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeCreatorOption[Theme] extends js.Object {
  var defaultTheme: js.UndefOr[Theme] = js.native
}

object WithThemeCreatorOption {
  @scala.inline
  def apply[Theme](): WithThemeCreatorOption[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithThemeCreatorOption[Theme]]
  }
  @scala.inline
  implicit class WithThemeCreatorOptionOps[Self[theme] <: WithThemeCreatorOption[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withDefaultTheme(value: Theme): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTheme: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(js.undefined)
        ret
    }
  }
  
}

