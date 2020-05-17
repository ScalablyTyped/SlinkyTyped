package typingsSlinky.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectID extends js.Object {
  /**
    * Unique identifier of the object to promote
    */
  var objectID: String = js.native
  /**
    *  Promoted rank for the object (zero-based)
    */
  var position: Double = js.native
}

object ObjectID {
  @scala.inline
  def apply(objectID: String, position: Double): ObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectID]
  }
  @scala.inline
  implicit class ObjectIDOps[Self <: ObjectID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

