package typingsSlinky.reactNoSsr

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.native
}

object AnonOnSSR {
  @scala.inline
  def apply(): AnonOnSSR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnSSR]
  }
  @scala.inline
  implicit class AnonOnSSROps[Self <: AnonOnSSR] (val x: Self) extends AnyVal {
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

