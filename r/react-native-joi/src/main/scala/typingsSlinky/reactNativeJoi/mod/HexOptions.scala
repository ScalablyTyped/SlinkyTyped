package typingsSlinky.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexOptions extends js.Object {
  /**
    * hex decoded representation must be byte aligned.
    * @default false
    */
  var byteAligned: js.UndefOr[Boolean] = js.native
}

object HexOptions {
  @scala.inline
  def apply(): HexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexOptions]
  }
  @scala.inline
  implicit class HexOptionsOps[Self <: HexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteAligned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteAligned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteAligned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteAligned")(js.undefined)
        ret
    }
  }
  
}

