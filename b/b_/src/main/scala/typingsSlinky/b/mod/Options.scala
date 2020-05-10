package typingsSlinky.b.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var classSeparator: js.UndefOr[String] = js.native
  var elementSeparator: js.UndefOr[String] = js.native
  var isFullBoolValue: js.UndefOr[Boolean] = js.native
  var isFullModifier: js.UndefOr[Boolean] = js.native
  var modSeparator: js.UndefOr[String] = js.native
  var modValueSeparator: js.UndefOr[String] = js.native
  var tailSpace: js.UndefOr[String] = js.native
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
    def withClassSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withElementSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullBoolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFullBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullBoolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullModifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFullModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withModSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withModValueSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modValueSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModValueSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modValueSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withTailSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTailSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailSpace")(js.undefined)
        ret
    }
  }
  
}

