package typingsSlinky.qunitDom.anon

import typingsSlinky.qunitDom.qunitDomBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  var any: `true` = js.native
}

object Any {
  @scala.inline
  def apply(any: `true`): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAny(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

