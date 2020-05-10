package typingsSlinky.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdevice extends js.Object {
  def isAndroid(): Boolean = js.native
  def isFlat(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isIOS7(): Boolean = js.native
  def isWindows(): Boolean = js.native
}

object Typeofdevice {
  @scala.inline
  def apply(
    isAndroid: () => Boolean,
    isFlat: () => Boolean,
    isIOS: () => Boolean,
    isIOS7: () => Boolean,
    isWindows: () => Boolean
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal(isAndroid = js.Any.fromFunction0(isAndroid), isFlat = js.Any.fromFunction0(isFlat), isIOS = js.Any.fromFunction0(isIOS), isIOS7 = js.Any.fromFunction0(isIOS7), isWindows = js.Any.fromFunction0(isWindows))
    __obj.asInstanceOf[Typeofdevice]
  }
  @scala.inline
  implicit class TypeofdeviceOps[Self <: Typeofdevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAndroid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFlat(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIOS(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIOS7(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIOS7")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWindows(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindows")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

