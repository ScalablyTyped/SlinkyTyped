package typingsSlinky.detox.mochaAdapterMod

import typingsSlinky.detox.mod.global.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetoxMochaAdapter extends js.Object {
  var detox: Detox = js.native
  def afterEach(context: js.Any): js.Promise[Unit] = js.native
  def beforeEach(context: js.Any): js.Promise[Unit] = js.native
}

object DetoxMochaAdapter {
  @scala.inline
  def apply(afterEach: js.Any => js.Promise[Unit], beforeEach: js.Any => js.Promise[Unit], detox: Detox): DetoxMochaAdapter = {
    val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach), detox = detox.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxMochaAdapter]
  }
  @scala.inline
  implicit class DetoxMochaAdapterOps[Self <: DetoxMochaAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterEach(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeEach(value: js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetox(value: Detox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

