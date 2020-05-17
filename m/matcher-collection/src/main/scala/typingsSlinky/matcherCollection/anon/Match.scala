package typingsSlinky.matcherCollection.anon

import typingsSlinky.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  var matchers: js.Array[IMinimatch] = js.native
  def `match`(value: String): Boolean = js.native
  def mayContain(value: String): Boolean = js.native
}

object Match {
  @scala.inline
  def apply(`match`: String => Boolean, matchers: js.Array[IMinimatch], mayContain: String => Boolean): Match = {
    val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Match]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchers(value: js.Array[IMinimatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMayContain(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayContain")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

