package typingsSlinky.restler.mod

import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for restler result.
  * @interface
  */
@js.native
trait RestlerResult extends js.Object {
  /**
    * Adds the listener function to the end of the listeners array for the event named eventName.
    * @param {string}    eventName   The name of the event.
    * @param {Function}  listener    The callback function
    */
  def on(
    eventName: String,
    listener: js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]
  ): RestlerResult = js.native
}

object RestlerResult {
  @scala.inline
  def apply(
    on: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => RestlerResult
  ): RestlerResult = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[RestlerResult]
  }
  @scala.inline
  implicit class RestlerResultOps[Self <: RestlerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(
      value: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => RestlerResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

