package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToken extends js.Object {
  var _endTimeQuery: Nullable[WebGLQuery] = js.native
  var _startTimeQuery: Nullable[WebGLQuery] = js.native
  var _timeElapsedQuery: Nullable[WebGLQuery] = js.native
  var _timeElapsedQueryEnded: Boolean = js.native
}

object TimeToken {
  @scala.inline
  def apply(_timeElapsedQueryEnded: Boolean): TimeToken = {
    val __obj = js.Dynamic.literal(_timeElapsedQueryEnded = _timeElapsedQueryEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToken]
  }
  @scala.inline
  implicit class TimeTokenOps[Self <: TimeToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_timeElapsedQueryEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeElapsedQueryEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_endTimeQuery(value: Nullable[WebGLQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_endTimeQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_endTimeQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_endTimeQuery")(null)
        ret
    }
    @scala.inline
    def with_startTimeQuery(value: Nullable[WebGLQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startTimeQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_startTimeQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startTimeQuery")(null)
        ret
    }
    @scala.inline
    def with_timeElapsedQuery(value: Nullable[WebGLQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeElapsedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_timeElapsedQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeElapsedQuery")(null)
        ret
    }
  }
  
}

