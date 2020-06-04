package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that represents query-related information specific to a view instance. Most notably
  * it contains:
  * - materialized query matches;
  * - a pointer to a QueryList where materialized query results should be reported.
  */
trait LQuery[T] extends js.Object {
  /**
    * Materialized query matches for a given view only (!). Results are initialized lazily so the
    * array of matches is set to `null` initially.
    */
  var matches: (js.Array[T | Null]) | Null
  /**
    * A QueryList where materialized query results should be reported.
    */
  var queryList: QueryList[T]
  /**
    * Called when an embedded view, impacting results of this query, is inserted or removed.
    */
  def setDirty(): Unit
}

object LQuery {
  @scala.inline
  def apply[T](queryList: QueryList[T], setDirty: () => Unit): LQuery[T] = {
    val __obj = js.Dynamic.literal(queryList = queryList.asInstanceOf[js.Any], setDirty = js.Any.fromFunction0(setDirty))
    __obj.asInstanceOf[LQuery[T]]
  }
  @scala.inline
  implicit class LQueryOps[Self <: LQuery[_], T] (val x: Self with LQuery[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryList(value: QueryList[T]): Self = this.set("queryList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDirty(value: () => Unit): Self = this.set("setDirty", js.Any.fromFunction0(value))
    @scala.inline
    def setMatches(value: js.Array[T | Null]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchesNull: Self = this.set("matches", null)
  }
  
}

