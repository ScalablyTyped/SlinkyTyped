package typingsSlinky.epilogue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controllers extends js.Object {
  var base: BaseController = js.native
  var create: CreateController = js.native
  var delete: DeleteController = js.native
  var list: ListController = js.native
  var read: ReadController = js.native
  var update: UpdateController = js.native
}

object Controllers {
  @scala.inline
  def apply(
    base: BaseController,
    create: CreateController,
    delete: DeleteController,
    list: ListController,
    read: ReadController,
    update: UpdateController
  ): Controllers = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controllers]
  }
  @scala.inline
  implicit class ControllersOps[Self <: Controllers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: BaseController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: CreateController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: DeleteController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ListController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: ReadController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: UpdateController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

