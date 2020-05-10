package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.findLoops.
  */
@js.native
trait IFindLoopsOptions extends IPointMatchOptions {
  /**
    * Flag to remove looped paths from the original model.
    */
  var removeFromOriginal: js.UndefOr[Boolean] = js.native
}

object IFindLoopsOptions {
  @scala.inline
  def apply(): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindLoopsOptions]
  }
  @scala.inline
  implicit class IFindLoopsOptionsOps[Self <: IFindLoopsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveFromOriginal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFromOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromOriginal")(js.undefined)
        ret
    }
  }
  
}

