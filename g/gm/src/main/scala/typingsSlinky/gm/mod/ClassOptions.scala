package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassOptions extends js.Object {
  var appPath: js.UndefOr[String] = js.native
  var imageMagick: js.UndefOr[Boolean] = js.native
  var nativeAutoOrient: js.UndefOr[Boolean] = js.native
}

object ClassOptions {
  @scala.inline
  def apply(): ClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassOptions]
  }
  @scala.inline
  implicit class ClassOptionsOps[Self <: ClassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPath")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMagick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMagick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMagick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMagick")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeAutoOrient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAutoOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeAutoOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAutoOrient")(js.undefined)
        ret
    }
  }
  
}

