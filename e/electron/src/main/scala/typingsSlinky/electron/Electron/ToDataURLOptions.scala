package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToDataURLOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
}

object ToDataURLOptions {
  @scala.inline
  def apply(): ToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToDataURLOptions]
  }
  @scala.inline
  implicit class ToDataURLOptionsOps[Self <: ToDataURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
  }
  
}

