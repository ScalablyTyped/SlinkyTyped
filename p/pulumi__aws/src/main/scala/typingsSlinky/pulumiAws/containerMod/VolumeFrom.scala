package typingsSlinky.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeFrom extends js.Object {
  var readOnly: js.UndefOr[Boolean] = js.native
  var sourceContainer: js.UndefOr[String] = js.native
}

object VolumeFrom {
  @scala.inline
  def apply(): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFrom]
  }
  @scala.inline
  implicit class VolumeFromOps[Self <: VolumeFrom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContainer")(js.undefined)
        ret
    }
  }
  
}

