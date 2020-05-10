package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeftIconColor extends js.Object {
  var leftIconColor: js.UndefOr[String] = js.native
  var nestedLevelDepth: js.UndefOr[Double] = js.native
  var rightIconColor: js.UndefOr[String] = js.native
  var secondaryTextColor: js.UndefOr[String] = js.native
}

object AnonLeftIconColor {
  @scala.inline
  def apply(): AnonLeftIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLeftIconColor]
  }
  @scala.inline
  implicit class AnonLeftIconColorOps[Self <: AnonLeftIconColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedLevelDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedLevelDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedLevelDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedLevelDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(js.undefined)
        ret
    }
  }
  
}

