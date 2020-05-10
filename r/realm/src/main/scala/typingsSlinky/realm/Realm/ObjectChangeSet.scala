package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectChangeSet extends js.Object {
  var changedProperties: js.Array[String] = js.native
  var deleted: Boolean = js.native
}

object ObjectChangeSet {
  @scala.inline
  def apply(changedProperties: js.Array[String], deleted: Boolean): ObjectChangeSet = {
    val __obj = js.Dynamic.literal(changedProperties = changedProperties.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectChangeSet]
  }
  @scala.inline
  implicit class ObjectChangeSetOps[Self <: ObjectChangeSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

