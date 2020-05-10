package typingsSlinky.radium.mod.Radium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Radium 0.17 Test mode
/**
  * Used to control internal Radium state and behavior during tests. It is only available in non-production builds.
  */
@js.native
trait RadiumTestMode extends js.Object {
  /**
    * Clears the global Radium state, currently only the cache of media query listeners.
    */
  def clearState(): Unit = js.native
  /**
    * Disables "test mode"
    */
  def disable(): Unit = js.native
  /**
    * Enables "test mode", which doesn’t throw or warn as much. Currently it just doesn’t throw when using addCSS without StyleRoot.
    */
  def enable(): Unit = js.native
}

object RadiumTestMode {
  @scala.inline
  def apply(clearState: () => Unit, disable: () => Unit, enable: () => Unit): RadiumTestMode = {
    val __obj = js.Dynamic.literal(clearState = js.Any.fromFunction0(clearState), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[RadiumTestMode]
  }
  @scala.inline
  implicit class RadiumTestModeOps[Self <: RadiumTestMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearState(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

