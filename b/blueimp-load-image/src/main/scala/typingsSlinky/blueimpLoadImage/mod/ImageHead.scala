package typingsSlinky.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageHead extends js.Object {
  var imageHead: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array] = js.native
}

object ImageHead {
  @scala.inline
  def apply(): ImageHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHead]
  }
  @scala.inline
  implicit class ImageHeadOps[Self <: ImageHead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageHeadUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageHeadArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageHead(value: js.typedarray.ArrayBuffer | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHead")(js.undefined)
        ret
    }
  }
  
}

