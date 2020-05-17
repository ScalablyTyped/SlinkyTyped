package typingsSlinky.jestJasmine2.anon

import typingsSlinky.jestJasmine2.queueRunnerMod.QueueableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Afters extends js.Object {
  var afters: js.Array[QueueableFn] = js.native
  var befores: js.Array[QueueableFn] = js.native
}

object Afters {
  @scala.inline
  def apply(afters: js.Array[QueueableFn], befores: js.Array[QueueableFn]): Afters = {
    val __obj = js.Dynamic.literal(afters = afters.asInstanceOf[js.Any], befores = befores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Afters]
  }
  @scala.inline
  implicit class AftersOps[Self <: Afters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfters(value: js.Array[QueueableFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefores(value: js.Array[QueueableFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("befores")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

