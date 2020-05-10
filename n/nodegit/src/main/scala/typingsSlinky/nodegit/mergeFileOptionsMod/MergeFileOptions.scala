package typingsSlinky.nodegit.mergeFileOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeFileOptions
  extends /* key */ StringDictionary[js.Any] {
  var ancestorLabel: js.UndefOr[String] = js.native
  var favor: js.UndefOr[Double] = js.native
  var flags: js.UndefOr[Double] = js.native
  var ourLabel: js.UndefOr[String] = js.native
  var theirLabel: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object MergeFileOptions {
  @scala.inline
  def apply(): MergeFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeFileOptions]
  }
  @scala.inline
  implicit class MergeFileOptionsOps[Self <: MergeFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestorLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestorLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFavor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favor")(js.undefined)
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
    def withOurLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ourLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOurLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ourLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTheirLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theirLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheirLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theirLabel")(js.undefined)
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

