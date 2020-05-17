package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  def getImageSize(): Size = js.native
  def setImageSize(size: Size): Unit = js.native
}

object Icon {
  @scala.inline
  def apply(getImageSize: () => Size, setImageSize: Size => Unit): Icon = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), setImageSize = js.Any.fromFunction1(setImageSize))
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetImageSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetImageSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

