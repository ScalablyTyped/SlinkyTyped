package typingsSlinky.gulpInstall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowRoot: js.UndefOr[Boolean] = js.native
  var args: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreScripts: js.UndefOr[Boolean] = js.native
  var noOptional: js.UndefOr[Boolean] = js.native
  var production: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withArgs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
  }
  
}

