package typingsSlinky.dispatchr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherOption extends js.Object {
  var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.native
  var stores: js.UndefOr[js.Array[StoreClass]] = js.native
}

object DispatcherOption {
  @scala.inline
  def apply(): DispatcherOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOption]
  }
  @scala.inline
  implicit class DispatcherOptionOps[Self <: DispatcherOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorHandler(value: (/* e */ DispatcherError, /* context */ DispatcherContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: js.Array[StoreClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
  }
  
}

