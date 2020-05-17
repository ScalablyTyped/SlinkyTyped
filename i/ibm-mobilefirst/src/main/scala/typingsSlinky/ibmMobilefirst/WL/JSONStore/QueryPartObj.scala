package typingsSlinky.ibmMobilefirst.WL.JSONStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryPartObj extends js.Object {
  /**
    * Add a between clause to a query for advanced find.
    */
  def between(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add an equal to clause to a query for advanced find.
    */
  def equal(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a greater or equal thanclause to a query for advanced find.
    */
  def greaterOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a greater than clause to a query for advanced find.
    */
  def greaterThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add an in clause to a query for advanced find.
    */
  def inside(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a left clause to a query for advanced find.
    */
  def leftLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a less or equal than clause to a query for advanced find.
    */
  def lessOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a less than clause to a query for advanced find.
    */
  def lessThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a like clause to a query for advanced find.
    */
  def like(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not between clause to a query for advanced find.
    */
  def notBetween(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not equal to clause to a query for advanced find.
    */
  def notEqual(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not in clause to a query for advanced find.
    */
  def notInside(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not left clause to a query for advanced find.
    */
  def notLeftLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not like clause to a query for advanced find.
    */
  def notLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a not right clause to a query for advanced find.
    */
  def notRightLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  /**
    * Add a right clause to a query for advanced find.
    */
  def rightLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
}

object QueryPartObj {
  @scala.inline
  def apply(
    between: (js.Any, js.Any) => js.Array[_],
    equal: (js.Any, js.Any) => js.Array[_],
    greaterOrEqualThan: (js.Any, js.Any) => js.Array[_],
    greaterThan: (js.Any, js.Any) => js.Array[_],
    inside: (js.Any, js.Any) => js.Array[_],
    leftLike: (js.Any, js.Any) => js.Array[_],
    lessOrEqualThan: (js.Any, js.Any) => js.Array[_],
    lessThan: (js.Any, js.Any) => js.Array[_],
    like: (js.Any, js.Any) => js.Array[_],
    notBetween: (js.Any, js.Any) => js.Array[_],
    notEqual: (js.Any, js.Any) => js.Array[_],
    notInside: (js.Any, js.Any) => js.Array[_],
    notLeftLike: (js.Any, js.Any) => js.Array[_],
    notLike: (js.Any, js.Any) => js.Array[_],
    notRightLike: (js.Any, js.Any) => js.Array[_],
    rightLike: (js.Any, js.Any) => js.Array[_]
  ): QueryPartObj = {
    val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greaterOrEqualThan = js.Any.fromFunction2(greaterOrEqualThan), greaterThan = js.Any.fromFunction2(greaterThan), inside = js.Any.fromFunction2(inside), leftLike = js.Any.fromFunction2(leftLike), lessOrEqualThan = js.Any.fromFunction2(lessOrEqualThan), lessThan = js.Any.fromFunction2(lessThan), like = js.Any.fromFunction2(like), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual), notInside = js.Any.fromFunction2(notInside), notLeftLike = js.Any.fromFunction2(notLeftLike), notLike = js.Any.fromFunction2(notLike), notRightLike = js.Any.fromFunction2(notRightLike), rightLike = js.Any.fromFunction2(rightLike))
    __obj.asInstanceOf[QueryPartObj]
  }
  @scala.inline
  implicit class QueryPartObjOps[Self <: QueryPartObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetween(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEqual(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGreaterOrEqualThan(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterOrEqualThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGreaterThan(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInside(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLeftLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLike")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessOrEqualThan(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessOrEqualThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessThan(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotBetween(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBetween")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotEqual(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotInside(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInside")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotLeftLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notLeftLike")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notLike")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotRightLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRightLike")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRightLike(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLike")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

