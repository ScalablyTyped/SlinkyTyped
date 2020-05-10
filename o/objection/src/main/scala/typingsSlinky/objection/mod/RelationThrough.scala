package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationThrough extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[Unit] | Unit]
  ] = js.native
  var extra: js.UndefOr[js.Array[String] | js.Object] = js.native
  var from: String | Reference | (js.Array[String | Reference]) = js.native
  var modelClass: js.UndefOr[ModelClass[_] | String] = js.native
  var to: String | Reference | (js.Array[String | Reference]) = js.native
}

object RelationThrough {
  @scala.inline
  def apply(
    from: String | Reference | (js.Array[String | Reference]),
    to: String | Reference | (js.Array[String | Reference])
  ): RelationThrough = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationThrough]
  }
  @scala.inline
  implicit class RelationThroughOps[Self <: RelationThrough] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String | Reference | (js.Array[String | Reference])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String | Reference | (js.Array[String | Reference])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeInsert(value: (/* model */ Model, /* context */ QueryContext) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: js.Array[String] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withModelClass(value: ModelClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(js.undefined)
        ret
    }
  }
  
}

