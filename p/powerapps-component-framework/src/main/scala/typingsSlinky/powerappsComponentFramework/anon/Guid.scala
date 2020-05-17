package typingsSlinky.powerappsComponentFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guid extends js.Object {
  var guid: String = js.native
}

object Guid {
  @scala.inline
  def apply(guid: String): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  @scala.inline
  implicit class GuidOps[Self <: Guid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

