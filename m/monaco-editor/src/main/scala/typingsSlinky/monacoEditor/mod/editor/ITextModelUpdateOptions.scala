package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextModelUpdateOptions extends js.Object {
  var indentSize: js.UndefOr[Double] = js.native
  var insertSpaces: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.native
}

object ITextModelUpdateOptions {
  @scala.inline
  def apply(): ITextModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextModelUpdateOptions]
  }
  @scala.inline
  implicit class ITextModelUpdateOptionsOps[Self <: ITextModelUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimAutoWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimAutoWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimAutoWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimAutoWhitespace")(js.undefined)
        ret
    }
  }
  
}

