package typingsSlinky.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var class_name: String = js.native
  var name: String = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

object Class {
  @scala.inline
  def apply(
    class_name: String,
    findOrCreate: String => Permission,
    name: String,
    permissions: js.Array[Permission]
  ): Class = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], findOrCreate = js.Any.fromFunction1(findOrCreate), name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindOrCreate(value: String => Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOrCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

