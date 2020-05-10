package typingsSlinky.jasmineNode.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var defaultTimeoutInterval: Double = js.native
}

object Env {
  @scala.inline
  def apply(defaultTimeoutInterval: Double): Env = {
    val __obj = js.Dynamic.literal(defaultTimeoutInterval = defaultTimeoutInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTimeoutInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeoutInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

