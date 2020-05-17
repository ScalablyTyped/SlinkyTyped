package typingsSlinky.reactNativeMaterialUi.anon

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultActionsContainer extends js.Object {
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.native
}

object DefaultActionsContainer {
  @scala.inline
  def apply(): DefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultActionsContainer]
  }
  @scala.inline
  implicit class DefaultActionsContainerOps[Self <: DefaultActionsContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultActionsContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(null)
        ret
    }
  }
  
}

