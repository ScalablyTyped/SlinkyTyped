package typingsSlinky.marko.configMod

import typingsSlinky.marko.markoStrings.html
import typingsSlinky.marko.markoStrings.vdom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var assumeUpToDate: js.UndefOr[Boolean] = js.native
  var autoKeyEnabled: js.UndefOr[Boolean] = js.native
  var checkUpToDate: js.UndefOr[Boolean] = js.native
  var escapeAtTags: js.UndefOr[Boolean] = js.native
  var ignoreUnrecognizedTags: js.UndefOr[Boolean] = js.native
  var output: js.UndefOr[vdom | html] = js.native
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  var writeToDisk: js.UndefOr[Boolean] = js.native
  var writeVersionComment: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeUpToDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeUpToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeUpToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeUpToDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoKeyEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoKeyEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoKeyEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoKeyEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckUpToDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkUpToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckUpToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkUpToDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeAtTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeAtTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeAtTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeAtTags")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnrecognizedTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnrecognizedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnrecognizedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnrecognizedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: vdom | html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteToDisk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteToDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteVersionComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeVersionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteVersionComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeVersionComment")(js.undefined)
        ret
    }
  }
  
}

