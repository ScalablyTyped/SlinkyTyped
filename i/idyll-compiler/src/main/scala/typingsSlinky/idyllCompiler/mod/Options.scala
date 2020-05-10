package typingsSlinky.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If false and there is no postprocessors, compiler returns the AST synchronously
    * Otherwise, a promise is returned
    *
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * compiler plugins
    * If provided, compiler always compiles asynchronously
    */
  var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.native
  var smartquotes: js.UndefOr[Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
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
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessors(value: js.Array[PostProcessor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartquotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartquotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartquotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartquotes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
  }
  
}

