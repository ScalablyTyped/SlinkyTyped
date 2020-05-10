package typingsSlinky.officeUiFabricReact.personaCoinBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaState extends js.Object {
  var isImageError: js.UndefOr[Boolean] = js.native
  var isImageLoaded: js.UndefOr[Boolean] = js.native
}

object IPersonaState {
  @scala.inline
  def apply(): IPersonaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaState]
  }
  @scala.inline
  implicit class IPersonaStateOps[Self <: IPersonaState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsImageError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImageError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withIsImageLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImageLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsImageLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImageLoaded")(js.undefined)
        ret
    }
  }
  
}

