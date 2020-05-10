package typingsSlinky.reactJss.mod

import typingsSlinky.jss.mod.Jss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStylesOptions extends BaseOptions {
  var injectTheme: js.UndefOr[Boolean] = js.native
  var jss: js.UndefOr[Jss] = js.native
}

object WithStylesOptions {
  @scala.inline
  def apply(): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions]
  }
  @scala.inline
  implicit class WithStylesOptionsOps[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInjectTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withJss(value: Jss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(js.undefined)
        ret
    }
  }
  
}

