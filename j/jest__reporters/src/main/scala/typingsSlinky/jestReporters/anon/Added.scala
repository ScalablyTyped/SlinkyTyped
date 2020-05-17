package typingsSlinky.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Added extends js.Object {
  var added: Double = js.native
  var fileDeleted: Boolean = js.native
  var matched: Double = js.native
  var unchecked: Double = js.native
  var uncheckedKeys: js.Array[String] = js.native
  var unmatched: Double = js.native
  var updated: Double = js.native
}

object Added {
  @scala.inline
  def apply(
    added: Double,
    fileDeleted: Boolean,
    matched: Double,
    unchecked: Double,
    uncheckedKeys: js.Array[String],
    unmatched: Double,
    updated: Double
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], fileDeleted = fileDeleted.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeys = uncheckedKeys.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnchecked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncheckedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

