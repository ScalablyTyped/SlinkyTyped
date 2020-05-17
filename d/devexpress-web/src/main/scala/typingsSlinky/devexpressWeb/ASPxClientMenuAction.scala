package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientMenuAction extends js.Object {
  var clickAction: js.Function = js.native
  var container: String = js.native
  var disabled: Boolean = js.native
  var hasSeparator: Boolean = js.native
  var hotKey: ASPxClientMenuActionHotKey = js.native
  var imageClassName: String = js.native
  var imageTemplateName: String = js.native
  var text: String = js.native
  var visible: Boolean = js.native
}

object ASPxClientMenuAction {
  @scala.inline
  def apply(
    clickAction: js.Function,
    container: String,
    disabled: Boolean,
    hasSeparator: Boolean,
    hotKey: ASPxClientMenuActionHotKey,
    imageClassName: String,
    imageTemplateName: String,
    text: String,
    visible: Boolean
  ): ASPxClientMenuAction = {
    val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasSeparator = hasSeparator.asInstanceOf[js.Any], hotKey = hotKey.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageTemplateName = imageTemplateName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuAction]
  }
  @scala.inline
  implicit class ASPxClientMenuActionOps[Self <: ASPxClientMenuAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickAction(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotKey(value: ASPxClientMenuActionHotKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

