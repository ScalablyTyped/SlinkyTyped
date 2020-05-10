package typingsSlinky.dkimSigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFieldNames extends js.Object {
  var fieldNames: String = js.native
  var headers: String = js.native
}

object AnonFieldNames {
  @scala.inline
  def apply(fieldNames: String, headers: String): AnonFieldNames = {
    val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldNames]
  }
  @scala.inline
  implicit class AnonFieldNamesOps[Self <: AnonFieldNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

