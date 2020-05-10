package typingsSlinky.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeroMultiKillBest extends Hero {
  var multikill_best: String = js.native
}

object HeroMultiKillBest {
  @scala.inline
  def apply(hero: String, img: String, multikill_best: String): HeroMultiKillBest = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroMultiKillBest]
  }
  @scala.inline
  implicit class HeroMultiKillBestOps[Self <: HeroMultiKillBest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultikill_best(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multikill_best")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

