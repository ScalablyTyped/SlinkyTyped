package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomMedia extends ICustomControl {
  var component: media = js.native
  var layoutRef: String = js.native
}

object ICustomMedia {
  @scala.inline
  def apply(component: media, label: String, layoutRef: String, ref: String, `type`: String): ICustomMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layoutRef = layoutRef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomMedia]
  }
  @scala.inline
  implicit class ICustomMediaOps[Self <: ICustomMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

