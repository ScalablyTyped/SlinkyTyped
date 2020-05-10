package typingsSlinky.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomain extends js.Object {
  var allow: js.Array[CrossStorageMethod] = js.native
  var origin: js.RegExp = js.native
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[CrossStorageMethod], origin: js.RegExp): SubDomain = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
  @scala.inline
  implicit class SubDomainOps[Self <: SubDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: js.Array[CrossStorageMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

