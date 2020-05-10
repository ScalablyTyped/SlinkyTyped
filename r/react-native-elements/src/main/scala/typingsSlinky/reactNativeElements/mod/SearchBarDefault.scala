package typingsSlinky.reactNativeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarDefault extends SearchBarBase {
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[Boolean] = js.native
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.native
}

object SearchBarDefault {
  @scala.inline
  def apply(): SearchBarDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarDefault]
  }
  @scala.inline
  implicit class SearchBarDefaultOps[Self <: SearchBarDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLightTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
  }
  
}

