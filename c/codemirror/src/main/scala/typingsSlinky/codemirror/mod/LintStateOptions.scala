package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * async specifies that the lint process runs asynchronously. hasGutters specifies that lint errors should be displayed in the CodeMirror
  * gutter, note that you must use this in conjunction with [ "CodeMirror-lint-markers" ] as an element in the gutters argument on
  * initialization of the CodeMirror instance.
  */
@js.native
trait LintStateOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var hasGutters: js.UndefOr[Boolean] = js.native
  var onUpdateLinting: js.UndefOr[
    js.Function3[
      /* annotationsNotSorted */ js.Array[Annotation], 
      /* annotations */ js.Array[Annotation], 
      /* codeMirror */ Editor, 
      Unit
    ]
  ] = js.native
}

object LintStateOptions {
  @scala.inline
  def apply(): LintStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintStateOptions]
  }
  @scala.inline
  implicit class LintStateOptionsOps[Self <: LintStateOptions] (val x: Self) extends AnyVal {
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
    def withHasGutters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasGutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasGutters")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateLinting(
      value: (/* annotationsNotSorted */ js.Array[Annotation], /* annotations */ js.Array[Annotation], /* codeMirror */ Editor) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateLinting")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnUpdateLinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateLinting")(js.undefined)
        ret
    }
  }
  
}

