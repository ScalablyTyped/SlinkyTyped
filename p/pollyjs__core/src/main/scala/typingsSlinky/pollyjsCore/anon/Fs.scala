package typingsSlinky.pollyjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fs
  extends /* key */ StringDictionary[js.Any] {
  var fs: js.UndefOr[RecordingsDir] = js.native
  var keepUnusedRequests: js.UndefOr[Boolean] = js.native
  var `local-storage`: js.UndefOr[Key] = js.native
  var rest: js.UndefOr[ApiNamespace] = js.native
}

object Fs {
  @scala.inline
  def apply(): Fs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fs]
  }
  @scala.inline
  implicit class FsOps[Self <: Fs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFs(value: RecordingsDir): Self = {
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
    def `withLocal-storage`(value: Key): Self = {
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
    def withRest(value: ApiNamespace): Self = {
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

