package typingsSlinky.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithModifiers[T] extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$explain")
  var $explain: js.UndefOr[js.Any] = js.native
  @JSName("$hint")
  var $hint: js.UndefOr[js.Any] = js.native
  @JSName("$max")
  var $max: js.UndefOr[js.Any] = js.native
  @JSName("$maxScan")
  var $maxScan: js.UndefOr[js.Any] = js.native
  @JSName("$maxTimeMS")
  var $maxTimeMS: js.UndefOr[js.Any] = js.native
  @JSName("$min")
  var $min: js.UndefOr[js.Any] = js.native
  @JSName("$natural")
  var $natural: js.UndefOr[js.Any] = js.native
  @JSName("$orderby")
  var $orderby: js.UndefOr[js.Any] = js.native
  @JSName("$query")
  var $query: Query[T] = js.native
  @JSName("$returnKey")
  var $returnKey: js.UndefOr[js.Any] = js.native
  @JSName("$showDiskLoc")
  var $showDiskLoc: js.UndefOr[js.Any] = js.native
}

object QueryWithModifiers {
  @scala.inline
  def apply[T]($query: Query[T]): QueryWithModifiers[T] = {
    val __obj = js.Dynamic.literal($query = $query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryWithModifiers[T]]
  }
  @scala.inline
  implicit class QueryWithModifiersOps[Self[t] <: QueryWithModifiers[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$query(value: Query[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$query")(value.asInstanceOf[js.Any])
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
    def with$explain(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$explain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$explain: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$explain")(js.undefined)
        ret
    }
    @scala.inline
    def with$hint(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$hint: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hint")(js.undefined)
        ret
    }
    @scala.inline
    def with$max(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$max: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxScan(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxScan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxScan: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxScan")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxTimeMS(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxTimeMS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxTimeMS")(js.undefined)
        ret
    }
    @scala.inline
    def with$min(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$min: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(js.undefined)
        ret
    }
    @scala.inline
    def with$natural(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$natural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$natural: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$natural")(js.undefined)
        ret
    }
    @scala.inline
    def with$orderby(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orderby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$orderby: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orderby")(js.undefined)
        ret
    }
    @scala.inline
    def with$returnKey(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$returnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$returnKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$returnKey")(js.undefined)
        ret
    }
    @scala.inline
    def with$showDiskLoc(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$showDiskLoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$showDiskLoc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$showDiskLoc")(js.undefined)
        ret
    }
  }
  
}

