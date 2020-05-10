package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptions extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.native
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.native
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  var providers: js.UndefOr[js.Array[StaticProvider]] = js.native
  var useJit: js.UndefOr[Boolean] = js.native
}

object CompilerOptions {
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultEncapsulation(value: ViewEncapsulation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncapsulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncapsulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncapsulation")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingTranslation(value: MissingTranslationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[StaticProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJit")(js.undefined)
        ret
    }
  }
  
}

