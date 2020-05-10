package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign JWT request.
  */
@js.native
trait SchemaSignJwtRequest extends js.Object {
  /**
    * The JWT payload to sign, a JSON JWT Claim set.
    */
  var payload: js.UndefOr[String] = js.native
}

object SchemaSignJwtRequest {
  @scala.inline
  def apply(): SchemaSignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtRequest]
  }
  @scala.inline
  implicit class SchemaSignJwtRequestOps[Self <: SchemaSignJwtRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

