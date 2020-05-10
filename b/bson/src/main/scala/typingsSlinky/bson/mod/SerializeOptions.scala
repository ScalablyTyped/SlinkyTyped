package typingsSlinky.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeOptions extends CommonSerializeOptions {
  /** {default:1024*1024*17}, minimum size of the internal temporary serialization buffer. */
  var minInternalBufferSize: js.UndefOr[scala.Double] = js.native
}

object SerializeOptions {
  @scala.inline
  def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  @scala.inline
  implicit class SerializeOptionsOps[Self <: SerializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinInternalBufferSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInternalBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinInternalBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInternalBufferSize")(js.undefined)
        ret
    }
  }
  
}

