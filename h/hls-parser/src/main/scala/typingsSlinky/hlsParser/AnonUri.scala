package typingsSlinky.hlsParser

import typingsSlinky.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUri extends js.Object {
  var byterange: js.UndefOr[Byterange] = js.native
  var uri: String = js.native
}

object AnonUri {
  @scala.inline
  def apply(uri: String): AnonUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUri]
  }
  @scala.inline
  implicit class AnonUriOps[Self <: AnonUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByterange(value: Byterange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byterange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByterange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byterange")(js.undefined)
        ret
    }
  }
  
}

