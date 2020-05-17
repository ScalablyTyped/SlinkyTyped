package typingsSlinky.onfleetNodeOnfleet.tasksMod

import typingsSlinky.onfleetNodeOnfleet.anon.CompleteAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneTaskOptions extends js.Object {
  var includeBarCodes: Boolean = js.native
  var includeDependencies: Boolean = js.native
  var includeMetadata: Boolean = js.native
  var overrides: js.UndefOr[CompleteAfter] = js.native
}

object CloneTaskOptions {
  @scala.inline
  def apply(includeBarCodes: Boolean, includeDependencies: Boolean, includeMetadata: Boolean): CloneTaskOptions = {
    val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneTaskOptions]
  }
  @scala.inline
  implicit class CloneTaskOptionsOps[Self <: CloneTaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeBarCodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBarCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: CompleteAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

