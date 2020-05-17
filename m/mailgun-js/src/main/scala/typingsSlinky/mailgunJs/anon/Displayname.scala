package typingsSlinky.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displayname extends js.Object {
  var display_name: String | Null = js.native
  var domain: String = js.native
  var local_part: String = js.native
}

object Displayname {
  @scala.inline
  def apply(domain: String, local_part: String): Displayname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  @scala.inline
  implicit class DisplaynameOps[Self <: Displayname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal_part(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(null)
        ret
    }
  }
  
}

