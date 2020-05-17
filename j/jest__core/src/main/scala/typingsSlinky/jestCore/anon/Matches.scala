package typingsSlinky.jestCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matches extends js.Object {
  var context: typingsSlinky.jestRuntime.mod.Context = js.native
  var matches: Stats = js.native
}

object Matches {
  @scala.inline
  def apply(context: typingsSlinky.jestRuntime.mod.Context, matches: Stats): Matches = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  @scala.inline
  implicit class MatchesOps[Self <: Matches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: typingsSlinky.jestRuntime.mod.Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

