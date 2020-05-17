package typingsSlinky.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pairs extends js.Object {
  var pairs: js.Array[typingsSlinky.p2.mod.Body] = js.native
  var `type`: String = js.native
}

object Pairs {
  @scala.inline
  def apply(pairs: js.Array[typingsSlinky.p2.mod.Body], `type`: String): Pairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pairs]
  }
  @scala.inline
  implicit class PairsOps[Self <: Pairs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPairs(value: js.Array[typingsSlinky.p2.mod.Body]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

