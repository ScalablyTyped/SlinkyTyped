package typingsSlinky.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMediaCapabilities[T] extends js.Object {
  var mediaCapabilities: (AnonHasMediaConfig with T) | hasMediaConfigundefinedMe = js.native
}

object AnonMediaCapabilities {
  @scala.inline
  def apply[T](mediaCapabilities: (AnonHasMediaConfig with T) | hasMediaConfigundefinedMe): AnonMediaCapabilities[T] = {
    val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaCapabilities[T]]
  }
  @scala.inline
  implicit class AnonMediaCapabilitiesOps[Self[t] <: AnonMediaCapabilities[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMediaCapabilities(value: (AnonHasMediaConfig with T) | hasMediaConfigundefinedMe): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

