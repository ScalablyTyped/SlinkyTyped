package typingsSlinky.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePathSegment extends js.Object {
  var id: String = js.native
  var nextSegments: js.Array[CodePathSegment] = js.native
  var prevSegments: js.Array[CodePathSegment] = js.native
  var reachable: Boolean = js.native
}

object CodePathSegment {
  @scala.inline
  def apply(
    id: String,
    nextSegments: js.Array[CodePathSegment],
    prevSegments: js.Array[CodePathSegment],
    reachable: Boolean
  ): CodePathSegment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nextSegments = nextSegments.asInstanceOf[js.Any], prevSegments = prevSegments.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePathSegment]
  }
  @scala.inline
  implicit class CodePathSegmentOps[Self <: CodePathSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

