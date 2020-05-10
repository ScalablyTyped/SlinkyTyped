package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryPositionOptions extends js.Object {
  var at: js.UndefOr[String] = js.native
  var collision: js.UndefOr[String] = js.native
  var my: js.UndefOr[String] = js.native
  var of: js.UndefOr[js.Any] = js.native
  var using: js.UndefOr[js.Function] = js.native
  var within: js.UndefOr[js.Any] = js.native
}

object JQueryPositionOptions {
  @scala.inline
  def apply(): JQueryPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPositionOptions]
  }
  @scala.inline
  implicit class JQueryPositionOptionsOps[Self <: JQueryPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
    @scala.inline
    def withCollision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withMy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
    @scala.inline
    def withOf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(js.undefined)
        ret
    }
    @scala.inline
    def withUsing(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.undefined)
        ret
    }
    @scala.inline
    def withWithin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("within")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("within")(js.undefined)
        ret
    }
  }
  
}

