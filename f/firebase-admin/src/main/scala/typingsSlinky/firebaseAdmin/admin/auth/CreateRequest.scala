package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to set on a new user record to be
  * created.
  */
@js.native
trait CreateRequest extends UpdateRequest {
  /**
    * The user's multi-factor related properties.
    */
  @JSName("multiFactor")
  var multiFactor_CreateRequest: js.UndefOr[MultiFactorCreateSettings] = js.native
  /**
    * The user's `uid`.
    */
  var uid: js.UndefOr[String] = js.native
}

object CreateRequest {
  @scala.inline
  def apply(): CreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRequest]
  }
  @scala.inline
  implicit class CreateRequestOps[Self <: CreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiFactor(value: MultiFactorCreateSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

