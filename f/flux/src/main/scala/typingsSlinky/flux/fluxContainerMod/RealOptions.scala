package typingsSlinky.flux.fluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealOptions extends js.Object {
  /** @default true */
  var pure: js.UndefOr[Boolean] = js.native
  /** @default false */
  var withContext: js.UndefOr[Boolean] = js.native
  /** @default false */
  var withProps: js.UndefOr[Boolean] = js.native
}

object RealOptions {
  @scala.inline
  def apply(): RealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealOptions]
  }
  @scala.inline
  implicit class RealOptionsOps[Self <: RealOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
    @scala.inline
    def withWithContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContext")(js.undefined)
        ret
    }
    @scala.inline
    def withWithProps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withProps")(js.undefined)
        ret
    }
  }
  
}

