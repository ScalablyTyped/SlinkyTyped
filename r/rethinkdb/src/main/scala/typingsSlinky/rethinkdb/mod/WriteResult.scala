package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResult extends js.Object {
  var deleted: Double = js.native
  var errors: Double = js.native
  var first_error: js.Error = js.native
  var generated_keys: js.Array[String] = js.native
  var inserted: Double = js.native
  var replaced: Double = js.native
  var skipped: Double = js.native
  var unchanged: Double = js.native
}

object WriteResult {
  @scala.inline
  def apply(
    deleted: Double,
    errors: Double,
    first_error: js.Error,
    generated_keys: js.Array[String],
    inserted: Double,
    replaced: Double,
    skipped: Double,
    unchanged: Double
  ): WriteResult = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], first_error = first_error.asInstanceOf[js.Any], generated_keys = generated_keys.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  @scala.inline
  implicit class WriteResultOps[Self <: WriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_error(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerated_keys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInserted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inserted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaced(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnchanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

