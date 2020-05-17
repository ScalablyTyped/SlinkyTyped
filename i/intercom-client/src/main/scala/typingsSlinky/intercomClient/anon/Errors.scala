package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.errorDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: js.Array[Code] = js.native
  var request_id: String = js.native
  var `type`: errorDotlist = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Code], request_id: String, `type`: errorDotlist): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[Code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: errorDotlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

