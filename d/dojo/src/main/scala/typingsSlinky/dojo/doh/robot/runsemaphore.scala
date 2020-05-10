package typingsSlinky.dojo.doh.robot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/robot._runsemaphore.html
  *
  *
  */
@js.native
trait runsemaphore extends js.Object {
  /**
    *
    */
  var lock: js.Array[_] = js.native
  /**
    *
    */
  def unlock(): js.Any = js.native
}

object runsemaphore {
  @scala.inline
  def apply(lock: js.Array[_], unlock: () => js.Any): runsemaphore = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any], unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[runsemaphore]
  }
  @scala.inline
  implicit class runsemaphoreOps[Self <: runsemaphore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLock(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlock(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

