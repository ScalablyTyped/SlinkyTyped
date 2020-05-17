package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.FilterQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collation[T] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.native
  var filter: FilterQuery[T] = js.native
  var hint: js.UndefOr[String | js.Object] = js.native
  var replacement: T = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object Collation {
  @scala.inline
  def apply[T](filter: FilterQuery[T], replacement: T): Collation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collation[T]]
  }
  @scala.inline
  implicit class CollationOps[Self[t] <: Collation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(value: FilterQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollation(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: String | js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

