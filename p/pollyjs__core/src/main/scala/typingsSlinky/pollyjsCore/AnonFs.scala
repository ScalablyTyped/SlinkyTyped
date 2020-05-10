package typingsSlinky.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFs
  extends /* key */ StringDictionary[js.Any] {
  var fs: js.UndefOr[AnonRecordingsDir] = js.native
  var keepUnusedRequests: js.UndefOr[Boolean] = js.native
  var `local-storage`: js.UndefOr[AnonKey] = js.native
  var rest: js.UndefOr[AnonApiNamespace] = js.native
}

object AnonFs {
  @scala.inline
  def apply(): AnonFs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFs]
  }
  @scala.inline
  implicit class AnonFsOps[Self <: AnonFs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFs(value: AnonRecordingsDir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepUnusedRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepUnusedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepUnusedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepUnusedRequests")(js.undefined)
        ret
    }
    @scala.inline
    def `withLocal-storage`(value: AnonKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local-storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLocal-storage`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local-storage")(js.undefined)
        ret
    }
    @scala.inline
    def withRest(value: AnonApiNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(js.undefined)
        ret
    }
  }
  
}

