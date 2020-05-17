package typingsSlinky.reactFoundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clearfix extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.native
  var `float-center`: Boolean = js.native
  var `float-left`: Boolean = js.native
  var `float-right`: Boolean = js.native
  var hide: js.UndefOr[Boolean] = js.native
  var `hide-for-large`: Boolean = js.native
  var `hide-for-large-only`: Boolean = js.native
  var `hide-for-medium`: Boolean = js.native
  var `hide-for-medium-only`: Boolean = js.native
  var `hide-for-small-only`: Boolean = js.native
  var invisible: js.UndefOr[Boolean] = js.native
  var `show-for-landscape`: js.UndefOr[Boolean] = js.native
  var `show-for-large`: Boolean = js.native
  var `show-for-large-only`: Boolean = js.native
  var `show-for-medium`: Boolean = js.native
  var `show-for-medium-only`: Boolean = js.native
  var `show-for-portrait`: js.UndefOr[Boolean] = js.native
  var `show-for-small-only`: Boolean = js.native
  var `show-for-sr`: js.UndefOr[Boolean] = js.native
  var `show-on-focus`: js.UndefOr[Boolean] = js.native
}

object Clearfix {
  @scala.inline
  def apply(
    `float-center`: Boolean,
    `float-left`: Boolean,
    `float-right`: Boolean,
    `hide-for-large`: Boolean,
    `hide-for-large-only`: Boolean,
    `hide-for-medium`: Boolean,
    `hide-for-medium-only`: Boolean,
    `hide-for-small-only`: Boolean,
    `show-for-large`: Boolean,
    `show-for-large-only`: Boolean,
    `show-for-medium`: Boolean,
    `show-for-medium-only`: Boolean,
    `show-for-small-only`: Boolean
  ): Clearfix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("float-center")(`float-center`.asInstanceOf[js.Any])
    __obj.updateDynamic("float-left")(`float-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("float-right")(`float-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-large")(`hide-for-large`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-large-only")(`hide-for-large-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-medium")(`hide-for-medium`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-medium-only")(`hide-for-medium-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-small-only")(`hide-for-small-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-large")(`show-for-large`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-large-only")(`show-for-large-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-medium")(`show-for-medium`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-medium-only")(`show-for-medium-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-small-only")(`show-for-small-only`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearfix]
  }
  @scala.inline
  implicit class ClearfixOps[Self <: Clearfix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFloat-center`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float-center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFloat-left`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFloat-right`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHide-for-large`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide-for-large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHide-for-large-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide-for-large-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHide-for-medium`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide-for-medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHide-for-medium-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide-for-medium-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHide-for-small-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide-for-small-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-for-large`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-for-large-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-large-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-for-medium`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-for-medium-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-medium-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-for-small-only`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-small-only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearfix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInvisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-for-landscape`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-for-landscape`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-landscape")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-for-portrait`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-portrait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-for-portrait`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-portrait")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-for-sr`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-sr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-for-sr`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-for-sr")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-on-focus`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-on-focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-on-focus`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-on-focus")(js.undefined)
        ret
    }
  }
  
}

