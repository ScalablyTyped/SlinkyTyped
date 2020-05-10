package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnd extends js.Object {
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
    ]
  ] = js.native
}

object AnonAnd {
  @scala.inline
  def apply(): AnonAnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnd]
  }
  @scala.inline
  implicit class AnonAndOps[Self <: AnonAnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$and(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$and: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.undefined)
        ret
    }
    @scala.inline
    def with$nor(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(js.undefined)
        ret
    }
    @scala.inline
    def with$or(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.Query<T> */ js.Object
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$or: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.undefined)
        ret
    }
  }
  
}

