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
@js.native
trait LQuery[T] extends js.Object {
  /**
    * Materialized query matches for a given view only (!). Results are initialized lazily so the
    * array of matches is set to `null` initially.
    */
  var matches: (js.Array[T | Null]) | Null = js.native
  /**
    * A QueryList where materialized query results should be reported.
    */
  var queryList: QueryList[T] = js.native
  /**
    * Called when an embedded view, impacting results of this query, is inserted or removed.
    */
  def setDirty(): Unit = js.native
}

object LQuery {
  @scala.inline
  def apply[T](queryList: QueryList[T], setDirty: () => Unit): LQuery[T] = {
    val __obj = js.Dynamic.literal(queryList = queryList.asInstanceOf[js.Any], setDirty = js.Any.fromFunction0(setDirty))
    __obj.asInstanceOf[LQuery[T]]
  }
  @scala.inline
  implicit class LQueryOps[Self[t] <: LQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withQueryList(value: QueryList[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDirty(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[T | Null]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchesNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(null)
        ret
    }
  }
  
}

