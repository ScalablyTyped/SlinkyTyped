package typingsSlinky.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin] = js.native
  def deleteOne(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[OnfleetAdmin]] = js.native
  def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin] = js.native
}

object Admin {
  @scala.inline
  def apply(
    create: CreateAdminProps => js.Promise[OnfleetAdmin],
    deleteOne: String => js.Promise[Unit],
    get: () => js.Promise[js.Array[OnfleetAdmin]],
    update: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]
  ): Admin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Admin]
  }
  @scala.inline
  implicit class AdminOps[Self <: Admin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreateAdminProps => js.Promise[OnfleetAdmin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteOne(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Promise[js.Array[OnfleetAdmin]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

