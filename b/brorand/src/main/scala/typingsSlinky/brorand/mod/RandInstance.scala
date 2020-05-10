package typingsSlinky.brorand.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandInstance extends js.Object {
  var rand: typingsSlinky.brorand.mod.rand = js.native
  def generate(len: Double): Buffer | js.typedarray.Uint8Array = js.native
}

object RandInstance {
  @scala.inline
  def apply(generate: Double => Buffer | js.typedarray.Uint8Array, rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandInstance]
  }
  @scala.inline
  implicit class RandInstanceOps[Self <: RandInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerate(value: Double => Buffer | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRand(value: rand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

