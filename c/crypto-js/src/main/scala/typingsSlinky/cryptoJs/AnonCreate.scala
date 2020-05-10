package typingsSlinky.cryptoJs

import typingsSlinky.cryptoJs.mod.LibWordArray
import typingsSlinky.cryptoJs.mod.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  def create(v: js.Any): LibWordArray = js.native
  def random(v: Double): WordArray = js.native
}

object AnonCreate {
  @scala.inline
  def apply(create: js.Any => LibWordArray, random: Double => WordArray): AnonCreate = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
    __obj.asInstanceOf[AnonCreate]
  }
  @scala.inline
  implicit class AnonCreateOps[Self <: AnonCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: js.Any => LibWordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRandom(value: Double => WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

