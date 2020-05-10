package typingsSlinky.megajs.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkOptions extends js.Object {
  var key: js.UndefOr[String | Buffer] = js.native
  var noKey: js.UndefOr[Boolean] = js.native
}

object LinkOptions {
  @scala.inline
  def apply(): LinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOptions]
  }
  @scala.inline
  implicit class LinkOptionsOps[Self <: LinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withNoKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noKey")(js.undefined)
        ret
    }
  }
  
}

