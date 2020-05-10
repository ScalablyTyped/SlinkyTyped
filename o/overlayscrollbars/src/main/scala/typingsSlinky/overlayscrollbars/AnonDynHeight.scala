package typingsSlinky.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDynHeight extends js.Object {
  var dynHeight: js.UndefOr[Boolean] = js.native
  var dynWidth: js.UndefOr[Boolean] = js.native
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.native
}

object AnonDynHeight {
  @scala.inline
  def apply(): AnonDynHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDynHeight]
  }
  @scala.inline
  implicit class AnonDynHeightOps[Self <: AnonDynHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDynWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedAttrs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritedAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedAttrs")(null)
        ret
    }
  }
  
}

