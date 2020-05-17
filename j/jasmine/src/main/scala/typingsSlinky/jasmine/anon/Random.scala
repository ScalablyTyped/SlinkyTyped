package typingsSlinky.jasmine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  var random: Boolean = js.native
  var seed: String = js.native
}

object Random {
  @scala.inline
  def apply(random: Boolean, seed: String): Random = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Random]
  }
  @scala.inline
  implicit class RandomOps[Self <: Random] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

