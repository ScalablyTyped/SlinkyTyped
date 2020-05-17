package typingsSlinky.nock.anon

import typingsSlinky.nock.mod.BackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: BackContext = js.native
  def nockDone(): Unit = js.native
}

object Context {
  @scala.inline
  def apply(context: BackContext, nockDone: () => Unit): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], nockDone = js.Any.fromFunction0(nockDone))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: BackContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNockDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nockDone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

