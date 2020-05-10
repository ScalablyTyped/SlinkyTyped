package typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HttpsCallableResult wraps a single result from a function call.
  */
@js.native
trait HttpsCallableResult[R] extends js.Object {
  val data: R = js.native
}

object HttpsCallableResult {
  @scala.inline
  def apply[R](data: R): HttpsCallableResult[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsCallableResult[R]]
  }
  @scala.inline
  implicit class HttpsCallableResultOps[Self[r] <: HttpsCallableResult[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withData(value: R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

