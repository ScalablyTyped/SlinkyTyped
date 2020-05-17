package typingsSlinky.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCapabilities[T] extends js.Object {
  var mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe = js.native
}

object MediaCapabilities {
  @scala.inline
  def apply[T](mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe): MediaCapabilities[T] = {
    val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilities[T]]
  }
  @scala.inline
  implicit class MediaCapabilitiesOps[Self[t] <: MediaCapabilities[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMediaCapabilities(value: (HasMediaConfig with T) | hasMediaConfigundefinedMe): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

