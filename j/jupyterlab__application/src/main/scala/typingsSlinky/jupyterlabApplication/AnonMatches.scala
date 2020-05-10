package typingsSlinky.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatches extends js.Object {
  var matches: js.Array[String] = js.native
  var patterns: js.Array[String] = js.native
}

object AnonMatches {
  @scala.inline
  def apply(matches: js.Array[String], patterns: js.Array[String]): AnonMatches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatches]
  }
  @scala.inline
  implicit class AnonMatchesOps[Self <: AnonMatches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

