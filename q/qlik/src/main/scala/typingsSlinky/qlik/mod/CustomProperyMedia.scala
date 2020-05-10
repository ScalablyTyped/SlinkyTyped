package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.media
import typingsSlinky.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProperyMedia
  extends CustomPropertyCommon
     with CustomProperty {
  var component: media = js.native
  var layoutRef: js.UndefOr[String] = js.native
  @JSName("type")
  var type_CustomProperyMedia: string = js.native
}

object CustomProperyMedia {
  @scala.inline
  def apply(component: media, `type`: string): CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperyMedia]
  }
  @scala.inline
  implicit class CustomProperyMediaOps[Self <: CustomProperyMedia] (val x: Self) extends AnyVal {
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
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRef")(js.undefined)
        ret
    }
  }
  
}

