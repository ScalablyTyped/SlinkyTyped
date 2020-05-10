package typingsSlinky.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileOptions extends js.Object {
  var assumeObjects: js.UndefOr[Boolean] = js.native
  var compat: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[Boolean] = js.native
  var explicitPartialContext: js.UndefOr[Boolean] = js.native
  var ignoreStandalone: js.UndefOr[Boolean] = js.native
  var knownHelpers: js.UndefOr[KnownHelpers] = js.native
  var knownHelpersOnly: js.UndefOr[Boolean] = js.native
  var noEscape: js.UndefOr[Boolean] = js.native
  var preventIndent: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object CompileOptions {
  @scala.inline
  def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withCompat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compat")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitPartialContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitPartialContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitPartialContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitPartialContext")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreStandalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreStandalone")(js.undefined)
        ret
    }
    @scala.inline
    def withKnownHelpers(value: KnownHelpers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownHelpers")(js.undefined)
        ret
    }
    @scala.inline
    def withKnownHelpersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownHelpersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownHelpersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownHelpersOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

