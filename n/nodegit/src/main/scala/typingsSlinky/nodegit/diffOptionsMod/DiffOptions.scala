package typingsSlinky.nodegit.diffOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffOptions
  extends /* key */ StringDictionary[js.Any] {
  var contextLines: js.UndefOr[Double] = js.native
  var flags: js.UndefOr[Double] = js.native
  var idAbbrev: js.UndefOr[Double] = js.native
  var ignoreSubmodules: js.UndefOr[Double] = js.native
  var interhunkLines: js.UndefOr[Double] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var newPrefix: js.UndefOr[String] = js.native
  var notifyCb: js.UndefOr[js.Function] = js.native
  var oldPrefix: js.UndefOr[String] = js.native
  var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  var payload: js.UndefOr[js.Any] = js.native
  var progressCb: js.UndefOr[js.Any] = js.native
  var version: js.UndefOr[Double] = js.native
}

object DiffOptions {
  @scala.inline
  def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  @scala.inline
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withIdAbbrev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAbbrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAbbrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAbbrev")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSubmodules(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSubmodules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSubmodules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSubmodules")(js.undefined)
        ret
    }
    @scala.inline
    def withInterhunkLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interhunkLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterhunkLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interhunkLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyCb(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyCb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyCb")(js.undefined)
        ret
    }
    @scala.inline
    def withOldPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPathspec(value: Strarray | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathspec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathspec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathspec")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

