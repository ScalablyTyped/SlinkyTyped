package typingsSlinky.athenajs.anon

import typingsSlinky.athenajs.athenajsNumbers.`13`
import typingsSlinky.athenajs.athenajsNumbers.`17`
import typingsSlinky.athenajs.athenajsNumbers.`27`
import typingsSlinky.athenajs.athenajsNumbers.`37`
import typingsSlinky.athenajs.athenajsNumbers.`38`
import typingsSlinky.athenajs.athenajsNumbers.`39`
import typingsSlinky.athenajs.athenajsNumbers.`40`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CTRL extends js.Object {
  var CTRL: `17` = js.native
  var DOWN: `40` = js.native
  var ENTER: `13` = js.native
  var ESCAPE: `27` = js.native
  var LEFT: `37` = js.native
  var RIGHT: `39` = js.native
  var SPACE: typingsSlinky.athenajs.athenajsNumbers.`32` = js.native
  var UP: `38` = js.native
}

object CTRL {
  @scala.inline
  def apply(
    CTRL: `17`,
    DOWN: `40`,
    ENTER: `13`,
    ESCAPE: `27`,
    LEFT: `37`,
    RIGHT: `39`,
    SPACE: typingsSlinky.athenajs.athenajsNumbers.`32`,
    UP: `38`
  ): CTRL = {
    val __obj = js.Dynamic.literal(CTRL = CTRL.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTRL]
  }
  @scala.inline
  implicit class CTRLOps[Self <: CTRL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCTRL(value: `17`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOWN(value: `40`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTER(value: `13`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withESCAPE(value: `27`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEFT(value: `37`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: `39`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPACE(value: typingsSlinky.athenajs.athenajsNumbers.`32`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUP(value: `38`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

