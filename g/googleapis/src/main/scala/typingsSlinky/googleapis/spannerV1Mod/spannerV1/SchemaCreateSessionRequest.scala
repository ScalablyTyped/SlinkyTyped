package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateSession.
  */
@js.native
trait SchemaCreateSessionRequest extends js.Object {
  /**
    * The session to create.
    */
  var session: js.UndefOr[SchemaSession] = js.native
}

object SchemaCreateSessionRequest {
  @scala.inline
  def apply(): SchemaCreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSessionRequest]
  }
  @scala.inline
  implicit class SchemaCreateSessionRequestOps[Self <: SchemaCreateSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: SchemaSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

