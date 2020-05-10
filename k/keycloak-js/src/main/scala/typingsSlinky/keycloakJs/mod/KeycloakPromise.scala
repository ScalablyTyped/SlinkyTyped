package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakPromise[TSuccess, TError] extends js.Object {
  /**
  		 * Function to call if the promised action throws an error.
  		 */
  def error(callback: KeycloakPromiseCallback[TError]): KeycloakPromise[TSuccess, TError] = js.native
  /**
  		 * Function to call if the promised action succeeds.
  		 */
  def success(callback: KeycloakPromiseCallback[TSuccess]): KeycloakPromise[TSuccess, TError] = js.native
}

object KeycloakPromise {
  @scala.inline
  def apply[TSuccess, TError](
    error: KeycloakPromiseCallback[TError] => KeycloakPromise[TSuccess, TError],
    success: KeycloakPromiseCallback[TSuccess] => KeycloakPromise[TSuccess, TError]
  ): KeycloakPromise[TSuccess, TError] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[KeycloakPromise[TSuccess, TError]]
  }
  @scala.inline
  implicit class KeycloakPromiseOps[Self[tsuccess, terror] <: KeycloakPromise[tsuccess, terror], TSuccess, TError] (val x: Self[TSuccess, TError]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuccess, TError] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuccess, TError]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSuccess, TError]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSuccess, TError]) with Other]
    @scala.inline
    def withError(value: KeycloakPromiseCallback[TError] => KeycloakPromise[TSuccess, TError]): Self[TSuccess, TError] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: KeycloakPromiseCallback[TSuccess] => KeycloakPromise[TSuccess, TError]): Self[TSuccess, TError] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

