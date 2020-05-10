package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.Realm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalRealm
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.LocalRealm.html }
  */
@js.native
trait LocalRealm extends js.Object {
  val path: String = js.native
  def realm(): Realm = js.native
}

object LocalRealm {
  @scala.inline
  def apply(path: String, realm: () => Realm): LocalRealm = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], realm = js.Any.fromFunction0(realm))
    __obj.asInstanceOf[LocalRealm]
  }
  @scala.inline
  implicit class LocalRealmOps[Self <: LocalRealm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: () => Realm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

