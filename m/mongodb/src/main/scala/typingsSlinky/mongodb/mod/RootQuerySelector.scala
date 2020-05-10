package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.AnonCaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootQuerySelector[T]
  extends // we could not find a proper TypeScript generic to support nested queries e.g. 'user.friends.name'
// this will mark all unrecognized properties as any (including nested queries)
/* key */ StringDictionary[js.Any] {
  /** https://docs.mongodb.com/manual/reference/operator/query/and/#op._S_and */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/comment/#op._S_comment */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/nor/#op._S_nor */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/or/#op._S_or */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/text */
  @JSName("$text")
  var $text: js.UndefOr[AnonCaseSensitive] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/where/#op._S_where */
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.native
}

object RootQuerySelector {
  @scala.inline
  def apply[T](): RootQuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootQuerySelector[T]]
  }
  @scala.inline
  implicit class RootQuerySelectorOps[Self[t] <: RootQuerySelector[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$and(value: js.Array[FilterQuery[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$and: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.undefined)
        ret
    }
    @scala.inline
    def with$comment(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$comment: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$comment")(js.undefined)
        ret
    }
    @scala.inline
    def with$nor(value: js.Array[FilterQuery[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(js.undefined)
        ret
    }
    @scala.inline
    def with$or(value: js.Array[FilterQuery[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$or: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.undefined)
        ret
    }
    @scala.inline
    def with$text(value: AnonCaseSensitive): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$text: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text")(js.undefined)
        ret
    }
    @scala.inline
    def with$where(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$where: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(js.undefined)
        ret
    }
  }
  
}

