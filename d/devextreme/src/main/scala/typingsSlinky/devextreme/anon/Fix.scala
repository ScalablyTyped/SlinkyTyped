package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fix extends js.Object {
  var fix: js.UndefOr[String] = js.native
  var leftPosition: js.UndefOr[String] = js.native
  var rightPosition: js.UndefOr[String] = js.native
  var unfix: js.UndefOr[String] = js.native
}

object Fix {
  @scala.inline
  def apply(): Fix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fix]
  }
  @scala.inline
  implicit class FixOps[Self <: Fix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRightPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfix")(js.undefined)
        ret
    }
  }
  
}

