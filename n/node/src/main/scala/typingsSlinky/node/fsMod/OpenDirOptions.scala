package typingsSlinky.node.fsMod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDirOptions extends js.Object {
  /**
    * Number of directory entries that are buffered
    * internally when reading from the directory. Higher values lead to better
    * performance but higher memory usage.
    * @default 32
    */
  var bufferSize: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
}

object OpenDirOptions {
  @scala.inline
  def apply(): OpenDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDirOptions]
  }
  @scala.inline
  implicit class OpenDirOptionsOps[Self <: OpenDirOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
  }
  
}

