package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChangeSet extends js.Object {
  var deletions: js.Array[Double] = js.native
  var insertions: js.Array[Double] = js.native
  var modifications: js.Array[Double] = js.native
  var newModifications: js.Array[Double] = js.native
  var oldModifications: js.Array[Double] = js.native
}

object CollectionChangeSet {
  @scala.inline
  def apply(
    deletions: js.Array[Double],
    insertions: js.Array[Double],
    modifications: js.Array[Double],
    newModifications: js.Array[Double],
    oldModifications: js.Array[Double]
  ): CollectionChangeSet = {
    val __obj = js.Dynamic.literal(deletions = deletions.asInstanceOf[js.Any], insertions = insertions.asInstanceOf[js.Any], modifications = modifications.asInstanceOf[js.Any], newModifications = newModifications.asInstanceOf[js.Any], oldModifications = oldModifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChangeSet]
  }
  @scala.inline
  implicit class CollectionChangeSetOps[Self <: CollectionChangeSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifications(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewModifications(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldModifications(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldModifications")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

