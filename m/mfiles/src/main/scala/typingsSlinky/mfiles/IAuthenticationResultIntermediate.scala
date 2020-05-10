package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthenticationResultIntermediate extends js.Object {
  val AttemptIdentifier: String = js.native
  val AuthenticationData: INamedValues = js.native
}

object IAuthenticationResultIntermediate {
  @scala.inline
  def apply(AttemptIdentifier: String, AuthenticationData: INamedValues): IAuthenticationResultIntermediate = {
    val __obj = js.Dynamic.literal(AttemptIdentifier = AttemptIdentifier.asInstanceOf[js.Any], AuthenticationData = AuthenticationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultIntermediate]
  }
  @scala.inline
  implicit class IAuthenticationResultIntermediateOps[Self <: IAuthenticationResultIntermediate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttemptIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationData(value: INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

