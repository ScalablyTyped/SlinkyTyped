package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotTimings extends js.Object {
  var connect: Double = js.native
  var end: Double = js.native
  var error: Double = js.native
  var lookup: Double = js.native
  var phases: GotTimingsPhases = js.native
  var response: Double = js.native
  var socket: Double = js.native
  var start: Double = js.native
  var upload: Double = js.native
}

object GotTimings {
  @scala.inline
  def apply(
    connect: Double,
    end: Double,
    error: Double,
    lookup: Double,
    phases: GotTimingsPhases,
    response: Double,
    socket: Double,
    start: Double,
    upload: Double
  ): GotTimings = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotTimings]
  }
  @scala.inline
  implicit class GotTimingsOps[Self <: GotTimings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhases(value: GotTimingsPhases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

