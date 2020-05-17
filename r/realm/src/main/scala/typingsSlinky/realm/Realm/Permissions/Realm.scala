package typingsSlinky.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Realm extends js.Object {
  var id: Double = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

object Realm {
  @scala.inline
  def apply(findOrCreate: String => Permission, id: Double, permissions: js.Array[Permission]): Realm = {
    val __obj = js.Dynamic.literal(findOrCreate = js.Any.fromFunction1(findOrCreate), id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Realm]
  }
  @scala.inline
  implicit class RealmOps[Self <: Realm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindOrCreate(value: String => Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOrCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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

