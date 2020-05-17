package typingsSlinky.reactNoSsr.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.native
}

object OnSSR {
  @scala.inline
  def apply(): OnSSR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSSR]
  }
  @scala.inline
  implicit class OnSSROps[Self <: OnSSR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSSRReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSSR(value: ReactChild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSSR")(js.undefined)
        ret
    }
  }
  
}

