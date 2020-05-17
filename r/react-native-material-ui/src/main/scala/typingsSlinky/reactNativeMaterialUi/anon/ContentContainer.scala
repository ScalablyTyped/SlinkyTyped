package typingsSlinky.reactNativeMaterialUi.anon

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentContainer extends js.Object {
  var contentContainer: js.UndefOr[ViewStyle] = js.native
}

object ContentContainer {
  @scala.inline
  def apply(): ContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentContainer]
  }
  @scala.inline
  implicit class ContentContainerOps[Self <: ContentContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(null)
        ret
    }
  }
  
}

