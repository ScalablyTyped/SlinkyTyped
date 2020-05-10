package typingsSlinky.reactNativeMaterialUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemStyle extends js.Object {
  var LeftElement: js.UndefOr[TextStyle] = js.native
  var centerElementContainer: js.UndefOr[ViewStyle] = js.native
  var container: js.UndefOr[ViewStyle] = js.native
  var content: js.UndefOr[ViewStyle] = js.native
  var contentViewContainer: js.UndefOr[ViewStyle] = js.native
  var firstLine: js.UndefOr[TextStyle] = js.native
  var leftElementContainer: js.UndefOr[ViewStyle] = js.native
  var primaryText: js.UndefOr[TextStyle] = js.native
  var primaryTextContainer: js.UndefOr[ViewStyle] = js.native
  var rightElement: js.UndefOr[TextStyle] = js.native
  var rightElementContainer: js.UndefOr[ViewStyle] = js.native
  var secondaryText: js.UndefOr[TextStyle] = js.native
  var tertiaryText: js.UndefOr[TextStyle] = js.native
  var textViewContainer: js.UndefOr[ViewStyle] = js.native
}

object ListItemStyle {
  @scala.inline
  def apply(): ListItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemStyle]
  }
  @scala.inline
  implicit class ListItemStyleOps[Self <: ListItemStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftElement(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftElement")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftElement")(null)
        ret
    }
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
    def withContent(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(null)
        ret
    }
    @scala.inline
    def withContentViewContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentViewContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentViewContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentViewContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentViewContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentViewContainer")(null)
        ret
    }
    @scala.inline
    def withFirstLine(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(null)
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
    def withPrimaryText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(null)
        ret
    }
    @scala.inline
    def withPrimaryTextContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTextContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryTextContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTextContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryTextContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTextContainer")(null)
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
    def withSecondaryText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(null)
        ret
    }
    @scala.inline
    def withTertiaryText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTertiaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withTertiaryTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(null)
        ret
    }
    @scala.inline
    def withTextViewContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextViewContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTextViewContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewContainer")(null)
        ret
    }
  }
  
}

