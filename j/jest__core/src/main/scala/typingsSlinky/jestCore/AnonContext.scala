package typingsSlinky.jestCore

import typingsSlinky.jestCore.searchSourceMod.default
import typingsSlinky.jestRuntime.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: Context = js.native
  var searchSource: default = js.native
}

object AnonContext {
  @scala.inline
  def apply(context: Context, searchSource: default): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], searchSource = searchSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
  @scala.inline
  implicit class AnonContextOps[Self <: AnonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchSource(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

