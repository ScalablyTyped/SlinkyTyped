package typingsSlinky.dispatchr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherState extends js.Object {
  var stores: StringDictionary[js.Any] = js.native
}

object DispatcherState {
  @scala.inline
  def apply(stores: StringDictionary[js.Any]): DispatcherState = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherState]
  }
  @scala.inline
  implicit class DispatcherStateOps[Self <: DispatcherState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStores(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

