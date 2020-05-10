package typingsSlinky.eslintScope.mod

import typingsSlinky.eslintScope.eslintScopeStrings.module
import typingsSlinky.eslintScope.eslintScopeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisOptions extends js.Object {
  var directive: js.UndefOr[Boolean] = js.native
  var ecmaVersion: js.UndefOr[Double] = js.native
  var fallback: js.UndefOr[String | (js.Function1[/* node */ js.Object, js.Array[String]])] = js.native
  var ignoreEval: js.UndefOr[Boolean] = js.native
  var impliedStrict: js.UndefOr[Boolean] = js.native
  var nodejsScope: js.UndefOr[Boolean] = js.native
  var optimistic: js.UndefOr[Boolean] = js.native
  var sourceType: js.UndefOr[script | module] = js.native
}

object AnalysisOptions {
  @scala.inline
  def apply(): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisOptions]
  }
  @scala.inline
  implicit class AnalysisOptionsOps[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackFunction1(value: /* node */ js.Object => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallback(value: String | (js.Function1[/* node */ js.Object, js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEval")(js.undefined)
        ret
    }
    @scala.inline
    def withImpliedStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impliedStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpliedStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impliedStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withNodejsScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodejsScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodejsScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodejsScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimistic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimistic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
  }
  
}

