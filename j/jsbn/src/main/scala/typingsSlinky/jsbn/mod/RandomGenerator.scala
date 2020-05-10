package typingsSlinky.jsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomGenerator extends js.Object {
  def nextBytes(bytes: js.Array[Double]): Unit = js.native
}

object RandomGenerator {
  @scala.inline
  def apply(nextBytes: js.Array[Double] => Unit): RandomGenerator = {
    val __obj = js.Dynamic.literal(nextBytes = js.Any.fromFunction1(nextBytes))
    __obj.asInstanceOf[RandomGenerator]
  }
  @scala.inline
  implicit class RandomGeneratorOps[Self <: RandomGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextBytes(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBytes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

