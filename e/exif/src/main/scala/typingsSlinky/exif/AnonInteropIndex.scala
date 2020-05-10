package typingsSlinky.exif

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInteropIndex extends js.Object {
  var InteropIndex: js.UndefOr[String] = js.native
  var InteropVersion: js.UndefOr[Buffer] = js.native
}

object AnonInteropIndex {
  @scala.inline
  def apply(): AnonInteropIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInteropIndex]
  }
  @scala.inline
  implicit class AnonInteropIndexOps[Self <: AnonInteropIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteropIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteropIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInteropVersion(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteropVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropVersion")(js.undefined)
        ret
    }
  }
  
}

