package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy
import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultEncapsulation extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.native
  var jitDevMode: js.UndefOr[Boolean] = js.native
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.native
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  var strictInjectionParameters: js.UndefOr[Boolean] = js.native
  var useJit: js.UndefOr[Boolean] = js.native
}

object DefaultEncapsulation {
  @scala.inline
  def apply(): DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultEncapsulation]
  }
  @scala.inline
  implicit class DefaultEncapsulationOps[Self <: DefaultEncapsulation] (val x: Self) extends AnyVal {
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
    def withJitDevMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitDevMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitDevMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitDevMode")(js.undefined)
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
    def withMissingTranslationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(null)
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
    def withStrictInjectionParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictInjectionParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictInjectionParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictInjectionParameters")(js.undefined)
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

