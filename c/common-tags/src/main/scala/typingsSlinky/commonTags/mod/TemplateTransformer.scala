package typingsSlinky.commonTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateTransformer[TCtx] extends js.Object {
  /**
    * Called before everything else.
    * The result of this hook will be passed to other hooks as `context`.
    * If omitted, `context` will be an empty object.
    */
  var getInitialContext: js.UndefOr[js.Function0[TCtx]] = js.native
  /**
    * Called when all substitutions have been parsed
    * `endResult` is the final value.
    */
  var onEndResult: js.UndefOr[js.Function2[/* endResult */ String, /* context */ TCtx, String]] = js.native
  /**
    * Called when the tag encounters a string.
    * (a string is whatever's not inside "${}" in your template literal)
    * `str` is the value of the current string
    */
  var onString: js.UndefOr[js.Function2[/* str */ String, /* context */ TCtx, String]] = js.native
  /**
    * Called when the tag encounters a substitution.
    * (a substitution is whatever's inside "${}" in your template literal)
    * `substitution` is the value of the current substitution
    * `resultSoFar` is the end result up to the point of this substitution
    */
  var onSubstitution: js.UndefOr[
    js.Function3[/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx, String]
  ] = js.native
}

object TemplateTransformer {
  @scala.inline
  def apply[TCtx](): TemplateTransformer[TCtx] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateTransformer[TCtx]]
  }
  @scala.inline
  implicit class TemplateTransformerOps[Self[tctx] <: TemplateTransformer[tctx], TCtx] (val x: Self[TCtx]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCtx] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCtx]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCtx] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCtx] with Other]
    @scala.inline
    def withGetInitialContext(value: () => TCtx): Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInitialContext: Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialContext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndResult(value: (/* endResult */ String, /* context */ TCtx) => String): Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndResult")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEndResult: Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOnString(value: (/* str */ String, /* context */ TCtx) => String): Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnString: Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onString")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubstitution(value: (/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx) => String): Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubstitution")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSubstitution: Self[TCtx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubstitution")(js.undefined)
        ret
    }
  }
  
}

