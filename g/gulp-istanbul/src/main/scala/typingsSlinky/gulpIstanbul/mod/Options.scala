package typingsSlinky.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var codeGenerationOptions: js.UndefOr[js.Object] = js.native
  var coverageVariable: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var embedSource: js.UndefOr[Boolean] = js.native
  var includeUntested: js.UndefOr[Boolean] = js.native
  var noAutoWrap: js.UndefOr[Boolean] = js.native
  var noCompact: js.UndefOr[Boolean] = js.native
  var preserveComments: js.UndefOr[Boolean] = js.native
  var walkDebug: js.UndefOr[Boolean] = js.native
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
    def withCodeGenerationOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeGenerationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeGenerationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeGenerationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUntested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUntested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUntested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUntested")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAutoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAutoWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAutoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAutoWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompact")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalkDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkDebug")(js.undefined)
        ret
    }
  }
  
}

