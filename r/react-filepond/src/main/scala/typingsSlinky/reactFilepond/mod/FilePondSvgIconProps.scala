package typingsSlinky.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondSvgIconProps extends js.Object {
  var iconProcess: js.UndefOr[String] = js.native
  var iconRemove: js.UndefOr[String] = js.native
  var iconRetry: js.UndefOr[String] = js.native
  var iconUndo: js.UndefOr[String] = js.native
}

object FilePondSvgIconProps {
  @scala.inline
  def apply(): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
  @scala.inline
  implicit class FilePondSvgIconPropsOps[Self <: FilePondSvgIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconProcess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUndo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUndo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUndo")(js.undefined)
        ret
    }
  }
  
}

