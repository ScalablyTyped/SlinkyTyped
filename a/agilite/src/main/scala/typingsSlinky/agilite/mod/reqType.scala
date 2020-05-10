package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait reqType extends js.Object {
  var DELETE: String = js.native
  var GET: String = js.native
  var POST: String = js.native
  var PUT: String = js.native
}

object reqType {
  @scala.inline
  def apply(DELETE: String, GET: String, POST: String, PUT: String): reqType = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqType]
  }
  @scala.inline
  implicit class reqTypeOps[Self <: reqType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGET(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPUT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PUT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

