package typingsSlinky.parse.mod._Global_.Parse.Op

import typingsSlinky.parse.mod._Global_.Parse.Attributes
import typingsSlinky.parse.mod._Global_.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relation extends js.Object {
  var removed: js.Array[Object[Attributes]] = js.native
  def added(): js.Array[Object[Attributes]] = js.native
  def toJSON(): js.Any = js.native
}

object Relation {
  @scala.inline
  def apply(
    added: () => js.Array[Object[Attributes]],
    removed: js.Array[Object[Attributes]],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Relation]
  }
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: () => js.Array[Object[Attributes]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[Object[Attributes]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

