package typingsSlinky.apolloCacheControl.mod

import typingsSlinky.apolloCacheControl.anon.pathArraystringnumberCach
import typingsSlinky.apolloCacheControl.apolloCacheControlNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheControlFormat extends js.Object {
  var hints: js.Array[pathArraystringnumberCach] = js.native
  var version: `1` = js.native
}

object CacheControlFormat {
  @scala.inline
  def apply(hints: js.Array[pathArraystringnumberCach], version: `1`): CacheControlFormat = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheControlFormat]
  }
  @scala.inline
  implicit class CacheControlFormatOps[Self <: CacheControlFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHints(value: js.Array[pathArraystringnumberCach]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

