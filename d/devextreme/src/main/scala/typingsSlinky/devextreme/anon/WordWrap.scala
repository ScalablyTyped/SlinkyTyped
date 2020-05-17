package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordWrap extends js.Object {
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object WordWrap {
  @scala.inline
  def apply(): WordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrap]
  }
  @scala.inline
  implicit class WordWrapOps[Self <: WordWrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: ellipsis | hide | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: normal | breakWord | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

