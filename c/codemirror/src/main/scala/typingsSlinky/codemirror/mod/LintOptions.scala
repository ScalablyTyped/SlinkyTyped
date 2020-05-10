package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds the getAnnotations callback to LintStateOptions which may be overridden by the user if they choose use their own
  * linter.
  */
@js.native
trait LintOptions extends LintStateOptions {
  var getAnnotations: js.UndefOr[Linter | AsyncLinter] = js.native
}

object LintOptions {
  @scala.inline
  def apply(): LintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintOptions]
  }
  @scala.inline
  implicit class LintOptionsOps[Self <: LintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnnotationsFunction4(
      value: (/* content */ String, /* updateLintingCallback */ UpdateLintingCallback, /* options */ LintStateOptions, /* codeMirror */ Editor) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetAnnotationsFunction3(
      value: (/* content */ String, /* options */ LintStateOptions, /* codeMirror */ Editor) => js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetAnnotations(value: Linter | AsyncLinter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.undefined)
        ret
    }
  }
  
}

