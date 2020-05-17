package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait CountLimiter extends js.Object {
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  def allowedToUpload(): Boolean = js.native
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  def beginFrame(): Unit = js.native
}

object CountLimiter {
  @scala.inline
  def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): CountLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[CountLimiter]
  }
  @scala.inline
  implicit class CountLimiterOps[Self <: CountLimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedToUpload(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedToUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeginFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginFrame")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

