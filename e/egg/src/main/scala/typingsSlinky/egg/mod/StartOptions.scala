package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOptions extends js.Object {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.native
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.native
  /** ignore single process mode warning */
  var ignoreWarning: js.UndefOr[Boolean] = js.native
}

object StartOptions {
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarning")(js.undefined)
        ret
    }
  }
  
}

