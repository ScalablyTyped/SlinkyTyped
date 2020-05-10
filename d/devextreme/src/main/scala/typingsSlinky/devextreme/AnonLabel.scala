package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabel extends js.Object {
  var label: js.UndefOr[AnonCustomizeTextFormat] = js.native
  var separatorHeight: js.UndefOr[Double] = js.native
  var textLeftIndent: js.UndefOr[Double] = js.native
  var textTopIndent: js.UndefOr[Double] = js.native
  var topIndent: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AnonLabel {
  @scala.inline
  def apply(): AnonLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabel]
  }
  @scala.inline
  implicit class AnonLabelOps[Self <: AnonLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: AnonCustomizeTextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatorHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLeftIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLeftIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTopIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTopIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTopIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTopIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withTopIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topIndent")(js.undefined)
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
  }
  
}

