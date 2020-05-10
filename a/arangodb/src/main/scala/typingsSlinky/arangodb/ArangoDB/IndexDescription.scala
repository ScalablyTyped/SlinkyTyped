package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDescription[T] extends js.Object {
  var deduplicate: js.UndefOr[Boolean] = js.native
  var expireAfter: js.UndefOr[Double] = js.native
  var fields: js.Array[/* keyof T */ String] = js.native
  var sparse: js.UndefOr[Boolean] = js.native
  var `type`: IndexType = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object IndexDescription {
  @scala.inline
  def apply[T](fields: js.Array[/* keyof T */ String], `type`: IndexType): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
  @scala.inline
  implicit class IndexDescriptionOps[Self[t] <: IndexDescription[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFields(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IndexType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeduplicate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeduplicate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplicate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireAfter(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireAfter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSparse(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

