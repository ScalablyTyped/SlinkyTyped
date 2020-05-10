package typingsSlinky.ramda.toolsMod

import typingsSlinky.ramda.ramdaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduced[A] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: `true` = js.native
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: A = js.native
}

object Reduced {
  @scala.inline
  def apply[A](`@@transducerSlashreduced`: `true`, `@@transducerSlashvalue`: A): Reduced[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[A]]
  }
  @scala.inline
  implicit class ReducedOps[Self[a] <: Reduced[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def `with@@transducerSlashreduced`(value: `true`): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/reduced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with@@transducerSlashvalue`(value: A): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

