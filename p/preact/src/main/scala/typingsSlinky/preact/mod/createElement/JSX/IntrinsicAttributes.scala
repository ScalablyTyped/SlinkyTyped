package typingsSlinky.preact.mod.createElement.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicAttributes extends js.Object {
  var key: js.UndefOr[js.Any] = js.native
}

object IntrinsicAttributes {
  @scala.inline
  def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  @scala.inline
  implicit class IntrinsicAttributesOps[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: js.Any): Self = {
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
  }
  
}

