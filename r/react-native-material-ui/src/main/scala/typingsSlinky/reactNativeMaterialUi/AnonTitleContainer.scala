package typingsSlinky.reactNativeMaterialUi

import typingsSlinky.reactNativeMaterialUi.mod.TextStyle
import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTitleContainer extends js.Object {
  var titleContainer: js.UndefOr[ViewStyle] = js.native
  var titleText: js.UndefOr[TextStyle] = js.native
}

object AnonTitleContainer {
  @scala.inline
  def apply(): AnonTitleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTitleContainer]
  }
  @scala.inline
  implicit class AnonTitleContainerOps[Self <: AnonTitleContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitleContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleContainer")(null)
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

