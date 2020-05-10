package typingsSlinky.reactNativeMaterialUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarStyle extends js.Object {
  var centerElementContainer: js.UndefOr[ViewStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var leftElement: js.UndefOr[TextStyle] = js.native
  var leftElementContainer: js.UndefOr[ViewStyle] = js.native
  var rightElement: js.UndefOr[TextStyle] = js.native
  var rightElementContainer: js.UndefOr[ViewStyle] = js.native
  var titleText: js.UndefOr[TextStyle] = js.native
}

object ToolbarStyle {
  @scala.inline
  def apply(): ToolbarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarStyle]
  }
  @scala.inline
  implicit class ToolbarStyleOps[Self <: ToolbarStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterElementContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerElementContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterElementContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerElementContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterElementContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerElementContainer")(null)
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withLeftElement(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(null)
        ret
    }
    @scala.inline
    def withLeftElementContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElementContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftElementContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElementContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElementContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElementContainer")(null)
        ret
    }
    @scala.inline
    def withRightElement(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRightElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(null)
        ret
    }
    @scala.inline
    def withRightElementContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElementContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElementContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElementContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withRightElementContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElementContainer")(null)
        ret
    }
    @scala.inline
    def withTitleText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(null)
        ret
    }
  }
  
}

