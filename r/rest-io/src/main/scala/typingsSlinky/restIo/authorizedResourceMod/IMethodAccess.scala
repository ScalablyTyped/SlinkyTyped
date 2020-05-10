package typingsSlinky.restIo.authorizedResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMethodAccess extends js.Object {
  var create: js.Array[String] = js.native
  var del: js.Array[String] = js.native
  var getAll: js.Array[String] = js.native
  var getById: js.Array[String] = js.native
  var update: js.Array[String] = js.native
}

object IMethodAccess {
  @scala.inline
  def apply(
    create: js.Array[String],
    del: js.Array[String],
    getAll: js.Array[String],
    getById: js.Array[String],
    update: js.Array[String]
  ): IMethodAccess = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], getAll = getAll.asInstanceOf[js.Any], getById = getById.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodAccess]
  }
  @scala.inline
  implicit class IMethodAccessOps[Self <: IMethodAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAll(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetById(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

