package typingsSlinky.nodeJose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowEmbeddedKey extends js.Object {
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
}

object AnonAllowEmbeddedKey {
  @scala.inline
  def apply(): AnonAllowEmbeddedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowEmbeddedKey]
  }
  @scala.inline
  implicit class AnonAllowEmbeddedKeyOps[Self <: AnonAllowEmbeddedKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmbeddedKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmbeddedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmbeddedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmbeddedKey")(js.undefined)
        ret
    }
  }
  
}

