package typingsSlinky.detox.adapterMod

import typingsSlinky.detox.mod.global.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetoxJestAdapter extends js.Object {
  var detox: Detox = js.native
  def afterAll(): js.Promise[Unit] = js.native
  def beforeEach(): js.Promise[Unit] = js.native
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def specDone(): Unit = js.native
  def specStarted(): Unit = js.native
}

object DetoxJestAdapter {
  @scala.inline
  def apply(
    afterAll: () => js.Promise[Unit],
    beforeEach: () => js.Promise[Unit],
    detox: Detox,
    specDone: () => Unit,
    specStarted: () => Unit
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction0(afterAll), beforeEach = js.Any.fromFunction0(beforeEach), detox = detox.asInstanceOf[js.Any], specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted))
    __obj.asInstanceOf[DetoxJestAdapter]
  }
  @scala.inline
  implicit class DetoxJestAdapterOps[Self <: DetoxJestAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAll(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeEach(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetox(value: Detox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpecStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specStarted")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

