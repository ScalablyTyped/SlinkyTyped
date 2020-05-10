package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationProperty extends js.Object {
  var cols: js.Array[String] = js.native
  var modelClass: ModelClass[_] = js.native
  var props: js.Array[String] = js.native
  var size: Double = js.native
}

object RelationProperty {
  @scala.inline
  def apply(cols: js.Array[String], modelClass: ModelClass[_], props: js.Array[String], size: Double): RelationProperty = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], modelClass = modelClass.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationProperty]
  }
  @scala.inline
  implicit class RelationPropertyOps[Self <: RelationProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelClass(value: ModelClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

