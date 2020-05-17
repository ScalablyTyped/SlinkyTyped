package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton extends ActionBase {
  /**
    * The URL to an image that will be used to represent the action. This property will be used as a background image for the node. It may be used in conjunction with the `className` property or by itself. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: String = js.native
}

object ActionButton {
  @scala.inline
  def apply(
    active: Boolean,
    className: String,
    disabled: Boolean,
    id: String,
    image: String,
    title: String,
    `type`: String,
    visible: Boolean
  ): ActionButton = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
  @scala.inline
  implicit class ActionButtonOps[Self <: ActionButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

