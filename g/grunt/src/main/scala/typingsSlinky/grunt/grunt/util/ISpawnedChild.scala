package typingsSlinky.grunt.grunt.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/snbartell/node-spawn}
  */
@js.native
trait ISpawnedChild extends js.Object {
  /**
    * Convenience function. Overrides options.restarts to -1.
    * Runs command indefinitely no matter the options passed into the constructor.
    */
  def forever(): Unit = js.native
  /**
    * Shut down the child and don't let it restart.
    */
  def kill(): Unit = js.native
  /**
    * Convenience function. Overrides options. restarts to 0.
    * Runs command exactly once no matter the options passed into the constructor.
    */
  def once(): Unit = js.native
  /**
    * Start the cmd with the options provided.
    */
  def start(): Unit = js.native
}

object ISpawnedChild {
  @scala.inline
  def apply(forever: () => Unit, kill: () => Unit, once: () => Unit, start: () => Unit): ISpawnedChild = {
    val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), kill = js.Any.fromFunction0(kill), once = js.Any.fromFunction0(once), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ISpawnedChild]
  }
  @scala.inline
  implicit class ISpawnedChildOps[Self <: ISpawnedChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForever(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnce(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

