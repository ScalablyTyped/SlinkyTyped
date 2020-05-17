package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingNull extends js.Object {
  var encoding: js.UndefOr[Null] = js.native
  var flag: js.UndefOr[String | Double] = js.native
}

object EncodingNull {
  @scala.inline
  def apply(): EncodingNull = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingNull]
  }
  @scala.inline
  implicit class EncodingNullOps[Self <: EncodingNull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
  }
  
}

