package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index[T /* <: js.Object */] extends js.Object {
  var code: Double = js.native
  var deduplicate: Boolean = js.native
  var expireAfter: js.UndefOr[Double] = js.native
  var fields: js.Array[/* keyof T */ String] = js.native
  var id: String = js.native
  var isNewlyCreated: Boolean = js.native
  var name: String = js.native
  var selectivityEstimate: Double = js.native
  var sparse: Boolean = js.native
  var `type`: IndexType = js.native
  var unique: Boolean = js.native
}

object Index {
  @scala.inline
  def apply[T](
    code: Double,
    deduplicate: Boolean,
    fields: js.Array[/* keyof T */ String],
    id: String,
    isNewlyCreated: Boolean,
    name: String,
    selectivityEstimate: Double,
    sparse: Boolean,
    `type`: IndexType,
    unique: Boolean
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deduplicate = deduplicate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNewlyCreated = isNewlyCreated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectivityEstimate = selectivityEstimate.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  @scala.inline
  implicit class IndexOps[Self[t] <: Index[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCode(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeduplicate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNewlyCreated(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewlyCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectivityEstimate(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectivityEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSparse(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IndexType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
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
  }
  
}

