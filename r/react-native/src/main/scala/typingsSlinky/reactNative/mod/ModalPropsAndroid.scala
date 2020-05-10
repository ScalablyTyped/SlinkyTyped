package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalPropsAndroid extends js.Object {
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
}

object ModalPropsAndroid {
  @scala.inline
  def apply(): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalPropsAndroid]
  }
  @scala.inline
  implicit class ModalPropsAndroidOps[Self <: ModalPropsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardwareAccelerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareAccelerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(js.undefined)
        ret
    }
  }
  
}

