package typingsSlinky.expo.anon

import typingsSlinky.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnError extends Props {
  var onError: Null = js.native
  var onFinish: Null = js.native
  var startAsync: Null = js.native
}

object OnError {
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFinish(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAsync(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAsync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

