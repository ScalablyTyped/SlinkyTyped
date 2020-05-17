package typingsSlinky.emotionStyledBase.anon

import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeExclude extends js.Object {
  var theme: Exclude[_, js.UndefOr[scala.Nothing]] = js.native
}

object ThemeExclude {
  @scala.inline
  def apply(theme: Exclude[_, js.UndefOr[scala.Nothing]]): ThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExclude]
  }
  @scala.inline
  implicit class ThemeExcludeOps[Self <: ThemeExclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: Exclude[_, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

