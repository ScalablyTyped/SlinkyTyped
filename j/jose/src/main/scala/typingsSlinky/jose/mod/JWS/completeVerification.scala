package typingsSlinky.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait completeVerification[T, T2] extends js.Object {
  var header: js.UndefOr[js.Object] = js.native
  var key: T2 = js.native
  var payload: T = js.native
  var `protected`: js.UndefOr[js.Object] = js.native
}

object completeVerification {
  @scala.inline
  def apply[T, T2](key: T2, payload: T): completeVerification[T, T2] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeVerification[T, T2]]
  }
  @scala.inline
  implicit class completeVerificationOps[Self[t, t2] <: completeVerification[t, t2], T, T2] (val x: Self[T, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, T2]) with Other]
    @scala.inline
    def withKey(value: T2): Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: T): Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: js.Object): Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withProtected(value: js.Object): Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtected: Self[T, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(js.undefined)
        ret
    }
  }
  
}

