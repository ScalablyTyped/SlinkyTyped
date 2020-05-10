package typingsSlinky.polished.triangleConfigurationMod

import typingsSlinky.polished.sideKeywordMod.SideKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriangleConfiguration extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var foregroundColor: String = js.native
  var height: Double | String = js.native
  var pointingDirection: SideKeyword = js.native
  var width: Double | String = js.native
}

object TriangleConfiguration {
  @scala.inline
  def apply(
    foregroundColor: String,
    height: Double | String,
    pointingDirection: SideKeyword,
    width: Double | String
  ): TriangleConfiguration = {
    val __obj = js.Dynamic.literal(foregroundColor = foregroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pointingDirection = pointingDirection.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriangleConfiguration]
  }
  @scala.inline
  implicit class TriangleConfigurationOps[Self <: TriangleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointingDirection(value: SideKeyword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
  }
  
}

