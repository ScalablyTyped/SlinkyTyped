package typingsSlinky.parse.mod._Global_.Parse.Cloud

import typingsSlinky.parse.mod._Global_.Parse.Attributes
import typingsSlinky.parse.mod._Global_.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionRequest[T /* <: Params */] extends js.Object {
  var installationId: js.UndefOr[String] = js.native
  var master: js.UndefOr[Boolean] = js.native
  var params: T = js.native
  var user: js.UndefOr[User[Attributes]] = js.native
}

object FunctionRequest {
  @scala.inline
  def apply[T](params: T): FunctionRequest[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRequest[T]]
  }
  @scala.inline
  implicit class FunctionRequestOps[Self[t] <: FunctionRequest[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withParams(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: User[Attributes]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

