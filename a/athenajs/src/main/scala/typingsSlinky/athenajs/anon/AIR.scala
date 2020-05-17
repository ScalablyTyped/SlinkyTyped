package typingsSlinky.athenajs.anon

import typingsSlinky.athenajs.athenajsNumbers.`1`
import typingsSlinky.athenajs.athenajsNumbers.`2`
import typingsSlinky.athenajs.athenajsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AIR extends js.Object {
  var AIR: `1` = js.native
  var LADDER: `3` = js.native
  var WALL: `2` = js.native
}

object AIR {
  @scala.inline
  def apply(AIR: `1`, LADDER: `3`, WALL: `2`): AIR = {
    val __obj = js.Dynamic.literal(AIR = AIR.asInstanceOf[js.Any], LADDER = LADDER.asInstanceOf[js.Any], WALL = WALL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AIR]
  }
  @scala.inline
  implicit class AIROps[Self <: AIR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAIR(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AIR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLADDER(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LADDER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWALL(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WALL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

