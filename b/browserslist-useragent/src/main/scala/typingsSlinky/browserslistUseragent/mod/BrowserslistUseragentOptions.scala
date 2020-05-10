package typingsSlinky.browserslistUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserslistUseragentOptions extends js.Object {
  var allowHigherVersions: js.UndefOr[Boolean] = js.native
  var browsers: js.UndefOr[js.Array[String]] = js.native
  var env: js.UndefOr[String] = js.native
  var ignoreMinor: js.UndefOr[Boolean] = js.native
  var ignorePath: js.UndefOr[Boolean] = js.native
}

object BrowserslistUseragentOptions {
  @scala.inline
  def apply(): BrowserslistUseragentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserslistUseragentOptions]
  }
  @scala.inline
  implicit class BrowserslistUseragentOptionsOps[Self <: BrowserslistUseragentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHigherVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHigherVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHigherVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHigherVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMinor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMinor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMinor")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
  }
  
}

