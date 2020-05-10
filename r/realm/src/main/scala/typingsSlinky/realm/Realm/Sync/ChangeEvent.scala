package typingsSlinky.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.realm.Realm
import typingsSlinky.realm.Realm.CollectionChangeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChangeEvent
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.ChangeEvent.html }
  */
@js.native
trait ChangeEvent extends js.Object {
  val changes: StringDictionary[CollectionChangeSet] = js.native
  val oldRealm: Realm = js.native
  val path: String = js.native
  val realm: Realm = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(changes: StringDictionary[CollectionChangeSet], oldRealm: Realm, path: String, realm: Realm): ChangeEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], oldRealm = oldRealm.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: StringDictionary[CollectionChangeSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRealm(value: Realm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRealm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: Realm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

