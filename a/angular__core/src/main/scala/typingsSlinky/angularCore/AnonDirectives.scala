package typingsSlinky.angularCore

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirectives extends js.Object {
  var directives: Set[_] = js.native
  var pipes: Set[_] = js.native
}

object AnonDirectives {
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): AnonDirectives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectives]
  }
  @scala.inline
  implicit class AnonDirectivesOps[Self <: AnonDirectives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: Set[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipes(value: Set[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

