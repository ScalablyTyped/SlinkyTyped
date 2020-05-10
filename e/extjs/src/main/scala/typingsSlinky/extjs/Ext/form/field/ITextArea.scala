package typingsSlinky.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextArea extends IText {
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.native
}

object ITextArea {
  @scala.inline
  def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  @scala.inline
  implicit class ITextAreaOps[Self <: ITextArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterIsSpecial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterIsSpecial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterIsSpecial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterIsSpecial")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

