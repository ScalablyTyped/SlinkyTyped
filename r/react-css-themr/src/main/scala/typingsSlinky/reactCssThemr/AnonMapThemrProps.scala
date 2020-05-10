package typingsSlinky.reactCssThemr

import typingsSlinky.reactCssThemr.mod.TMapThemrProps
import typingsSlinky.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMapThemrProps[P] extends js.Object {
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.native
}

object AnonMapThemrProps {
  @scala.inline
  def apply[P](): AnonMapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMapThemrProps[P]]
  }
  @scala.inline
  implicit class AnonMapThemrPropsOps[Self[p] <: AnonMapThemrProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withMapThemrProps(value: (P, /* theme */ TReactCSSThemrTheme) => P with AnonTheme): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapThemrProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMapThemrProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapThemrProps")(js.undefined)
        ret
    }
  }
  
}

