package typingsSlinky.reactRouterNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[js.Function] = js.native
  var initialEntries: js.UndefOr[js.Array[String]] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var keyLength: js.UndefOr[Double] = js.native
}

object NativeRouterProps {
  @scala.inline
  def apply(): NativeRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeRouterProps]
  }
  @scala.inline
  implicit class NativeRouterPropsOps[Self <: NativeRouterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUserConfirmation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetUserConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialEntries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(js.undefined)
        ret
    }
  }
  
}

