package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.flexible
import typingsSlinky.electron.electronStrings.large
import typingsSlinky.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarSpacerConstructorOptions extends js.Object {
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[small | large | flexible] = js.native
}

object TouchBarSpacerConstructorOptions {
  @scala.inline
  def apply(): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarSpacerConstructorOptionsOps[Self <: TouchBarSpacerConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: small | large | flexible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

