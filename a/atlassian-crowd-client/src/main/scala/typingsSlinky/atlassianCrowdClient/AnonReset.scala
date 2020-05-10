package typingsSlinky.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReset extends js.Object {
  def reset(username: String): js.Promise[Unit] = js.native
  def set(username: String, password: String): js.Promise[Unit] = js.native
}

object AnonReset {
  @scala.inline
  def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): AnonReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AnonReset]
  }
  @scala.inline
  implicit class AnonResetOps[Self <: AnonReset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

