package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonALIVE extends js.Object {
  var ALIVE: String = js.native
  var DEAD: String = js.native
}

object AnonALIVE {
  @scala.inline
  def apply(ALIVE: String, DEAD: String): AnonALIVE = {
    val __obj = js.Dynamic.literal(ALIVE = ALIVE.asInstanceOf[js.Any], DEAD = DEAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonALIVE]
  }
  @scala.inline
  implicit class AnonALIVEOps[Self <: AnonALIVE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALIVE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEAD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEAD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

