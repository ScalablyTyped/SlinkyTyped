package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoot extends js.Object {
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
}

object IBoot {
  @scala.inline
  def apply(): IBoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoot]
  }
  @scala.inline
  implicit class IBootOps[Self <: IBoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeClose(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigDidLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDidLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConfigDidLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDidLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigWillLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configWillLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConfigWillLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configWillLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDidLoad(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDidLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDidReady(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDidReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didReady")(js.undefined)
        ret
    }
    @scala.inline
    def withServerDidReady(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDidReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutServerDidReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDidReady")(js.undefined)
        ret
    }
    @scala.inline
    def withWillReady(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWillReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willReady")(js.undefined)
        ret
    }
  }
  
}

