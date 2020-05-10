package typingsSlinky.jestChangedFiles.typesMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var changedSince: js.UndefOr[String] = js.native
  var includePaths: js.UndefOr[js.Array[Path]] = js.native
  var lastCommit: js.UndefOr[Boolean] = js.native
  var withAncestor: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePaths(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withLastCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withWithAncestor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAncestor")(js.undefined)
        ret
    }
  }
  
}

