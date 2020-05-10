package typingsSlinky.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnEditor extends js.Object {
  // tslint:disable-next-line ban-types
  var closeEditor: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var openEditor: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.native
}

object ColumnEditor {
  @scala.inline
  def apply(): ColumnEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnEditor]
  }
  @scala.inline
  implicit class ColumnEditorOps[Self <: ColumnEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseEditor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenEditor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
  }
  
}

